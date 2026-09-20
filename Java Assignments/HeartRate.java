import java.util.Scanner;
public class HeartRate {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      System.out.print("Enter your age: ");
      int userAge = input.nextInt();
      
      int bmp = 220;
        int maximumHeartRate = bmp - userAge;
        double targetLowHeartRate = maximumHeartRate * 50 / 100;
        double targetHighHeartRate = maximumHeartRate * 85 / 100;
        
        System.out.println("Maximum Heart Rate is " + maximumHeartRate);
         System.out.println("Target Low Heart Rate is " + targetLowHeartRate);
          System.out.println("Target High Heart Rate is " + targetHighHeartRate);
        }
  }
