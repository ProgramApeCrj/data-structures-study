package array;

public class Array<E> {
    
    private E[] data; // ��ŵ�����
    private int size; // ��ǰ�����Դ�ŵ�Ԫ�ظ���
    
    /**
     * �û���ȷ���������ʱ�Ĺ��캯��
     * ����������������capacity������Array
     * @param capacity
     */
    @SuppressWarnings("unchecked")
    public Array(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }
    
    /**
     * �û��޷�ȷ������������С��ʱ��ʹ��
     * Ĭ���������Ϊ10
     */
    public Array() {
        this(10); 
    }
    
    /**
     * ��ȡ������Ԫ�ظ���
     * @return
     */
    public int getSize() {
        return size;
    }
    
    /**
     * ��ȡ������������ֵ
     * @return
     */
    public int getCapacity() {
        return data.length;
    }
    
    /**
     * �������Ƿ�Ϊ��
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * �����е�Ԫ�غ��������һ��
     * @param e
     */
    public void addLast(E e) {
        
        add(size,e);
    }
   
    /**
     * ���е�Ԫ��ǰ�������һ��
     * @param e
     */
    public void addFirst(E e) {
     
        add(0,e);
    }
    
    /**
     * ��ָ��λ�ò�������
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
     * ���ָ���±��ֵ
     * ͨ����װ, ��֤�û���Զ�޷�����δʹ�õĿռ�
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
     * ����ָ���±�������ֵ
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
     * �ж��Ƿ��������Ƿ����Ԫ��e
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
     * ����ָ��Ԫ����������±�, ���û��, ����-1
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
     * ɾ��index�±��Ԫ�أ� ������ɾ����Ԫ��
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
        data[size] = null; // ��������
        return ret;
    }
    
    /**
     * ɾ����һ��Ԫ��
     * ����Ϊnull�Ļ�������remove�취�����쳣���������ﲻ��Ҫ�ж�
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }
    
    /**
     * ɾ�����һ��Ԫ��
     * ����Ϊnull�Ļ�������remove�취�����쳣���������ﲻ��Ҫ�ж�
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }
    
    /**
     * ɾ��ָ��Ԫ�أ��������ݣ�
     * �����ߵ������Ƿ�ɾ���ɹ�
     * ������֮�������ڶ����ͬeʱ��ֻ��ɾ����һ����
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


