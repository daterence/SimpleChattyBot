// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        float sum = 0;
        for (int i = a; i <= b; i++){
            if (i % 3 == 0){
                count++;
                sum += i;
            }
        }
        System.out.println(sum / count);
    }
}
