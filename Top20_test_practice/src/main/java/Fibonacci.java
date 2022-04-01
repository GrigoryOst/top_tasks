public class Fibonacci {

    /*Написать программу на Java для вычисления серии чисел Фибоначчи.*/

    /*Процесс решения в цикле выглядит так – мы присваиваем x значение равное y (которое в первой итерации равно 0),
    затем y присваиваем значение переменной z (равное в первой итерации 1).
    Затем переменной z присваиваем значение равное сумме значений x и y.*/

    public static void main(String[] args) {
        int number = 10, x = 0, y = 0, z = 1;

        System.out.println("Серия чисел Фибоначчи: ");
        for (int i = 0; i < number; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x + ",");
        }
    }

}