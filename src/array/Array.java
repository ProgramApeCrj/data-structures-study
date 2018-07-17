package array;

public class Array<E> {
    
    private E[] data; // 存放的数组
    private int size; // 当前数组以存放的元素个数
    
    /**
     * 用户能确定大概容量时的构造函数
     * 传入数组的最大容量capacity来构造Array
     * @param capacity
     */
    @SuppressWarnings("unchecked")
    public Array(int capacity) {
        data = (E[])new Object[capacity];
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
    public void addLast(E e) {
        
        add(size,e);
    }
   
    /**
     * 在有的元素前面再添加一个
     * @param e
     */
    public void addFirst(E e) {
     
        add(0,e);
    }
    
    /**
     * 在指定位置插入数据
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        
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
    public E get(int index) {
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
    public void set(int index, E e) {
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
    public boolean contains(E e) {
        for(int i = 0; i < size; i++) {
            if(data[i].equals(e)) {
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
    public int find(E e) {
        for(int i = 0; i < size; i++) {
            if(data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * 删除index下标的元素， 并返回删除的元素
     * @param index
     * @return
     */
    public E remove (int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        E ret = data[index];
        for(int i = index + 1; i < size; i++ ) {
            data[i - 1] = data [i];
        }
        size --;
        data[size] = null; // 垃圾回收
        return ret;
    }
    
    /**
     * 删除第一个元素
     * 数组为null的话，调用remove办法会抛异常，所以这里不需要判断
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }
    
    /**
     * 删除最后一个元素
     * 数组为null的话，调用remove办法会抛异常，所以这里不需要判断
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }
    
    /**
     * 删除指定元素（根据内容）
     * 并告诉调用者是否删除成功
     * （不足之处，存在多个相同e时候，只会删除第一个）
     * @param e
     */
    public boolean removeElement(E e) {
        int index = find(e);
        if(index != -1) {
            remove(index);
            return true;
        }
        return false;
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


