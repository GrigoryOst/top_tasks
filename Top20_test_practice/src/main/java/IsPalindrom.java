import java.util.Scanner;

public class IsPalindrom {
    /*Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет.*/

    /*Чтобы проверить, является ли число или строка палиндромом или нет,
    вы можете использовать любую переворачивающую строки программу, из описанных выше,.

    Что вам нужно сделать, так это добавить один оператор if-else.
    Если исходная строка равна перевернутой строке, то число является палиндромом, в противном случае - нет.*/

    public static void main(String[] args) {
        String inputString, reversedString = "";
        Scanner scannerQ = new Scanner(System.in);
        int stringLength;
        System.out.println("Enter number or word");
        inputString = scannerQ.nextLine();
        stringLength = inputString.length();
        for (int i = stringLength-1; i >= 0; i--) {
            reversedString = reversedString + inputString.charAt(i); //используем встроенный метод charAt() чтобы перевернуть строку
        }
        System.out.println("reversed value " + reversedString);

        if (inputString.equals(reversedString)) {
            System.out.println("enter value is palindrom");
        } else {
            System.out.println("enter value is not palindrom");
        }
    }
}
