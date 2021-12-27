// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //N segments in length
        int n = scanner.nextInt();
        //M segments in length
        int m = scanner.nextInt();
        //k segments to break off
        int k = scanner.nextInt();
        if (k % n == 0 && k / n < m || k % m == 0 && k /m < n){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
