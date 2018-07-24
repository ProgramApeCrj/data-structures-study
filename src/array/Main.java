package array;

public class Main {
    public static void main(String[] args) {
        
        Array<String> arr = new Array(10);
        for(int i = 0 ;i < 10; i++) {
           arr.addLast(String.valueOf(i));
        }
        System.out.println(arr);
        arr.removeLast();
        arr.removeLast();
        System.out.println(arr);
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        System.out.println(arr);
        arr.addLast("886");
        System.out.println(arr);

    }
}
