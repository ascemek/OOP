
/**
 * Coffee OD Calculator
 * Calculates how many cups of coffee you can drink before overdosing on
 * caffeine.
 * In humans, more than 150mg per kg of body weight, or 5 to 10 grams of
 * total caffeine ingested is considered lethal.
 * 
 * @author Jon Doe, (put your name here)
 * @since 13-02-2022
 * @version 0.1a
 * 
 */

import java.util.Scanner;
import java.lang.Math;

class CoffeeCalc {
    static Person jon; // Jon Doe's simulated biochemistry

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creates a scanner object
        System.out.print("This program helps you Jon from dying of a caffeine overdose! \n" +
                "Input his weight (kg). \n Weight(kg): "); // prints summary of program and instructions

        jon = new Person("Jon Doe", sc.nextInt());
        // creates a new Person (simulated Jon) who's weight will be the next input (int) by the user

        System.out.print("Input the number of cups simulated Jon will ingest to see if he'll survive. \n Cups: ");
        // Note: if an if/else statement is followed by only one line, a colon and curly braces can be absent.
        if (jon.survivalIfIngestedCoff(sc.nextInt())) // if simulated jon drinks the next scanner's integer's amount of coffee and survives
            System.out.println(jon.getName() + " survived!");
        else
            System.out.println(jon.getName() + " died from a caffeine overdose!");

        /*
        Using a loop + trial and error; How many cups of coffee can Jon drink given his weight without dying?
         */

        System.out.println("Using trial and error we'll now find how many cups of coffee " +
                jon.getName() + " can drink without dying!");

        // Pauses the program till you press enter. The next few lines are more advanced, you don't need to know how these work yet. They're added for ease of use.
        System.out.println("Press enter to continue");
        try {
            System.in.read();
        } catch (Exception e) {
        }

        int cupsTillDeath = 0;
        while (jon.survivalIfIngestedCoff(cupsTillDeath)) { // while Jon can survive the number of cups in 'cupsTillDeath'
            System.out.println(jon.getName() + " survived ingesting " + cupsTillDeath + " cups of coffee!");
            cupsTillDeath++; // increase the number of cups by one
        }

        System.out.println("Jon can drink " + (cupsTillDeath - 1) + " cups of coffee without dying");

        //TODO
        //Using a loop + trial and error; How much would Jon need to weigh to drink x amount of coffee?

        System.out.println("Now we will calculate how much would Jon need to weigh to drink x amount of coffee?");
        System.out.println("Enter desired amount of coffee:");

        int weightUntilSurvival = jon.getWeight();
        int wantedCoffeeCups = sc.nextInt();  // Read user input

        if(jon.survivalIfIngestedCoff(wantedCoffeeCups)){
            System.out.println("Jon weighs " + jon.weight + " and that's enough to drink " + wantedCoffeeCups + " cups already.");
            System.out.println("Jon needs to weigh at least "+ (jon.weight)  + " kg to drink " + wantedCoffeeCups + " cups.");
        }
        else{
            System.out.println("Jon currently weighs " + jon.weight + " kg.");
            while (!jon.survivalIfWeight(wantedCoffeeCups, weightUntilSurvival)) { // while Jon can survive when he weighs this much
                System.out.println(jon.getName() + " would die of a caffeine overdose at " + weightUntilSurvival + " kg for " + wantedCoffeeCups + " cups.");
                weightUntilSurvival++;
            }
            System.out.println(jon.getName() + " needs to weigh at least "+ (Math.round(Math.ceil(wantedCoffeeCups/1.5)))  + " kg to drink " + wantedCoffeeCups + " cups.");
        }

        //close the input scanner
        sc.close();

        /*
            So first I picked a weight to test and will not change that number:
            I said let weight = 80
            For 80 kg weight, 12.000 mg caffeine is limit before dying.
                - if 1 kg --> 150 mg
                - then 80 kg --> 12.000 mg
            12.000 mg equal to 120 cups of coffee so Jon can drink 120 cups of coffee before dying for 80 kg weight
            He dies when he drinks 121 cup of coffee.

            SOLUTION:
            > There is an off by one error on line 55. So I change to (cupsTillDeath - 1) to fix.
            > There is a logical error on line 31 and 33. I swap the print statements for conditionals.
            Now, IT WORKS PROPERLY.
         */
    }

}

/**
 * Person Class! This class simulates the biochemistry of a person.
 * Lets try to avoid killing them. :-)
 */
class Person {
    public int ccc = 100; // Coffee Caffeine Content (amount of caffeine per cup of coffee)
    private int ODCof = 150; // Overdose Coefficient ("In humans, more than 150mg per kg of body weight is lethal")
    public int weight; // Weight of user
    private int ODAmount; // Total amount of caffeine the user needs to ingest to OD
    private String name;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.ODAmount = calcODAmount(ODCof, this.weight);
    }

    /**
     * Calculates the OD amount for this person
     * 
     * @param ODCof Coefficient ("In humans, more than 150mg per kg of body
     *                 weight is lethal")
     * @param weight   of person in kg
     * @return The calculated amount of caffeine the user needs to ingest to OD
     */
    private int calcODAmount(int ODCof, int weight) {
        return weight * ODCof;
    }

    /**
     * Sets/modifies the persons weight
     * 
     * @param weight: the weight to change to (kg)
     * @return true if successful
     */
    public boolean setWeight(int weight) {
        weight = this.weight;
        return true;
    }

    /**
     * Gets the persons current weight
     * @return the persons current weight (kg)
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets the name of the person
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Finds if the person will survive x (mg) amount of caffeine if ingested
     * @param caffeineMg: the amount of caffeine to simulate ingesting
     * @return true if the person survives, false if they do not survive
     */
    public boolean survivalIfIngestedCaff(int caffeineMg) {
        return caffeineMg <= ODAmount; // resolves to true if ingested caffeine is less then ODAmount
    }

    /**
     * Finds if the person will survive x cups of coffee if ingested
     * @param cups: number of cups of coffee ingested
     * @return true if the person die, false if they do not survive
     */
    public boolean survivalIfIngestedCoff(int cups) {
        return (cups * ccc) <= ODAmount; // resolves to true if (cups * caffeine per cup) is less then ODAmount

    }

    /**
     * Finds if the person will survive when weighs x and drink y cups of coffee if ingested
     * @param desiredCups: wanted number of cups of coffee ingested
     * @param weight: weight of Jon
     * @return true if the person die, false if they they survive
     */
    public boolean survivalIfWeight(int desiredCups, int weight){
        if ((desiredCups * ccc)<= calcODAmount(ODCof, weight)) {
            return true;    // resolves to true if (desiredCups * caffeine per cup) is less then ODAmount
        }
        return false;
    }

}
