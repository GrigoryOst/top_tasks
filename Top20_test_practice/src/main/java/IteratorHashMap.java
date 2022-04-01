import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorHashMap {

    /*Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.*/

    /*Здесь мы для начала вставили три элемента в переменную типа HashMap с именем keyValue, используя функцию put().

    Размер переменной keyValue можно получить с помощью метода size().
    После этого мы использовали цикл While для обхода keyValue,
    которая содержит по одной паре ключ-значение для каждого элемента.
    Ключи и значения могут быть получены с помощью методов getKey() и getValue().

    Аналогично, мы используем расширенный цикл for, на элементах «qurentMe2» в HashMap.*/

    public static void main(String[] args) {
        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1, "Hello");
        keyValue.put(2, "World");
        keyValue.put(3, "Have a nice day");
        System.out.println(keyValue.size());
        System.out.println("Цикл While:");
        Iterator iterator = keyValue.entrySet().iterator(); //entrySet возвращает набор всех элементов в виде объектов Map.Entry<K, V>.
        while (iterator.hasNext()) { //hasNext() можно узнать, есть ли следующий элемент, и не достигнут ли конец коллекции
            Map.Entry qurentMe = (Map.Entry) iterator.next();
            System.out.println("Ключ это " + qurentMe.getKey() + " Значение это " + qurentMe.getValue());
        }
        System.out.println("Цикл For:");
        for (Map.Entry qurentMe2 : keyValue.entrySet()) {
            System.out.println("Ключ это " + qurentMe2.getKey() + " Значение это " + qurentMe2.getValue());
        }
    }
}
