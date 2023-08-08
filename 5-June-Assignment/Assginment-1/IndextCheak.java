
public class IndextCheak {
    public static void main(String[] args) {
        String str = "Hello Dear ! How are you";
        int intIndex = str.indexOf("are");

        if (intIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + intIndex);
        }
    }
}