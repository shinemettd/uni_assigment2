import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
 *
 * @author shinemettd (David O.)
 *
 */


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Device> devicesList = new ArrayList<>();


        String[] randomNames = {"Samsung", "Apple", "Dell", "Lenovo", "ASUS"}; //creating some specialized names
        String[] randomLaptopTypes = {"Full keyboard", "70% keyboard", "50% keyboard", "Touchpadless"}; //creating some specialized laptop types
        double totalPrices = 0.0;
        double totalWeight = 0.0;

        System.out.println("Enter count of devices: ");
        int devicesCount = sc.nextInt();

        int smartphoneCount = 0;
        int tabletCount = 0;
        int laptopCount = 0;

        for (int i = 0; i < devicesCount; i++) {
            int randomDevice = rand.nextInt(1, 4);
            double randomPrice = rand.nextDouble(99.9, 4999.9);
            totalPrices += randomPrice;
            if (randomDevice == 1) { //creating smartphone object if random number will be equal to 1
                int phoneHeight = rand.nextInt(150, 185);
                int phoneWidth = rand.nextInt(50, 70);
                double randomWeight = rand.nextDouble(0.1, 1.5);
                totalWeight += randomWeight;
                double phoneDiagonal = Math.sqrt(phoneHeight * phoneHeight + phoneWidth * phoneWidth);
                Smartphone temp = new Smartphone("Smartphone", randomPrice, randomWeight, phoneHeight, phoneWidth, phoneDiagonal);
                smartphoneCount++;
                devicesList.add(temp);
            }
            else if (randomDevice == 2) { //creating tablet object if random number will be equal to 1
                int tabletHeight = rand.nextInt(300, 400);
                int tabletWidth = rand.nextInt(100, 150);
                double randomWeight = rand.nextDouble(0.4, 2.2);
                totalWeight += randomWeight;
                double tabletDiagonal = Math.sqrt(tabletWidth*tabletWidth + tabletHeight * tabletHeight);
                Tablet temp = new Tablet("Tablet", randomPrice, randomWeight, tabletHeight, tabletWidth, tabletDiagonal);
                tabletCount++;
                devicesList.add(temp);
            }
            else if (randomDevice == 3) { //creating laptop object if random number will be equal to 1
                String randomNameModel = randomNames[rand.nextInt(randomNames.length)];
                String randomType = randomLaptopTypes[rand.nextInt(randomLaptopTypes.length)];
                double randomWeight = rand.nextDouble(1.0, 4.0);
                totalWeight += randomWeight;
                Laptop temp = new Laptop("Laptop", randomPrice, randomWeight, randomNameModel, randomType);
                laptopCount++;
                devicesList.add(temp);
            }
            else {
                System.out.println("Caught some error");
            }
        }

        System.out.println(devicesList);

        //printing all devices that was created
        System.out.println("Smartphones created: " + smartphoneCount +
                            "\nTables created: " + tabletCount +
                            "\nLaptop created: " + laptopCount);

        System.out.printf("Total prices of all devices: %.2f$", totalPrices);
        System.out.printf("\nTotal weights of all devices: %.2f kg", totalWeight);
    }
}