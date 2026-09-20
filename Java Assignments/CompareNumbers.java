import java.util.Scanner;
public class CompareNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int firstNumber = input.nextInt();
    
    System.out.print("Enter the number: ");
    int secondNumber = input.nextInt();
    
    if(secondNumber != 0) {
      int result = firstNumber / secondNumber;
       System.out.println("Result: " + result);
    }
    else {
      System.out.println("Cannot divide by zero");
          }
    }
}
