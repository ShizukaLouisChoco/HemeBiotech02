package com.analytics.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Program for an Application which gets, counts and sorts symptoms from Symptoms.txt and make results.out.txt.
 *
 * @author shizukatanigawa
 * @version 1.0.0
 */


public class AnalyticsApplication {
    private static final String filepath = "resource/symptoms.txt";
    private static final String writeFilepath = "resource/results.out.txt";

    /**
     * main method
     */
    public static void main(String[] args) throws IOException {

        ReadSymptomData myReader = new ReadSymptomDataFromFile(filepath);
        List<String> mySymptomList = myReader.getSymptoms();

        ProcessSymptoms myProcessSymptoms = new ProcessSymptomsImpl();
        Map<String, Integer> mySymptomMap = myProcessSymptoms.makeSortedMapFromList(mySymptomList);

        WriteSymptoms myFileMaker = new WriteSymptomsInFile(writeFilepath);
        myFileMaker.writeSymptomFileFromMap(mySymptomMap);
    }
}
