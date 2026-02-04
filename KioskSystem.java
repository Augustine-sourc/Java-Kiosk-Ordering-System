import java.util.Scanner;

public class KioskSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int burgerCount = 0;
        int friesCount = 0;
        double totalCost = 0;
        int itemCount = 0;
        int choice;

        do {
            System.out.println();
            System.out.println("1.Burger: $5.99");
            System.out.println("2.Fries: $2.50");
            System.out.println("3.Checkout");
            System.out.print("Enter option: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1->{
                    System.out.print("How many Burgers: ");
                    burgerCount = scanner.nextInt();
                    totalCost += 5.99 * burgerCount;
                    itemCount += burgerCount;
                }
                case 2->{
                    System.out.print("How many Fries: ");
                    friesCount = scanner.nextInt();
                    itemCount += friesCount;
                    totalCost += 2.50 * friesCount;
                }
                case 3->isRunning = false;
                default -> System.out.println("Invalid Input!!");
            }


        }while(isRunning);

        System.out.println();
        System.out.println("Total items: " + itemCount);
        System.out.printf("Total Cost: $%.2f", totalCost);
        scanner.close();
    }
}
