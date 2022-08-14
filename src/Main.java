public class Main {
    public static void main(String[] args) {
        // Задание №1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] bananas = {1.57, 7.654, 9.986};
        int[] chairs = {10, 11, 12, 13, 14};


        //Задание №2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < bananas.length; i++) {
            System.out.print(bananas[i]);
            if (i != bananas.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < chairs.length; i++) {
            System.out.print(chairs[i]);
            if (i != chairs.length - 1) {
                System.out.print(",");
            }
        }

        //Задание №3
        System.out.println();
        for (int i = numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = bananas.length-1; i>=0; i--) {
            System.out.print(bananas[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = chairs.length-1; i>=0; i--) {
            System.out.print(chairs[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }

        // Задание №4
        for (int i = 0; i <numbers.length; i++) {
            if (numbers [i] %2==1) {
                numbers[i]++;
            }
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.println(",");

            }
        }
    }
}