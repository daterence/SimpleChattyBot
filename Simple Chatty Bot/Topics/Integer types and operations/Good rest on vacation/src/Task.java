// write your answer here 

import java.util.Scanner;

class Task {
  public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);
    int duration = scanner.nextInt();
    int foodCost = scanner.nextInt();
    int oneWayFlight = scanner.nextInt();
    int hotel = scanner.nextInt();

    System.out.println((duration*foodCost) + 2*oneWayFlight + ((duration - 1) * hotel));
  }
}
