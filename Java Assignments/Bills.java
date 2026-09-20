import java.util.Scanner;
public class Bills {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      System.out.print("Enter the total bill: ");
      int totalBill = input.nextInt();
      
      System.out.print("Are you a member? ");
      String isMember  = input.next();
      
          if(totalBill >= 1000 && isMember.equals("yes")) {
            int estimatedPrice = totalBill - (totalBill * 10 / 100);
              System.out.println("Estimated Price: " + estimatedPrice);
              }

              else if (totalBill >= 1000 && isMember.equals("no")) {
                int estimatedPrice = totalBill - (totalBill * 5/100);
                  System.out.println("Estimated Price: " + estimatedPrice);
                  }
                  else {
                    System.out.println("No Discount " + totalBill);
                    }
              }
        }
