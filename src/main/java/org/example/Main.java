package ru.netology.sqr;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        int firstNum = 250;
        int secondNum = 300;
        SQRService service = new SQRService();

        int result = service.calcSqrt(firstNum, secondNum);
        System.out.println("Количество квадратных корней в диапазоне от 10 до 99 составляет: " + result);

    }
}