public class changeVariable {
    public static void main(String[] args) {
        threeVar();
        twoVar();
    }

    /*Напишите программу на Java для того,
    чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной*/

    /*мы создаем временную или третью переменную с именем temp,
    присваиваем ей значение, хранящееся в переменной a,
    а затем мы присваиваем a значение b, и снова присваиваем b значение temp.
    Таким образом, после выполнения всех операций temp будет хранить в себе значение a,
    a получит значение b, а b будет иметь значение temp (которое равно a).*/

    public static void threeVar() {
        int a, b, temp;
        a = 2;
        b = 3;
        System.out.println("before change " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after change " + a + " " + b);
    }

    /*Напишите программу на Java,
    чтобы поменять местами значения, хранящиеся в двух переменных,
    без использования третьей переменной.*/

    /*Здесь мы сначала присваиваем переменной a значение a + b,
    что означает, что a будет теперь иметь в себе значение как a, так и b.
    Затем мы присваиваем переменной b значение a - b,
    что означает, что мы вычитаем значение b из суммы (a + b).
    До сих пор a все еще хранит в себе сумму изначальных a и b.
    Но b имеет теперь значение первоначального a.
    Наконец, на третьем шаге мы присваиваем a значение a - b,
    что означает, что мы вычитаем значение переменной b
    (которая сейчас уже имеет в себе значение a) из суммы (a + b).
    В результате этих действий мы поменяли местами значения, хранящиеся в переменных.*/

    public static void twoVar() {
        int a, b;
        a = 2;
        b = 3;
        System.out.println("before change " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after change " + a + " " + b);
    }
}