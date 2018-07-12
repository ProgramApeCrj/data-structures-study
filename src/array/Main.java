package array;

public class Main {
    public static void main(String[] args) {
        
        Array arr = new Array(20);
        for(int i = 0 ;i < 10; i++) {
           arr.addLast(i);
        }
        System.out.println(arr);
        
        arr.add(1, 100);
        
        System.out.println(arr);
        
        arr.addFirst(666);
       
        System.out.println(arr);
        
        arr.set(0, 888);
        System.out.println(arr.get(0));
        System.out.println(arr);
        
        arr.set(100, 888);
   
    }
}
