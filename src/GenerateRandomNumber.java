import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        System.out.println("Generate a number with 4 unique digits randomly:");
        int[] intArray = {10,10,10,10};
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            int a = random.nextInt(9);
            while (a == intArray[0] || a == intArray[1] || a == intArray[2] || a == intArray[3] ){
                a = random.nextInt(9);
            }
            intArray[i] = a;

        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }
    }
}