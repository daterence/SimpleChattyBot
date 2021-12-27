// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        System.out.println(((h1 >= h2 && h2 >= h3) || (h1 <= h2 && h2 <= h3)));
    }
}
