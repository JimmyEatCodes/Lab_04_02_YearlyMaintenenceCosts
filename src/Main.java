import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        System.out.println("Here is how much your maintenance costs are for the year in a season-by-season breakdown.");

        Scanner in = new Scanner(System.in);




        int winterMaintenence = 4000;
        int springMaintenence = 3000;
        int summerMaintenence = 2500;
        int fallMaintenence = 2000;
        int totalMaintenence = winterMaintenence + springMaintenence + summerMaintenence + fallMaintenence;

        System.out.println("Maintenance costs for the winter are $" + winterMaintenence);
        System.out.println("Maintenance costs for the spring are $" + springMaintenence);
        System.out.println("Maintenance costs for the summer are $" + summerMaintenence);
        System.out.println("Maintenance costs for the fall are $" + fallMaintenence);
        System.out.println("Total Maintenance costs for the year are $" + totalMaintenence);




    }
}