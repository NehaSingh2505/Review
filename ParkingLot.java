import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        final int MAX_CAPACITY = 6;
        int parkedCars = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Parking Lot System ---");
            System.out.println("1. Park a Car");
            System.out.println("2. View Parking Status");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (parkedCars < MAX_CAPACITY) {
                    parkedCars++;
                    System.out.println("Car parked successfully.");
                    System.out.println("Cars currently parked: " + parkedCars);
                    System.out.println("Available slots: " + (MAX_CAPACITY - parkedCars));
                } else {
                    System.out.println("Parking Full! No more space available.");
                }
            } else if (choice == 2) {
                System.out.println("Cars currently parked: " + parkedCars);
                System.out.println("Available slots: " + (MAX_CAPACITY - parkedCars));
            } else if (choice == 3) {
                System.out.println("Exiting Parking Lot System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
