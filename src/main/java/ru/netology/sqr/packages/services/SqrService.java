package ru.netology.sqr.packages.services;

public class SqrService {

    public int calcSqr(int x, int y) {// границы диапазона
        for (int i = 10; i <= 99; i++) { //по условиям числа квадрат которых проверяем в диапазоне от 10 до 99
            if (i * i > y) {
                return i - 10; // -10 делаем т.к. первые числа у нас не считаются
            }
        }
        return -1;
    }
}
