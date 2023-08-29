/*1.Create a class that keeps track of the number of instances created. Implement a static
variable and method to accomplish this.*/
public class kk1 {
	private static int instanceCount = 0;

	public kk1() {
		instanceCount++;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}

	public static void main(String[] args) {
		kk1 c1 = new kk1();
		kk1 c2 = new kk1();
		kk1 c3 = new kk1();
		kk1 c4 = new kk1();
		System.out.println("Total Number of Instances Created: " + kk1.getInstanceCount());
	}
}