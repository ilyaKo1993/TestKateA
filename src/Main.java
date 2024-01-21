import abstraction.*;
import exeption.Exeption;
import impl.*;

public class Main {
    static String numberFormat = "Grek";

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ввод:");
            Input input = new InputImpl();
            Validation validator = new ValidationImpl();
            Processor processor = new ProcessorImpl();
            Convert converter = new ConvertImpl();
            Operation calculatorOperation = new OperationImpl();
            Output output = new OutputImpl();

            String strInConsole = input.inputNext();
            validator.validationCheck(strInConsole);

            numberFormat = processor.processor(strInConsole);
            String operation = converter.operationString(strInConsole);
            if (operation == null) {
                throw new Exeption("Ошибка: Вводите корректный знак + - / *");
            }
            int number1 = converter.converter1(strInConsole, numberFormat);
            int number2 = converter.converter2(strInConsole, numberFormat);
            if (number1 > 10 || number1 < 1 || number2 > 10 || number2 < 1) {
                throw new Exeption("Ошибка: Вводите числа от 1 до 10 или от I до X");
            }
            int result = 0;

            if (operation.equals("+")) {
                result = calculatorOperation.plus(number1, number2);
            } else if (operation.equals("-")) {
                result = calculatorOperation.minus(number1, number2);
            } else if (operation.equals("*")) {
                result = calculatorOperation.multi(number1, number2);
            } else if (operation.equals("/")) {
                result = calculatorOperation.division(number1, number2);
            } else
                throw new Exeption("Ошибка ввода !!!");
            if (numberFormat.equals("Grek")) {
                output.print("" + result);
            } else if (numberFormat.equals("Rim")) {
                output.print(converter.convertRim(result));
            }


        }

    }

}
