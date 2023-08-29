/*Write a program and create a constructor with parameters and initialise the variable using
a constructor. */

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rakesh", 29);
        Student student2 = new Student("Kamlesh", 23);

        System.out.println("Student 1: Name - " + student1.getName() + ", Age - " + student1.getAge());
        System.out.println("Student 2: Name - " + student2.getName() + ", Age - " + student2.getAge());
    }
}
