package array;

public class Array {
    
    private int[] data; // ��ŵ�����
    private int size; // ��ǰ����
    
    /**
     * �û���ȷ���������ʱ�Ĺ��캯��
     * �������������capacity������Array
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
    
    
}
