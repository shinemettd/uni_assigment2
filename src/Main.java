import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Device> devicesList = new ArrayList<>();

        double[] prices = {1999.0, 459.0, 999.9, 1439.9, 99.9, 75.5, 1750.59, 895.79, 729.29}; //creating some specialized prices
        double[] weight = {5.5, 3.2, 1.7, 8.3, 4.4, 2.6, 9.1, 1.6, 2.3, 5.9}; //creating some specialized weights

        String[] randomNames = {"Samsung", "Apple", "Dell", "Lenovo", "ASUS"}; //creating some specialized names
        String[] randomLaptopTypes = {"Full keyboard", "70% keyboard", "50% keyboard"}; //creating some specialized laptop types

        System.out.println("Enter count of devices: ");
        int devicesCount = sc.nextInt();

        for (int i = 0; i < devicesCount; i++) {
            int randomDevice = rand.nextInt(1, 4);
            System.out.println(randomDevice);
            double randomPrice = prices[rand.nextInt(prices.length)];
            double randomWeight = weight[rand.nextInt(weight.length)];
            if (randomDevice == 1) { //creating smartphone object if random number will be equal to 1
                int phoneHeight = rand.nextInt(150, 185);
                int phoneWidth = rand.nextInt(50, 70);
                double phoneDiagonal = Math.sqrt(phoneHeight * phoneHeight + phoneWidth * phoneWidth);
                Smartphone temp = new Smartphone("Smartphone", randomPrice, randomWeight, phoneHeight, phoneWidth, phoneDiagonal);
                devicesList.add(temp);
            }
            else if (randomDevice == 2) { //creating tablet object if random number will be equal to 1
                int tabletHeight = rand.nextInt(300, 400);
                int tabletWidth = rand.nextInt(100, 150);
                double tabletDiagonal = Math.sqrt(tabletWidth*tabletWidth + tabletHeight * tabletHeight);
                Tablet temp = new Tablet("Tablet", randomPrice, randomWeight, tabletHeight, tabletWidth, tabletDiagonal);
                devicesList.add(temp);
            }
            else if (randomDevice == 3) { //creating laptop object if random number will be equal to 1
                String randomNameModel = randomNames[rand.nextInt(randomNames.length)];
                String randomType = randomLaptopTypes[rand.nextInt(randomLaptopTypes.length)];
                Laptop temp = new Laptop("Laptop", randomPrice, randomWeight, randomNameModel, randomType);
                devicesList.add(temp);
            }
            else {
                System.out.println("Caught some error");
            }
        }

        System.out.println(devicesList); //printing all devices that was created
    }
}