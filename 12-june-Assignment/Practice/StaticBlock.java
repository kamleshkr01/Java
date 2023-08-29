
/*Write a program which has static block and constructor overloading,initialise variables
using constructors and print it. */
import java.util.stream.Stream;

public class StaticBlock {

	public String name;
	public int age;

	public StaticBlock() {
		System.out.println("No arg constructor");
	}

	public StaticBlock(int age) {
		super();
		this.age = age;
	}

	public StaticBlock(String name) {
		super();
		this.name = name;
	}

	public StaticBlock(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "StaticBlock [name=" + name + ", age=" + age + "]";
	}

	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		StaticBlock block = new StaticBlock(37);
		System.out.println(block.age);
		StaticBlock block2 = new StaticBlock("rahul");
		System.out.println(block2.name);
		StaticBlock block3 = new StaticBlock("kamlesh", 78);
		System.out.println(block3.toString());
	}
}