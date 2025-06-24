import java.util.Scanner;
public class RechargeSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBalance = 0;
        System.out.println("Welcome to Mobile Recharge Simulation⚡");
        while (true) {
            System.out.println("Choose your SIM for recharge (Jio/Vi/Airtel):");
            String sim = sc.nextLine();
            switch (sim.toLowerCase()) {
                case "jio":
                    System.out.println("Available Jio plans: 299, 349");
                    break;
                case "airtel":
                    System.out.println("Available Airtel plans: 299, 799");
                    break;
                case "vi":
                    System.out.println("Available Vi plans: 299, 550");
                    break;
                default:
                    System.out.println("Invalid provider. Please choose from Jio, Vi, or Airtel.");
                    continue;
            }
            System.out.println("Enter the valid plan amount: ");
            int planAmount = sc.nextInt();
            totalBalance += planAmount;

            System.out.println("Do you want to recharge again? (Yes / No): ");
            String rechargeContinue = sc.next();
            if (rechargeContinue.equalsIgnoreCase("No")) {
                break;
            }
        }
        System.out.println("Would you like to check your total recharge amount? (Yes / No): ");
        String Balance = sc.next();
        if (Balance.equalsIgnoreCase("Yes")) {
            System.out.println("Your total recharge amount is: " + totalBalance);
        }

        System.out.println("Thank you for using the Recharge Simulation!");
        sc.close();
    }
}