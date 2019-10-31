import java.util.Arrays;


public class Tablice {
    public static void main(String args[]) {
        int numbers[] = {4, 3, 66, -5, -78, 22};

        System.out.println("Minimum Value is: " + getMin(numbers));
        System.out.println("Maximum Value is: " + getMax(numbers));
        System.out.println("Total Value is: " + getSum(numbers));
    }


    public static int getMax(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) { //Find maximum value in array using loop
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {  //Find minimum value in array using loop
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
    public static int getSum(int[] numbers){
        double sum = 0;
        for (double element : numbers){ //FOR each loop to count our sum of value of array
            sum += element;
        }

        return (int) sum;
    }
}
