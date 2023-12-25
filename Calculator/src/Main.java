public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // В данном случае мы наблюдаем ошибку из-за попытки поделить на ноль.
        // Чтобы обработать данную ошибку можно написать try-catch блок непосредственно в Main
        // при вызове функции divide, но на мой взгляд try-catch блок лучше добавить в лямбда-выражение divide.
        // Если не писать try-catch блок, то можно выводить Integer.MAX_VALUE с сообщением об ошибке,
        // чтобы пользователь понимал, что допускает ошибку.

        int c = calc.divide.apply(a, b);

        calc.println.accept(c);

    }
}