/**
 *
 */
public class class_04_swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;

        System.out.println("source variables: " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("swapped variables: " + a + " and " + b);
    }
}
