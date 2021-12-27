// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = str1.replace(" ", "").trim();
        str2 = str2.replace(" ", "").trim();
        System.out.println(str1.equals(str2));
    }
}
