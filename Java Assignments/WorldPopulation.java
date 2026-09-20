import java.util.Scanner;
public class WorldPopulation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      System.out.print("Enter the firstValue: ");
      long firstValue = input.nextLong();
      
      System.out.print("Enter the secondValue: ");
      long secondValue = input.nextLong();
      
      System.out.print("Enter the thirdValue: ");   
      long thirdValue = input.nextLong();
      
      long estimatedWorldPopulation = firstValue + secondValue + thirdValue;
      
      long firstYear = estimatedWorldPopulation * 1;
       long secondYear = estimatedWorldPopulation * 2;
        long thirdYear = estimatedWorldPopulation * 3;
         long fourthYear = estimatedWorldPopulation * 4;
          long fifthYear = estimatedWorldPopulation * 5;
          
         System.out.println("Estimated World Population = " + estimatedWorldPopulation);
         System.out.println("First Year = " + firstYear);
           System.out.println("Second Year = " + secondYear);
            System.out.println("Third Year = " + thirdYear);
             System.out.println("Fourth Year = " + fourthYear);
              System.out.println("Fifth Year = " + fifthYear);
              }
          }
          
      
