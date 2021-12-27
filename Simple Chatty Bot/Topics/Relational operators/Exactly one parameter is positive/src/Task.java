import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        int inputC = scanner.nextInt();
        if (inputA > 0 && inputB <= 0 && inputC <= 0) {
            System.out.println("true");
        } else if (inputA <= 0 && inputB > 0 && inputC <= 0) {
            System.out.println("true");
        } else if (inputA <= 0 && inputB <= 0 && inputC > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
