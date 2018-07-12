package array;

public class Array {
    
    private int[] data; // ��ŵ�����
    private int size; // ��ǰ�����Դ�ŵ�Ԫ�ظ���
    
    /**
     * �û���ȷ���������ʱ�Ĺ��캯��
     * ����������������capacity������Array
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
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
    public void addLast(int e) {
        
        add(size,e);
    }
   
    /**
     * ���е�Ԫ��ǰ�������һ��
     * @param e
     */
    public void addFirst(int e) {
     
        add(0,e);
    }
    
    /**
     * ��ָ��λ�ò�������
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
     * ���ָ���±��ֵ
     * ͨ����װ, ��֤�û���Զ�޷�����δʹ�õĿռ�
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
     * ����ָ���±�������ֵ
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
     * �ж��Ƿ��������Ƿ����Ԫ��e
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
     * ����ָ��Ԫ����������±�, ���û��, ����-1
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


