
package groupw.skmotorsauction;
 import java.util.Scanner;

public class SkMotorsAuction {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SK MOTORS VEHICLE AUCTION SYSTEM ===\n");

        //  Input Vehicle details 
        System.out.print("Enter vehicle registration number: ");
        String registrationNumber = sc.nextLine();

        System.out.print("Enter vehicle cost: ");
        double vehicleCost = sc.nextDouble();

        System.out.print("Enter total deposits made: ");
        double totalDeposits = sc.nextDouble();

        System.out.print("Enter total expenses incurred: ");
        double totalExpenses = sc.nextDouble();

        // Calculate remaining balance on the vehicle
        double balanceLeft = vehicleCost - totalDeposits;

        sc.nextLine(); // Clear input buffer

        // --- Bidding process ---
        String winningBidder = "";
        double highestBid = 0;

        for (int bidderNumber = 1; bidderNumber <= 3; bidderNumber++) {

            System.out.println("\nBidder " + bidderNumber);

            System.out.print("Name: ");
            String bidderName = sc.nextLine();

            System.out.print("Bid amount: ");
            double bidAmount = sc.nextDouble();
            sc.nextLine(); // Clear buffer

            if (bidAmount > highestBid) {
                highestBid = bidAmount;
                winningBidder = bidderName;
            }
        }

        // --- Profit or loss calculation ---
        double profitOrLoss = highestBid - (vehicleCost + totalExpenses);

        // --- Display results ---
        System.out.println("\n  VEHICLE SUMMARY ");
        System.out.println("Registration Number : " + registrationNumber);
        System.out.println("Vehicle Cost        : " + vehicleCost);
        System.out.println("Total Deposits      : " + totalDeposits);
        System.out.println("Expenses Incurred   : " + totalExpenses);
        System.out.println("Balance Left        : " + balanceLeft);

        System.out.println("\n  AUCTION RESULT ");
        System.out.println("Winning Bidder : " + winningBidder);
        System.out.println("Winning Bid    : " + highestBid);

        System.out.println("\n  FINAL RESULT ");
        if (profitOrLoss > 0) {
            System.out.println("Profit Made : " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss Made   : " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No Profit Or Loss Made");
        }

        sc.close();
    }
}
