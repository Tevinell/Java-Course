import static java.lang.System.out;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main n = new Main();
        out.println("Блоки задач:");
        out.println("1 Блок: Методы");
        out.println("2 Блок: Условия");
        out.println("3 Блок: Циклы");
        out.println("4 Блок: Массивы");
        out.println("Ввeдите номер блока: ");
        Scanner sc = new Scanner(System.in);
        int BNum = sc.nextInt();
        if ((BNum < 1) || (BNum > 4)) {
            out.println("Введен неверный номер");
            return;
        }
        switch (BNum) {
            case 1:
                out.println("1 Блок: Методы");
                out.println("1 Задача: Сумма знаков (Двух последних)");
                out.println("2 Задача: Есть ли позитив");
                out.println("3 Задача: Большая буква");
                out.println("4 Задача: Делитель");
                out.println("5 Задача: Многократный вызов");
                out.println("Введите номер задачи: ");
                int TNum1 = sc.nextInt();
                if ((TNum1 < 1) || (TNum1 > 5)) {
                    out.println("Введен неверный номер");
                    return;
                }
                switch (TNum1) {
                    case 1:
                        out.println("Введите число:");
                        int x1 = sc.nextInt();
                        int y1 = n.sumLastNums(x1);
                        out.println(y1);
                        break;
                    case 2:
                        out.println("Введите число: ");
                        int x2 = sc.nextInt();
                        boolean y2 = n.isPositive(x2);
                        out.println(y2);
                        break;
                    case 3:
                        out.println("Введите символ: ");
                        char x3 = sc.next().charAt(0);
                        boolean y3 = n.isUpperCase(x3);
                        out.println(y3);
                        break;
                    case 4:
                        out.println("Введите два числа: ");
                        int x4 = sc.nextInt();
                        int y4 = sc.nextInt();
                        boolean z4 = n.isDivisor(x4, y4);
                        out.println(z4);
                        break;
                    case 5:
                        out.println("Введите два числа: ");
                        int x5 = sc.nextInt();
                        int y5 = sc.nextInt();
                        int z5 = n.lastNumSum(x5, y5);
                        int y51 = sc.nextInt();
                        int z51 = n.lastNumSum(z5, y51);
                        int y52 = sc.nextInt();
                        int z52 = n.lastNumSum(z51, y52);
                        int y53 = sc.nextInt();
                        int z53 = n.lastNumSum(z52, y53);
                        out.println(z53);
                        break;
                }
                break;

            case 2:
                out.println("2 Блок: Условия");
                out.println("1 Задача: Безопасное деление");
                out.println("2 Задача: Строка сравнения");
                out.println("3 Задача: Тройная сумма");
                out.println("4 Задача: Возраст");
                out.println("5 Задача: Вывод дней недели");
                out.println("Введите номер задачи: ");
                int TNum2 = sc.nextInt();
                if ((TNum2 < 1) || (TNum2 > 5)) {
                    out.println("Введен неверный номер");
                    return;
                }
                switch (TNum2) {
                    case 1:
                        out.println("Введите два числа: ");
                        int x6 = sc.nextInt();
                        int y6 = sc.nextInt();
                        double z6 = n.safeDiv(x6, y6);
                        out.println(z6);
                        break;
                    case 2:
                        out.println("Введите два числа: ");
                        int x7 = sc.nextInt();
                        int y7 = sc.nextInt();
                        String z7 = n.makeDecision(x7, y7);
                        out.println(z7);
                        break;
                    case 3:
                        out.println("Введите три числа: ");
                        int x8 = sc.nextInt();
                        int y8 = sc.nextInt();
                        int z8 = sc.nextInt();
                        boolean q8 = n.sum3(x8, y8, z8);
                        out.println(q8);
                        break;
                    case 4:
                        out.println("Введите число: ");
                        int x9 = sc.nextInt();
                        String y9 = n.age(x9);
                        out.println(y9);
                        break;
                    case 5:
                        out.println("Введите день недели: ");
                        String x10 = sc.nextLine();
                        n.printDays(x10);
                        break;
                }
                break;

            case 3:
                out.println("3 Блок: Циклы");
                out.println("1 Задача: Числа наоборот");
                out.println("2 Задача: Степень числа");
                out.println("3 Задача: Одинаковость");
                out.println("4 Задача: Левый треугольник");
                out.println("5 Задача: Угадайка");
                out.println("Введите номер задачи: ");
                int TNum3 = sc.nextInt();
                if ((TNum3 < 1) || (TNum3 > 5)) {
                    out.println("Введен неверный номер");
                    return;
                }
                switch (TNum3) {
                    case 1:
                        out.println("Введите число: ");
                        int x11 = sc.nextInt();
                        String y11 = n.reverseListNums(x11);
                        out.println(y11);
                        break;
                    case 2:
                        out.println("Введите два числа: ");
                        int x12 = sc.nextInt();
                        int y12 = sc.nextInt();
                        int z12 = n.pow(x12, y12);
                        out.println(z12);
                        break;
                    case 3:
                        out.println("Введите число: ");
                        int x13 = sc.nextInt();
                        boolean y13 = n.equalNum(x13);
                        out.println(y13);
                        break;
                    case 4:
                        out.println("Введите число: ");
                        int x14 = sc.nextInt();
                        n.leftTriangle(x14);
                        break;
                    case 5:
                        out.println("Введите число от 0 до 9: ");
                        n.GuessGame();
                        break;
                }
                break;

            case 4:
                out.println("4 Блок: Массивы");
                out.println("1 Задача: Поиск последнего значения");
                out.println("2 Задача: Добавление в массив");
                out.println("3 Задача: Реверс");
                out.println("4 Задача: Объединение");
                out.println("5 Задача: Удалить негатив");
                out.println("Введите номер задачи: ");
                int TNum4 = sc.nextInt();
                if ((TNum4 < 1) || (TNum4 > 5)) {
                    out.println("Введен неверный номер");
                    return;
                }
                switch (TNum4) {
                    case 1:
                        out.println("Введите размер массива: ");
                        int arrs = sc.nextInt();
                        int[] arr = new int[arrs];
                        out.println("Введите элементы массива: ");
                        for (int i = 0; i < arrs; i++) {
                            int el = sc.nextInt();
                            arr[i] = el;
                        }
                        out.println("Ваш массив: ");
                        for (int i = 0; i < arrs; i++) {
                            out.print(arr[i] + " ");
                        }
                        out.println();
                        out.println("Введите число: ");
                        int x16 = sc.nextInt();
                        int y16 = n.findLast(arr, x16);
                        out.println(y16);
                        break;
                    case 2:
                        out.println("Введите размер массива: ");
                        int arrs2 = sc.nextInt();
                        int[] arr2 = new int[arrs2];
                        out.println("Введите элементы массива: ");
                        for (int i = 0; i < arrs2; i++) {
                            int el = sc.nextInt();
                            arr2[i] = el;
                        }
                        out.println("Ваш массив: ");
                        for (int i = 0; i < arrs2; i++) {
                            out.print(arr2[i] + " ");
                        }
                        out.println();
                        out.println("Введите число: ");
                        int x17 = sc.nextInt();
                        out.println("Введите индекс: ");
                        int y17 = sc.nextInt();
                        int[] z17 = n.add(arr2, x17, y17);
                        for (int i = 0; i < z17.length; i++) {
                            out.print(z17[i] + " ");
                        }
                        break;
                    case 3:
                        out.println("Введите размер массива: ");
                        int arrs3 = sc.nextInt();
                        int[] arr3 = new int[arrs3];
                        out.println("Введите элементы массива: ");
                        for (int i = 0; i < arrs3; i++) {
                            int el = sc.nextInt();
                            arr3[i] = el;
                        }
                        out.println("Ваш массив: ");
                        for (int i = 0; i < arrs3; i++) {
                            out.print(arr3[i] + " ");
                        }
                        out.println();
                        n.reverse(arr3);
                        out.println("Измененный массив: ");
                        for (int i = 0; i < arrs3; i++) {
                            out.print(arr3[i] + " ");
                        }
                        break;
                    case 4:
                        out.println("Введите размер первого массив: ");
                        int arrs41 = sc.nextInt();
                        int[] arr41 = new int[arrs41];
                        out.println("Введите элементы первого массива: ");
                        for (int i = 0; i < arrs41; i++) {
                            int el = sc.nextInt();
                            arr41[i] = el;
                        }
                        out.println("Ваш первый массив: ");
                        out.println("Введите размер второго массива: ");
                        int arrs42 = sc.nextInt();
                        int[] arr42 = new int[arrs42];
                        out.println("Введите элементы второго массива: ");
                        for (int i = 0; i < arrs42; i++) {
                            int el = sc.nextInt();
                            arr42[i] = el;
                        }
                        out.println("Ваш второй массив: ");
                        out.println("Новый массив из первого и второго: ");
                        int[] x19 = n.concat(arr41,arr42);
                        for (int i = 0; i < x19.length; i++){
                            out.print(x19[i] + " ");
                        }
                        break;
                    case 5:
                        out.println("Введите размер массива: ");
                        int arrs5 = sc.nextInt();
                        int[] arr5 = new int[arrs5];
                        out.println("Введите элементы массива: ");
                        for (int i = 0; i < arrs5; i++) {
                            int el = sc.nextInt();
                            arr5[i] = el;
                        }
                        out.println("Ваш массив: ");
                        for (int i = 0; i < arrs5; i++) {
                            out.print(arr5[i] + " ");
                        }
                        out.println();
                        out.println("Измененный массив: ");
                        int[] x20 = n.deleteNegative(arr5);
                        for (int i = 0; i < x20.length; i++) {
                            out.print(x20[i] + " ");
                        }
                        break;
                }
                break;
        }
    }

    public int sumLastNums(int x) {
            x = x % 10 + x / 10 % 10;
            out.println("Сумма равна: ");
            return x;
    }

    public boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUpperCase(char x) {
        if ((65 <= x) && (x <= 90)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDivisor(int a, int b) {
        if ((a % b == 0) || (b % a == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int lastNumSum(int a, int b) {
        a = a % 10 + b % 10;
        return a;
    }

    public double safeDiv(int a, int b) {
        if ((a == 0) || (b == 0)) {
            return 0;
        } else {
            return (double) a / (double) b;
        }
    }

    public String makeDecision(int a, int b) {
        if (a > b) {
            return a + ">" + b;
        }
        if (a < b) {
            return a + "<" + b;
        } else {
            return a + "==" + b;
        }
    }

    public boolean sum3(int x, int y, int z) {
        if ((x + y == z) || (x + z == y) || (y + z == x)) {
            return true;
        } else {
            return false;
        }
    }

    public String age(int a) {
        int fl = a % 10;
        if ((fl == 1) && (fl != 11)) {
            return a + " год";
        } else if ((fl > 1) && (fl < 5) && (fl != 12) && (fl != 13) && (fl != 14)) {
            return a + " года";
        } else {
            return a + " лет";
        }
    }

    public void printDays(String x) {
        switch (x) {
            case "Понедельник":
                out.println("Понедельник");
                out.println("Вторник");
                out.println("Среда");
                out.println("Четверг");
                out.println("Пятница");
                out.println("Суббота");
                out.println("Воскресенье");
                break;
            case "Вторник":
                out.println("Вторник");
                out.println("Среда");
                out.println("Четверг");
                out.println("Пятница");
                out.println("Суббота");
                out.println("Воскресенье");
                break;
            case "Среда":
                out.println("Среда");
                out.println("Четверг");
                out.println("Пятница");
                out.println("Суббота");
                out.println("Воскресенье");
                break;
            case "Четверг":
                out.println("Четверг");
                out.println("Пятница");
                out.println("Суббота");
                out.println("Воскресенье");
                break;
            case "Пятница":
                out.println("Пятница");
                out.println("Суббота");
                out.println("Воскресенье");
                break;
            case "Суббота":
                out.println("Суббота");
                out.println("Воскресенье");
                break;
            case "Воскресенье":
                out.println("Воскресенье");
                break;

        }
    }

    public String reverseListNums(int a) {
        while (a != -1) {
            out.print(a + " ");
            a -= 1;
        }
        return "";
    }

    public int pow(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        return c;
    }

    public boolean equalNum(int a) {
        int fn = a % 10;
        int b = a;
        int l = 0;
        while (b > 0) {
            b = b / 10;
            l++;
        }
        for (int i = 1; i < l; i++) {
            a = a / 10;
            out.println(a);
            if (fn != a % 10) {
                out.println(fn + " " + a % 10);
                return false;
            }

        }
        return true;
    }

    public void leftTriangle(int a) {
        String ans = "";
        for (int i = 1; i <= a; i++) {
            ans = ans + "*";
            out.println(ans);
        }
    }

    public void GuessGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        int k = 1;
        int ch;
        do {
            ch = sc.nextInt();
            out.println("Вы не угадали, введите число от 0 до 9: ");
            k++;
        } while (num != ch);
        out.println("Вы угадали!");
        out.println("Количество затраченных попыток: " + k);
    }

    public int findLast(int[] arr, int x) {
        int ind = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ind = i;
            }
        }
        return ind;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == pos) {
                newarr[i] = x;
            } else {
                newarr[i] = arr[i];
            }
        }
        return newarr;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = swap;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] newarr = new int[arr1.length + arr2.length];
        int c = 0;
        for (int i = 0; i < arr1.length; i++){
            newarr[i] = arr1[i];
            c++;
        }
        for (int j = 0; j < arr2.length; j++){
            newarr[c] = arr2[j];
            c++;
        }
        return newarr;
    }

    public int[] deleteNegative (int[] arr){
        int c = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0){
                c++;
            }
        }
        int[] newarr = new int[c];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0){
                newarr[j] = arr[i];
                j++;
            }
        }
        return newarr;
    }
}

