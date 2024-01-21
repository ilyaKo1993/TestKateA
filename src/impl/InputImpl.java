package impl;

import abstraction.Input;

import java.util.Scanner;

public class InputImpl implements Input {

    /*
      Читаем строку с консоли и возвращаем ее.
    */


    @Override
    public String inputNext() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
