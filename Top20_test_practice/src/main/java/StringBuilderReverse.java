public class StringBuilderReverse {
    /*Напишите программу на Java для переворачивания строки,
    изменив расположение символов в строке задом наперёд
    без использования встроенных в String функций.*/

    /*Для начала используем класс StringBuilder.
    Объект класса StringBuilder stringBuilder будет в дальнейшем использоваться для добавления значения.
    После этого мы используем встроенную в StringBuilder функцию reverse()
    и сохраняем новую - обращенную строку в stringBuilder.*/

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdrow gnoL");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
