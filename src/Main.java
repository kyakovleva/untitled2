import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////        task1();
////        task2();
////        task3();
////        task31();
////        task32();
////        task4();
////        task5();
////        task6(); работает но без цикла
////        task7(); работает но есть вопросы по выводу финального значения
//        task8();
    }


    public static void task1() {
        System.out.print("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in); //скопировано, уточнить про in?
        int i = inputFigure.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели число 1");
        } else if (i == 2) {
            System.out.println("Вы ввели число 2");
        } else if (i == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }


    public static void task2() {
        System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            case 4:
                System.out.println("Вы ввели число 4");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
    }


    public static void task3() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task31() {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task32() {
//        Реализовать простой цикл перебора чисел от 1 до 10 и, когда дошли до 7, выйти из цикла с помощью оператора break
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 7)
                break;
        }
    }

    //                Реализовать простой цикл перебора чисел от 1 до 10 с выводом каждого числа в консоль кроме числа 8, использовать при этом continue
    public static void task4() {
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    //        }
    //реализовать подсчет чисел Фибоначчи начиная с 0 и 1, выводить каждое последующее число в консоль до момента пока следущее число менее 50;
    //т.е. : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static void task5() {
        int n0 = 0;
        int n1 = 1;
        int n2 = n0 + n1;
        System.out.print(n0 + " " + n1 + " ");
        while (n2 <= 55) {
            System.out.print(n2 + " ");
            n2++;
        }
    }

    //        ввести с консоли несколько слов, записать их в массив (обычный массив через String[]), пройти по нему циклом и посчитать количество слов
//        (если наткнулась на пробел, значит слово уже кончилось и после него начинается другое слово)
    public static void task6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите породы собак");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
String [] dogs = new String[3];

 int dogcount = dogs.length;
System.out.println(dogcount);
    }

    //
//        6) Отлов исключений
//        написать код,который осуществляет деление чисел, которые введены с консоли. Если идет деление на 0, то отливть исключение и написать о нем в консоле
    public static void task7() {


Scanner scan = new Scanner(System.in);
System.out.println("Введите число которое хотите поделить");
int a = scan.nextInt();
System.out.println("Введите число на которое хотите поделить");
int b = scan.nextInt();
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        }

        System.out.println("Программа работает успешно");
        // почему при ошибке выводится такая строчка?
        //как сюда добавить результат деления?

    }
}


