import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        int[] randomValuesArray = new int[10];
        int minValue = randomValuesArray[0];
        int maxValue = randomValuesArray[0];
        int averageValue = 0;

        for (int i = 0; i < randomValuesArray.length; i++) {
            randomValuesArray[i] = (int) (Math.random() * 20);
        }

        System.out.println("Array with random values: " + Arrays.toString(randomValuesArray));

        for (int numbers : randomValuesArray) {
            if (numbers < minValue) {
                minValue = numbers;
            }
        }

        for (int numbers : randomValuesArray) {
            if (numbers > maxValue) {
                maxValue = numbers;
            }
        }

        for (int numbers : randomValuesArray) {
            averageValue = numbers + averageValue;
        }

        for (int i = 0; i < randomValuesArray.length; i++) {
            for (int j = i + 1; j < (randomValuesArray.length); j++) {
                if (randomValuesArray[i] > randomValuesArray[j]) {
                    int t = randomValuesArray[i];
                    randomValuesArray[i] = randomValuesArray[j];
                    randomValuesArray[j] = t;
                }
            }
        }

        System.out.println("Min value in array: " + minValue);
        System.out.println("Max value in array: " + maxValue);
        System.out.println("Average value in array: " + (averageValue / randomValuesArray.length));
        System.out.println("Bubble sorted array: " + Arrays.toString(randomValuesArray)
                .replaceAll("[],\\[]", ""));
    }
}


