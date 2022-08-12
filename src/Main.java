public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] arrayFrac = {1.57, 7.654, 9.986};

        byte[] arbitrary = {1, 5, 9};


        //Задача 2
        for (int i = 0; i <= 2; i++) {
            if (i == 2) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.print("\n");

        for (int i = 0; i <= 2; i++) {
            if (i == 2) {
                System.out.print(arrayFrac[i]);
            } else {
                System.out.print(arrayFrac[i] + ", ");
            }
        }

        System.out.print("\n");

        for (int i = 0; i <= 2; i++) {
            if (i == 2) {
                System.out.print(arbitrary[i]);
            } else {
                System.out.print(arbitrary[i] + ", ");
            }
        }

        System.out.print("\n");


        //Задача 3
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.print("\n");

        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayFrac[i]);
            } else {
                System.out.print(arrayFrac[i] + ", ");
            }
        }

        System.out.print("\n");

        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arbitrary[i]);
            } else {
                System.out.print(arbitrary[i] + ", ");
            }
        }

        System.out.print("\n");


        //Задача 4
        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                array[i] = array[i] + 1;
            System.out.print(array[i] + " ");
        }
    }
}