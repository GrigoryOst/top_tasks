public class NumberIsPrime {
    /*Напишите программу на Java, чтобы узнать, является ли число простым или нет.*/

    /*объявили две целочисленных переменных temp и number

    Объявляем логическую переменную numberIsPrime и устанавливаем ее значение - true.
    После этого мы используем цикл for со значением переменной итератора, начинающемся с 2.
    Количество итераций, нужное нам, будет равно половине введенного числа.
    Счетчик итераций увеличивается на 1 после каждой итерации.
    В переменную tempNumber мы будем помещать остаток от деления значения введенного числа на значение счетчика.
    Если остаток от деления в одной из итераций будет равен 0, тогда numberIsPrime будет установлен в false,
    введенное число не будет простым, и мы выходим из цикла.
    Если во всех итерациях мы будем получать в temp некие остатки от деления, отличные от нуля – число будет простым.

    Основываясь на значении numberIsPrime, мы приходим к выводу, является ли наше число простым или нет.*/

    public static void main(String[] args) {
        int tempNumber, number;
        number = 7;
        boolean numberIsPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            tempNumber = number % i;
            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if (numberIsPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
