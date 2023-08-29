/*Use a private keyword for a variable and use setter and getter methods to initialise and
print the values. */

public class Student2 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student2 std1 = new Student2();
        std1.setName("Sonu");
        std1.setAge(20);

        Student2 std2 = new Student2();
        std2.setName("Pritam");
        std2.setAge(22);

        System.out.println("Student 1: Name - " + std1.getName() + ", Age - " + std1.getAge());
        System.out.println("Student 2: Name - " + std2.getName() + ", Age - " + std2.getAge());
    }
}
