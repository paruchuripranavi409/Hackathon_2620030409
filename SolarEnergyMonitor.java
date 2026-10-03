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

Output:

Enter the energy generated (in kWh): 
15
Good enrgy generation.


Enter the energy generated (in kWh): 
5
Low energy generation.
