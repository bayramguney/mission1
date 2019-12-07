package day47.example.javaInterface.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1. copy test and paste to word document
        CopyToWord ctw = new CopyToWord();
        ctw.copyPaste();

        //2. copy test and paste to excel document
        CopyToExcel cte = new CopyToExcel();
        cte.copyPaste();

        CopyToPowerPoint ctp = new CopyToPowerPoint();
        ctp.copyPaste();

//        CopyAndPastingToFile s = new CopyAndPastingToFile();

        CopyAndPastingToFile cp1 = new CopyToWord();
        CopyAndPastingToFile cp2 = new CopyToExcel();
        CopyAndPastingToFile cp3 = new CopyToPowerPoint();

        cp1.copyPaste();
        CopyAndPastingToFile.run();

        double area = Constants.PI * 10;

        /// same as list
        List<Integer> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
    }
}
