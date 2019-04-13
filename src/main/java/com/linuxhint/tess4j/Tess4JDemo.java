package com.linuxhint.tess4j;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Tess4JDemo {

    private static Tesseract getTesseract() {
        Tesseract instance = new Tesseract();
        instance.setDatapath("/usr/local/Cellar/tesseract/4.0.0_1/share/tessdata");
        instance.setLanguage("eng");
        //instance.setHocr(true);
        return instance;
    }

    public static void main(String[] args) throws TesseractException {

        Tesseract tesseract = getTesseract();
        File file = new File("/Users/shubham/Desktop/tess4j.jpg");
        String result = tesseract.doOCR(file);
        System.out.println(result);
    }
}
