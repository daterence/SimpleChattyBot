import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int firstHour   = scanner.nextInt();
        final int firstMinute = scanner.nextInt();
        final int firstSecond = scanner.nextInt();
        final int lastHour    = scanner.nextInt();
        final int lastMinute  = scanner.nextInt();
        final int lastSecond  = scanner.nextInt();
        final int secondsInMinute = 60;
        final int secondsInHour = 3600;
        
        int totalSeconds = (lastSecond - firstSecond) 
                         + secondsInMinute * (lastMinute - firstMinute)
                         + secondsInHour * (lastHour - firstHour);
        System.out.println(totalSeconds);
    }
}
