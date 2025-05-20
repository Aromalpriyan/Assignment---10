# <p>**JAVA ASSIGNEMENT**<p>
# <p>**10 Interactive Exercise: Space Travel Simulator**<p>
# <p>**Let's Practice: Space Travel Simulator**<p>
## <p>**Objective :** <p>
### <p>In this exercise, you will create a **Space Travel Simulator** program in Java. The program will:<p>
#### <p>✅ **Store astronaut details** (name, age, mission status) using arrays.<p>
#### <p>✅ **Allow users to add astronauts** to a mission.<p>
#### <p>✅ **Enable updates to astronaut mission status**.<p>
#### <p>✅ **Display all astronauts and their details**.<p>
#### <p>✅ **Handle edge cases**, such as searching for non-existent astronauts and displaying astronauts when none have been added.<p>
#### <p>Completing this exercise will strengthen your skills in **arrays, loops, conditional statements, and user input handling in Java**.<p>
## <p>**Problem Statement**<P>
### <p>Create a Java program that:<P>
#### <p>1️⃣ **Stores astronaut details** (name, age, mission status) using arrays.<P>
#### <p>2️⃣ **Allows users to add new astronauts** with their details.<p>
#### <p>3️⃣ **Enables users to update an astronaut’s mission status**.<p>
#### <p>4️⃣ **Displays all astronauts and their current details**.<p>
#### <p>5️⃣ **Handles edge cases** like missing astronauts and empty lists.<P>
### <p>**Starter Code: Complete the Missing Parts!**<p>

![image](./pic%204.png)
![image](./pic%205.png)
![image](./pic%206.png)
![image](./Pic%207.png)
## <p>Output<p>
```
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
```
[githublink](https://github.com/Aromalpriyan/Assignment---10)

