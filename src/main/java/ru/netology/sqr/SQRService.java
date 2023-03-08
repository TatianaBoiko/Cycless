package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int firstNum, int secondNum) {

        int quantity = 0;

        for (int i = 10; i < 100; i++) {
            if ((i * i >= firstNum) && (i * i <= secondNum)) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}
