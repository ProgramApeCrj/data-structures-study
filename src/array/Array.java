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
   
}


