package impl;

import abstraction.Convert;
import exeption.Exeption;

public class ConvertImpl implements Convert {

    String[] rimBook = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII",
            "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV",
            "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII",
            "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
            "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

     /*
     Принимаем строку из консоли и строку формата чисел, если число арабское, то мы просто возвращаем его.
     Если число римское мы достаем его из пришедшей строки, и возвращаем его через convertGrek.
     */

    @Override
    public int converter1(String str, String numberFormat) {
        int num1 = 0;
        if (numberFormat.equals("Grek")) {
            try {
                num1 = Integer.parseInt(str.substring(0, str.indexOf(operationString(str))));
            } catch (NumberFormatException e) {
                throw new Exeption("Ошибка: Вводите числа от 1 до 10 или от I до X");
            }

            return num1;
        } else {
            String element = str.substring(0, str.indexOf(operationString(str)));
            return convertGrek(element);
        }
    }

     /*
     Принимаем строку из консоли и строку формата чисел, если число арабское, то мы просто возвращаем его.
     Если число римское мы достаем его из пришедшей строки, и возвращаем его через convertGrek.
     */

    @Override
    public int converter2(String str, String numberFormat) {
        int num2 = 0;
        if (numberFormat.equals("Grek")) {
            try {
                num2 = Integer.parseInt(str.substring(str.indexOf(operationString(str)) + 1));
            } catch (NumberFormatException e) {
                throw new Exeption("Ошибка: Вводите числа от 1 до 10 или от I до X");
            }

            return num2;
        } else {
            String element = str.substring(str.indexOf(operationString(str)) + 1);
            return convertGrek(element);
        }
    }

     /*
     Принимаем на вход строку с операцией и возвращаем соответствующий знак + - / *
      */

    @Override
    public String operationString(String str) {
        String[] checkOperation = {"+", "-", "/", "*",};
        String operation = null;
        for (int i = 0; i < checkOperation.length; i++) {
            if (str.contains(checkOperation[i])) {
                operation = checkOperation[i];
            }
        }
        return operation;
    }

    /*
     Принмием число и возвращаем значение в римском формате.
     */

    @Override
    public String convertRim(int a) {
        for (int i = rimBook.length; i > 0; i--) {
            if (a == i) {
                return rimBook[i - 1];
            }
        }
        throw new Exeption("Ошибка: Результатом операции с римскими числами - не может быть отрицательное число!");

    }

    /*
    Принмием строку и возвращаем значение в арабском формате.
    */

    @Override
    public int convertGrek(String str) {
        for (int i = 0; i < rimBook.length; i++) {
            if (str.equals(rimBook[i])) {
                return i + 1;
            }
        }
        return 0;
    }
}
