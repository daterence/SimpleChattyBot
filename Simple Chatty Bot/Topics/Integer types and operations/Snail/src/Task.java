// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (h+a-2*b-1) / (a-b);
        System.out.println(result);
    }
}
