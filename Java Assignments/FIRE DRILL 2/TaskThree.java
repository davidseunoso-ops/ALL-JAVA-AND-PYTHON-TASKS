import java.util.Scanner;
public class TaskOne {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
      System.out.println("Enter the number: ");
      int scoreOne = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreTwo = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreThree = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreFour = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreFive = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreSix = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreSeven = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreEight = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreNine = input.nextInt();
      
      System.out.println("Enter the number: ");
      int scoreTen = input.nextInt();
      
      int totalScore = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive + scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
      
      double averageTotalScore = totalScore / 10;
      
      System.out.println("The total sum of the scores collected = " + totalScore);
      System.out.println(" The average of the scores collected = " + averageTotalScore);
        }
    }
