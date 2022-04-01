public class ReverseWithoutSB {
    /*Напишите программу на Java для переворота последовательности символов в строке
    без использования встроенной в String функции reverse().*/

    public static void main(String[] args) {
        way1();
        System.out.println();
        way2();
        System.out.println();
        way3();
    }

    /*В этом способе мы инициализируем строковую переменную с именем st значением заданной строки.
    Затем мы конвертируем эту строку в массив символов с помощью функции toCharArray().
    После этого мы используем цикл for чтобы взять все символы в обратном порядке
    и вывести их так на экран поочередно.*/
    public static void way1() {
        String string = "sdrow gnoL";
        char symbols[] = string.toCharArray(); // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке
        for (int i = symbols.length-1; i >= 0; i--) {
            System.out.print(symbols[i]);
        }
    }

    /*использовали метод split() для разделения строки на ее подстроки (здесь не указывается разделитель).
    Затем, мы выводим строку в обратном порядке, используя цикл for.*/
    public static void way2() {
        String string = "sdrow gnoL";
        String strArr[] = string.split(""); //используем метод split для вывода строки в обратном порядке
        for (int i = strArr.length-1; i >= 0; i--) {
            System.out.print(strArr[i] + "");
        }
    }

    /*мы объявили целочисленную переменную stringLength,
    присваивая ей значение длины входящей строки.
    Vывели строку в обратном порядке, используя цикл for.
    Однако мы использовали метод charAt(index),
    который будет возвращать символ по конкретному индексу.
    После каждой итерации символ будет добавлен в новую строку
    для получения перевернутого значения строковой переменной*/
    public static void way3() {
        String string = "sdrow gnoL";
        String reverseString = "";
        int stringInt = string.length();
        for (int i = stringInt-1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i); //используем встроенный метод charAt() чтобы перевернуть строку
        }
        System.out.print(reverseString);
    }
}
