/*Write a java program to  a particular character from a String. */
public class RemoveChar {
	public static void main(String args[]) {
		String str = "Welcome to PW-Skill";
		System.out.println(removeCharAt(str, 2));
	}

	public static String removeCharAt(String k, int pos) {
		return k.substring(0, pos) + k.substring(pos + 1);
	}
}