package array;

public class Array {
    
    private int[] data; // 存放的数组
    private int size; // 当前数组以存放的元素个数
    
    /**
     * 用户能确定大概容量时的构造函数
     * 传入数组的最大容量capacity来构造Array
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
    
    /**
     * 获取数组中元素个数
     * @return
     */
    public int getSize() {
        return size;
    }
    
    /**
     * 获取数组的最大容量值
     * @return
     */
    public int getCapacity() {
        return data.length;
    }
    
    /**
     * 该数组是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * 在所有的元素后面再添加一个
     * @param e
     */
    public void addLast(int e) {
        
        add(size,e);
    }
   
    /**
     * 在有的元素前面再添加一个
     * @param e
     */
    public void addFirst(int e) {
     
        add(0,e);
    }
    
    /**
     * 在指定位置插入数据
     * @param index
     * @param e
     */
    public void add(int index, int e) {
        
        if(size == data.length){
            throw new IllegalArgumentException("Add failed. Because Array is full.");
        }
        
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Index must >= 0 or <=size");
        }
        
        for(int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        
        data[index] = e;
        size ++;
    }
    
    /**
     * 获得指定下标的值
     * 通过封装, 保证用户永远无法返回未使用的空间
     * @param index
     * @return
     */
    public int get(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }
    
    /**
     * 更改指定下标的数组的值
     * @param index
     * @param e
     */
    public void set(int index, int e) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }
    
    /**
     * 判断是否数组中是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(int e) {
        for(int i = 0; i < size; i++) {
            if(data[i] == e) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回指定元素在数组的下标, 如果没有, 返回-1
     * @param e
     * @return
     */
    public int find(int e) {
        for(int i = 0; i < size; i++) {
            if(data[i] == e) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0; i< size ; i++){
            res.append(data[i]);
            if(i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}


