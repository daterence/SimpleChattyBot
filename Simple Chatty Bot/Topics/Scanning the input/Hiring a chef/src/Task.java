// write your answer here 

import java.util.Scanner;

class Task {
  public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int yearsOfExp = scanner.nextInt();
    scanner.nextLine();
    String cuisine = scanner.nextLine();

    System.out.println("The form for " + name + " is completed. We will contact you" +
            " if we need a chef who cooks " + cuisine + " dishes and has " + yearsOfExp + " years of experience. ");
  }
}
