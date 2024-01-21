package impl;


import abstraction.Validation;
import exeption.Exeption;


public class ValidationImpl implements Validation {

    /*
        Метод проверяет строку от ввода пользователем не корректных данных.
     */

    @Override
    public boolean validationCheck(String str) {

        if (str.isEmpty()) {
            throw new Exeption("Ошибка: Пустая строка");
        } else if (str.length() > 9) {
            throw new Exeption("Ошибка: Похоже вы вводите что-то не нужное...");
        } else if (str.contains(" ")) {
            throw new Exeption("Ошибка: Вводить пробел нельзя !");
        }
        return false;
    }
}
