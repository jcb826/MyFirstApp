public class ComparingValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);  // Output: true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);  // Output: false

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3.equals(str4));  // Output: true
    }
}
