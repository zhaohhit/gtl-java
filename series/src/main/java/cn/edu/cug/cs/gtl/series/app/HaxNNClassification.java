package cn.edu.cug.cs.gtl.series.app;
import cn.edu.cug.cs.gtl.common.Pair;
import cn.edu.cug.cs.gtl.io.File;
import cn.edu.cug.cs.gtl.ml.classification.NNClassifier;
import cn.edu.cug.cs.gtl.ml.dataset.TestSet;
import cn.edu.cug.cs.gtl.ml.dataset.TrainSet;
import cn.edu.cug.cs.gtl.series.common.MultiSeries;
import cn.edu.cug.cs.gtl.series.common.Series;
import cn.edu.cug.cs.gtl.series.common.TimeSeries;
import cn.edu.cug.cs.gtl.series.common.pax.TIOPlane;
import cn.edu.cug.cs.gtl.series.distances.HaxDistanceMetrics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HaxNNClassification {
    public static void main(String[] args){
        ExperimentalConfig config = new ExperimentalConfig();
        int m=config.getDataFiles().size();
        int n=config.getPaaSizeRange().second()-config.getPaaSizeRange().first();
        List<Pair<String,double[]> > results = new ArrayList<>();
        int k=0;
        config.setResultFileName("hax_nn.xls");
        try{
            for (Pair<String,String> p: config.getDataFiles()){
                String name = File.getFileNameWithoutSuffix(p.first());
                name=name.substring(0,name.indexOf('_'));
                MultiSeries train= Series.readTSV(p.first());
                MultiSeries test=Series.readTSV(p.second());
                TrainSet<TimeSeries,String> trainSet=train.toTrainSet();
                TestSet<TimeSeries,String> testSet=test.toTestSet();
                TIOPlane tioPlane = TIOPlane.of(Math.min(train.min(),test.min()),
                        Math.max(train.max(),test.max()));
                Pair<Integer,Integer> paaSizeRange = config.getPaaSizeRange();
                double[] r = new double[n];
                k=0;
                for(int i=paaSizeRange.first();i<paaSizeRange.second();++i){
                    HaxDistanceMetrics<TimeSeries> disFunc = new HaxDistanceMetrics<>(i,tioPlane);
                    NNClassifier<TimeSeries,String> nnClassifier=new NNClassifier<>(trainSet,testSet,disFunc);
                    r[k]=nnClassifier.score(); k++;
                }
                results.add(new Pair<>(name,r));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        config.writeResults(results);
    }


}
