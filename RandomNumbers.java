import java.util.Random;

public class RandomNumbers {
    public void main(String[] args) {
        int[] numbers = getNumbers(1500);
        printNumbers(numbers, 1);
    }

    public int[] getNumbers(int bound) {
        Random random = new Random(System.currentTimeMillis());
        int[] numbers = new int[10]; //Change this for the length of the game

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(bound) + 1;
        }
        return numbers;
    }

    public void printNumbers(int[] numbers, int i) {
        int count = 1;
        for (int number : numbers) {
            System.out.println(count + ".) " + number);
            if (count >= i) {
                break;
            }
            count++;
        }
    }
}
