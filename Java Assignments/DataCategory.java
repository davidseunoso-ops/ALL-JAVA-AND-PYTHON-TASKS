import java.util.Scanner;
public class DataCategory {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      System.out.print("Enter the weight in KG: ");
      double categoryOne = input.nextInt();
      
      System.out.print("Enter the height in meters: ");
      double categoryTwo  = input.nextInt();
      
      double bmi = categoryOne / (categoryTwo * categoryTwo);
        System.out.println("BMI = " + bmi);
        
        if(bmi < 18.5) {
          System.out.println("Underweight.");
          }
        else if(bmi < 24.9) {
          System.out.println("Normal.");
          }
        else if(bmi < 29.9) {
          System.out.println("Overweight");
          }
        else {
          System.out.println("Obese");
          }
        }
      }
    
