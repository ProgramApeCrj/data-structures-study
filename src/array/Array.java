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
}


