import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
    /*
    * Cамостоятельная работа:
    1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
    2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    8. Реализовать тесты для задач выше :)
    * */
        System.out.println("Домашка два, погнали.");
        // Задание 1
        System.out.println("Задание 1: " + sumRange( -99, 114));
        // Задание 2.1
        System.out.println("Задание 2.1: " + add(278, -299));
        // Задание 2.2
        System.out.println("Задание 2.2: " + add("Аве Цезарю!", "Аве, мне!"));
        // Задание 3
        System.out.println("Задание 3: " + findMax(new int[]{11, 212, -799, 1414, 890809, 0}));
        // Задание 4
        System.out.println("Задание 4: " + factorial(7));
        // Задание 5.1
        System.out.println("Задание 5.1: " + figureArea(0.14));
        // Задание 5.2
        System.out.println("Задание 5.2: " + figureArea(13.10, 4));
        // Задание 6
        System.out.println("Задание 6: " + averageOfThreeNumbers(new double[]{4.1, 3, 5.9}));
        // Задание 7
        System.out.println("Задание 7: " + getHypotenuse(0.5, 2.7));
    }
    /**
     * Функция возвращает сумму чисел между двумя числами. Задание 1
     * @param num1
     * @param num2
     * @return
     */
    static Integer sumRange(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            System.out.println("Первое число должно быть меньше второго.");
            return null;
        }
        for (int i = num2; i >= num1; i--) {
            sum += i;
        }
        return sum;
    }
    /**
     * Возвращает сумму двух целых чисел Задание 2
     * @param num1
     * @param num2
     * @return
     */
    static int add(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("А смысл?");
        }
        return num1 + num2;
    }
    /**
     * Возвращает конкатенацию слов Задание 2
     * @param str1
     * @param str2
     * @return
     */
    static String add(String str1, String str2) {
        if (str2 == null || str1 == null) {
            System.out.println("А смысл?");
        }
        return str1 + str2;
    }
    /**
     * Примитивный поиск максимума Задание 3
     * @param numbers - массив чисел
     * @return - максимальное
     */
    static Integer findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    /**
     * получение факториала числа Задание 4
     * @param num - целое число.
     * @return - факториал
     */
    static int factorial(int num) {
        if (num < 0) {
            System.out.println("Факториал возможен только по положительным числам, и нулю.");
            return 0;
        } else if (num == 0) {
            return 1;
        }
        int fact = num;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
    /**
     * Расчет площади круга задание 5
     * @param radius - радиус круга
     *               Добавил тут проверку на if как 5 задание из if-else
     */
    static double figureArea(double radius) {
        if (radius <= 0) {
            System.out.println("Радиус должен быть больше нуля, если ноль то это точка,а она площади не имеет");
        }
        double p = 3.14159;
        return Double.parseDouble(getFormatUnified(p * (radius * radius)));
    }
    /**
     * Расчет площади прямоугольника задание 5
     * @param side1 - первая сторона
     * @param side2 - вторая сторона
     *              Добавил тут проверку на if как 5 задание из if-else
     */
    static double figureArea(double side1, double side2) {
        if (side1 <= 0 || side2 <= 0) {
            System.out.println("Стороны должны быть больше нуля");
        }
        return Double.parseDouble(getFormatUnified(side1 * side2));
    }
    /**
     * Возвращает арифметическое для 3 чисел Задание 6
     * Проверка на то что массив из 3 чисел в коде)
     * @param numbers - массив типа double
     * @return
     */
    static double averageOfThreeNumbers(double[] numbers) {
        if (numbers.length != 3) {
            System.out.println("Тут не 3 числа");
        }
        return Double.parseDouble(getFormatUnified((numbers[0] + numbers[1] + numbers[2]) / numbers.length));
    }
    /**
     * Получение гипотенузы по 2 катетам.
     * @param cathetus1
     * @param cathetus2
     * @return
     */
    static double getHypotenuse(double cathetus1, double cathetus2) {
        if (cathetus1 <= 0 || cathetus2 <= 0) {
            System.out.println("Длинна катетов должна быть больше 0");
        }
        return Double.parseDouble(getFormatUnified(Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2))));
    }

    /**
     * Функция для приведения к 2 символам
     * Написана чтобы везде не тащить формат, и автотесты норм отработали.
     * @param number
     * @return
     */
    static String getFormatUnified(double number) {
        DecimalFormatSymbols dcSymbol = new DecimalFormatSymbols();
        dcSymbol.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00", dcSymbol);
        return df.format(number);
    }
}