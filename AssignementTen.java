import java.util.Scanner;

public class AssignementTen {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         String[] astronautNames = new String[10];
         int[] astronautAges = new int[10];
         String[] missionStatus = new String[10];
         int numAstronauts = 0;
    while(true){
        System.out.println("Choose an option : ");
        System.out.println("1. Add astronaut to mission");
        System.out.println("2. Update astronaut's mission status");
        System.out.println("3. Display all astronauts");
        System.out.println("4. Exit");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
    switch (choice){
        case 1: 
        System.out.println("Enter astronaut's name: ");
        astronautNames [numAstronauts] = sc.nextLine();
        System.out.println("Enter astronaut's age: ");
        astronautAges [numAstronauts] = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter mission status (On mission/Available) : ");
        missionStatus[numAstronauts] = sc.nextLine();
        numAstronauts++;
            System.out.println(astronautNames + "added to the mission.");
        break;
        case 2: 
        System.out.println("Enter astronaut's name to update status: ");
        String astronautName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < numAstronauts;i++){
           if(astronautNames[i].equalsIgnoreCase(astronautName)){
                System.out.print("Enter new mission status(On mission/Available): ");
                missionStatus[i] = sc.nextLine();
                System.out.println("Mission status updated for" + astronautName);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Astronaut not found in the mission.");

        }
        break;
        case 3:
        System.out.println("All Astronauts: ");
        if(astronautNames==null || astronautNames.length==0){
            System.out.println("No astronauts added to the mission yet.");
        }else{
            for(int i = 0; i < numAstronauts;i++){
                System.out.println("Name: " + astronautNames[i] + ",Age: " + astronautAges[i] + ", Status: " + missionStatus[i]);

            }
        }
        break;
        case 4:
        System.out.println("Exiting program. Goodbye!");
        sc.close();
        return;
        default: 
        System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }
        System.out.println();

    }    
    }     
    }
