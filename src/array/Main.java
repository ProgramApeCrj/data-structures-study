package array;

public class Main {
    public static void main(String[] args) {
        
        Array<String> arr = new Array(20);
        for(int i = 0 ;i < 10; i++) {
           arr.addLast(String.valueOf(i));
        }
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        
        arr.remove(3);
        System.out.println(arr);

        arr.removeElement("6");
        System.out.println(arr);

    }
}
