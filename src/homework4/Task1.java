package homework4;


import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static double[] arrays = new double[5];

    public static void main(String[] args) {
        calculator();
    }


    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        int count = -1;


        while (true) {
            System.out.println("Введите первое число : ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число : ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+,-,*,/) или введите 'q' для вывода масива чисел: ");
            String operator = scanner.next();


            double result = 0;

            switch (operator) {
                case "q":
                    System.out.println("Выход!!!!10");
                    System.out.println(Arrays.toString(arrays));
                    System.exit(0);
                    break;
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Ошибка: деление на ноль");
                        System.out.println("Хотите ли вы поменять числа? /n ('y' если 'да' / 'n' если 'нет') ");
                        String yn = scanner.next();
                        if (yn.equalsIgnoreCase("y")) {
                            continue;
                        } else if (yn.equalsIgnoreCase("n")) {
                            System.exit(0);
                        }
                    }
                    break;
                default:
                    System.out.println("Ошибка: неверная операция ");

            }
            System.out.println("Result =" + result);
            count++;
            if (arrays.length < count) {
                arrays = Arrays.copyOf(arrays, arrays.length + 1);
            }
            arrays[count] = result;
        }
    }
}

