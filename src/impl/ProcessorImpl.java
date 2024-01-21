package impl;

import abstraction.Processor;

public class ProcessorImpl implements Processor {


    /*
      Проверяем какие пользователь вводит числа арабские или римские.
    */


    @Override
    public String processor(String str) {
        if (str.contains("I") || str.contains("V") || str.contains("X")) {
            return "Rim";
        } else return "Grek";
    }
}
