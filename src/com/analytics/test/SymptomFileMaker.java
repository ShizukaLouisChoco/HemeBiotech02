package com.analytics.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class SymptomFileMaker implements ISymptomFileMaker {
    // field
    private final String filepath;

    // constructor
    public SymptomFileMaker(String filepath) {
        this.filepath = filepath;
    }

    public void symptomFileMaker(Map<String, Integer> symptomData) {

        try {
            FileWriter writer = new FileWriter(filepath);
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer));
            for (Map.Entry<String, Integer> entry : symptomData.entrySet()) {
                printWriter.println(entry.getKey() + ":" + entry.getValue());
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
