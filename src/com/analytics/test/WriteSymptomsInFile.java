package com.analytics.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author shizukatanigawa
 * @version 1.0.0
 */

public class WriteSymptomsInFile implements WriteSymptoms {
    // field
    private final String filepath;
    /**
     * MakeSymptomFile constructor
     * @param filepath : filepath to generate new .txt file
     */
    // constructor
    public WriteSymptomsInFile(String filepath) throws IOException {
        if(filepath == null)
            throw new IOException("The filepath cannot be null");
        this.filepath = filepath;
    }

    /**
     * Data will be written like : Name of symptom = counts of symptom
     * @param symptomData: Map typed data with string data (Symptom name)in key and Integer data(Counts of symptoms) in value
     */
    public void writeSymptomFileFromMap(Map<String, Integer> symptomData) {
        try {
            FileWriter writer = new FileWriter(filepath);
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer));
            for (Map.Entry<String, Integer> entry : symptomData.entrySet()) {
                String line = entry.getKey() + "=" + entry.getValue();
                printWriter.println(line);
                System.out.println(line);
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
