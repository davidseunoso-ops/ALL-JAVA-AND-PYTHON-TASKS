import java.util.Scanner;
public class CollectionOfNumbers {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    
    int[] listOfNumbers = new int[5];
    for (int index = 0; index < 5; index++) {
        System.out.println("Enter the numbers " + (index+1) + ": ");
        listOfNumbers[index] = input.nextInt();        
    }
    for (int index = 0; index < listOfNumbers.length; index++) {
        System.out.print(listOfNumbers[index] + "   ");
    }
          }
    }
    
    
    
