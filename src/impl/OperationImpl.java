package impl;

import abstraction.Operation;

public class OperationImpl implements Operation {

    /*
      Основные методы для работы с калькулятором, принмают на вход 2 числа и возвращают их значение.
     */

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multi(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
