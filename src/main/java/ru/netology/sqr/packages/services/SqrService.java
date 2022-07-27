package ru.netology.sqr.packages.services;

public class SqrService {

    public int calcSqr(int FirBorder, int SecBorder) {// границы диапазона
        int num = 0;
        for (int i = 10; i <= 99; i++) { //по условиям числа квадрат которых проверяем в диапазоне от 10 до 99
            if (i * i >= FirBorder) {
                num = i - 10; // -10 делаем т.к. первые числа у нас не считаются
            }
            if (i * i > SecBorder) {
                break;
            }
        }
        return num;
    }
}
