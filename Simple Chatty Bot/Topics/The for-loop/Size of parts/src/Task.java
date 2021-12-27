import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int fix = 0;
        int ship = 0;
        int reject = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number == -1) {
                reject++;
            } else if (number == 0) {
                ship++;
            } else {
                fix++;
            }
        }
        System.out.println(ship + " " + fix + " " + reject);
    }
}
