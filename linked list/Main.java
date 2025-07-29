public class Main {
    public static int add(int a, int b) {
        while (b != 0) {
            // Calculate carry
            int carry = a & b;

            // Sum without carry
            a = a ^ b;

            // Shift carry left
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 15; // Example number 1
        int num2 = 25; // Example number 2

        System.out.println("Sum: " + add(num1, num2));
    }
}
