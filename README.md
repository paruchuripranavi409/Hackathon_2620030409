# Hackathon 1 _2620030409

2a) DATA TYPES

import java.util.Scanner;

public class RoofTopSolarSystem{

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int panelID = 101;
        double energyGenerated = 25.27;
        int numberOfPanels = 10;
        char systemStatus = 'A';

        System.out.println("Solar Panel ID: " + panelID);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
        
    }
}



2b) If - else Condition

import java.util.Scanner;

public class SolarEnergyMonitor {

   public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the energy generated (in kWh): ");
    double energy = sc.nextDouble();

    if (energy >= 10){
        System.out.println("Good enrgy generation.");
    }
    else {
        System.out.println("Low energy generation.");
    }

      sc.close();
   }
   
    }
