import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numArray = new int[1000];
        //Random: randomly generate the numbers based on the Random Package seeded with system time. Generates 1000 plays at a time
        //Learning: Uses Machine Learning to attempt to guess the next number that will be given. Requires repeated entries to continue
        //OffDef: Uses Machine Learning to guess the next number only for Offensive plays and random plays for Defensive
        //DefOff: Uses Machine Learning to guess the next number only for Defensive plays and random plays for Offensive
        String methodOfGeneration = "random";
        methodOfGeneration = methodOfGeneration.toLowerCase();

        Scanner scanner = new Scanner(System.in);

        if (methodOfGeneration.toLowerCase().equals("random")) {
            System.out.println("We are straight guessing bois");
                RandomNumbers randomNumbers = new RandomNumbers();
            do {
                numArray = randomNumbers.getNumbers(1500);
                randomNumbers.printNumbers(numArray, 1);
                System.out.println("Would you like another play?");
            } while (!scanner.next().equals("halt"));
        } else if (methodOfGeneration.equals("learning")) {
            System.out.println("Father, Why have you forced rocks to think?");
            System.out.println("Do you really think that this is finished yet? Try random for now!");
        } else if (methodOfGeneration.equals("offdef")) {
            System.out.println("We shall attack with strategy and tactics, but defend like the French");
        } else if (methodOfGeneration.equals("defoff")) {
            System.out.println("We shall attack like the Swiss and defend like Havel");
        }
    }


}


