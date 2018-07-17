package array;

public class Student {
    private String name;
    private int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score =score;
    }
    
    @Override
    public String toString() {
        return String.format("student(name: %s, score: %d)", name , score);
    }
    
    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Tom",100));
        arr.addLast(new Student("Bob",99));
        arr.addLast(new Student("Jack",88));
        
        System.out.println(arr);
    }
}
