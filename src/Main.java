import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] array = new int[]{1, 2, 3};

        double[] arrayFrac = {1.57, 7.654, 9.986};

        byte[] arbitrary = {1, 5, 9};


        //Задача 2
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);

        for (int i = 0; i < arrayFrac.length - 1; i++) {
            System.out.print(arrayFrac[i] + ", ");
        }
        System.out.println(arrayFrac[arrayFrac.length - 1]);

        for (int i = 0; i < arbitrary.length - 1; i++) {
            System.out.print(arbitrary[i] + ", ");
        }
        System.out.println(arbitrary[arbitrary.length - 1]);


        //Задача 3
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0]);

        for (int i = arrayFrac.length - 1; i > 0; i--) {
            System.out.print(arrayFrac[i] + ", ");
        }
        System.out.println(arrayFrac[0]);

        for (int i = arbitrary.length - 1; i > 0; i--) {
            System.out.print(arbitrary[i] + ", ");
        }
        System.out.println(arbitrary[0]);


        //Задача 4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}