public class IteratorSymbols {
    /*Напишите программу на Java, чтобы найти повторяющиеся символы в строке*/

    /*В этой программе мы создаем строковую переменную st и инициализируем целочисленный счетчик, начиная с нуля.

    Затем мы создали массив символов для преобразования нашей строковой переменной в этот массив.
    С помощью двух циклов for мы проводим сравнение символов с разными индексами.

    Если два символа последовательного индекса совпадают,
    то этот символ будет выведен на экран и счетчик количества совпадающих символов увеличится на 1.*/

    public static void main(String[] args) {
        String st = "Helloou";
        int counter = 0;
        char[] charsArr = st.toCharArray();
        System.out.println("Повторяющиеся символы тут:");
        for (int i = 0; i < charsArr.length; i++) {
            for (int j = i+1; j < charsArr.length; j++) {
                if (charsArr[i] == charsArr[j]) {
                    System.out.println(charsArr[j]);
                    counter++;
                    break;
                }
            }
        }
    }
}
