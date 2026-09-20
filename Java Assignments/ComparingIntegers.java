import java.util.Scanner;
public class ComparingIntegers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the integer: ");
    int firstInteger = input.nextInt();
    
    System.out.print("Enter the integer: ");
    int secondInteger = input.nextInt();
    
    System.out.print("Enter the integer: ");
    int thirdInteger = input.nextInt();
    
      int largest = firstInteger;
      
      if(largest > secondInteger) {
      }
          System.out.println(largest);
      if(largest > thirdInteger) {
          System.out.println(largest);
      }
      else {
          System.out.println("Not the largest.");
      }
  }
}
