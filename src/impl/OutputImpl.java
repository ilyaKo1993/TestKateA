package impl;

import abstraction.Output;

public class OutputImpl implements Output {

    /*
    Принимаем строку и выводим в консоль.
     */

    @Override
    public void print(String str) {

        System.out.println("Ответ: " + str);

    }
}
