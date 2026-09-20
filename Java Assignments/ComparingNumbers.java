import java.util.Scanner;
public class ComparingNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int numberOne = input.nextInt();
    
    System.out.print("Enter the number: ");
    int numberTwo = input.nextInt();
    
    System.out.print("Enter the number: ");
    int numberThree = input.nextInt();
    
    System.out.print("Enter the number: ");
    int numberFour = input.nextInt();
    
    System.out.print("Enter the number: ");
    int numberFive = input.nextInt();
    
       int high = numberOne;
       int low = numberOne;
       
       if(numberTwo > high)
        high = numberTwo;
       if(numberThree > high)
        high = numberThree;
       if(numberFour > high)
        high = numberFour;
       if(numberFive > high)
        high = numberFive;
        
      if(numberTwo < low)
        low = numberTwo;
      if(numberThree < low)
        low = numberThree;
      if(numberFour < low)
        low = numberFour;
      if(numberFive < low)
        low = numberFive;
        
  System.out.println("High: " + high);
  System.out.println("Low: " + low);
    }
}
