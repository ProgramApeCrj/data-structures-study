package array;

public class Array {
    
    private int[] data; // 存放的数组
    private int size; // 当前容量
    
    /**
     * 用户能确定大概容量时的构造函数
     * 传入数组的容量capacity来构造Array
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }
    
    /**
     * 用户无法确定数组容量大小的时候使用
     * 默认最大容量为10
     */
    public Array() {
        this(10); 
    }
    
    
}
