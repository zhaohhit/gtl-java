package cn.edu.cug.cs.gtl.series.common.pax;

import cn.edu.cug.cs.gtl.io.Storable;
import org.jetbrains.annotations.NotNull;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class TIOPoints implements Storable, List<TIOPoint> {
    List<TIOPoint> points = new ArrayList<>();

    /**
     *
     * @return
     */
    public static TIOPoints of(){
        TIOPoints s = new TIOPoints();
        return s;
    }

    /**
     * create a new Series Object from a byte array,
     * this byte array must be generated by storeToByteArray() function
     * @param bytes
     * @return
     * @throws IOException
     */
    public static TIOPoints of(byte[] bytes) throws IOException{
        TIOPoints s = new TIOPoints();
        s.loadFromByteArray(bytes);
        return s;
    }

    /**
     * create a new Series Object from a input stream,
     * it must be generated by write() function
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static TIOPoints of(InputStream inputStream) throws IOException{
        TIOPoints s = new TIOPoints();
        s.read(inputStream);
        return s;
    }

    TIOPoints(){

    }

    /**
     * 对象深拷贝
     *
     * @return 返回新的对象
     */
    @Override
    public Object clone() {
        TIOPoints tioPoints = new TIOPoints();
        for(TIOPoint p: points){
            tioPoints.points.add((TIOPoint) p.clone());
        }
        return tioPoints;
    }

    /**
     * 从存储对象中加载数据，填充本对象
     *
     * @param in 表示可以读取的存储对象，可能是内存、文件、管道等
     * @return 执行成功返回true，否则返回false
     * @throws IOException
     */
    @Override
    public boolean load(DataInput in) throws IOException {
        points.clear();
        int s = in.readInt();
        for(int i=0;i<s;++i){
            TIOPoint tioPoint = new TIOPoint();
            tioPoint.load(in);
            points.add(tioPoint);
        }
        return true;
    }

    /**
     * 将本对象写入存储对象中，存储对象可能是内存、文件、管道等
     *
     * @param out ，表示可以写入的存储对象，可能是内存、文件、管道等
     * @return 执行成功返回true，否则返回false
     * @throws IOException
     */
    @Override
    public boolean store(DataOutput out) throws IOException {

        int s = points.size();
        out.writeInt(s);
        for(TIOPoint p: points){
             p.store(out);
        }
        return true;
    }

    @Override
    public int size() {
        return points.size();
    }

    @Override
    public boolean isEmpty() {
        return points.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return points.contains(o);
    }

    @NotNull
    @Override
    public Iterator<TIOPoint> iterator() {
        return points.iterator();
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return points.toArray();
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] ts) {
        return points.toArray(ts);
    }

    @Override
    public boolean add(TIOPoint tioPoint) {
        return points.add(tioPoint);
    }

    @Override
    public boolean remove(Object o) {
        return points.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> collection) {
        return points.contains(collection);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends TIOPoint> collection) {
        return points.addAll(collection);
    }

    @Override
    public boolean addAll(int i, @NotNull Collection<? extends TIOPoint> collection) {
        return points.addAll(i,collection);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> collection) {
        return points.removeAll(collection);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> collection) {
        return points.retainAll(collection);
    }

    @Override
    public void clear() {
        points.clear();
    }

    @Override
    public TIOPoint get(int i) {
        return points.get(i);
    }

    @Override
    public TIOPoint set(int i, TIOPoint tioPoint) {
        return points.set(i,tioPoint);
    }

    @Override
    public void add(int i, TIOPoint tioPoint) {
        points.add(i,tioPoint);
    }

    @Override
    public TIOPoint remove(int i) {
        return points.remove(i);
    }

    @Override
    public int indexOf(Object o) {
        return points.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return points.lastIndexOf(o);
    }

    @NotNull
    @Override
    public ListIterator<TIOPoint> listIterator() {
        return points.listIterator();
    }

    @NotNull
    @Override
    public ListIterator<TIOPoint> listIterator(int i) {
        return points.listIterator(i);
    }

    @NotNull
    @Override
    public List<TIOPoint> subList(int i, int i1) {
        return points.subList(i,i1);
    }
}
