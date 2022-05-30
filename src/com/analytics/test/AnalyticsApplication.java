package com.analytics.test;

import java.util.List;
import java.util.Map;

/**
 * Program for an Application which gets, counts and sorts symptoms from Symptoms.txt and make results.out.txt.
 * @author shizukatanigawa
 * @version 1.0.0
 */


public class    AnalyticsApplication {
    /**
     * main method
     *
     */
    public static void main(String[] args)  {

        String filepath = "resource/symptoms.txt";
        String writeFilepath ="resource/results.out.txt";
        IReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile(filepath);
        List<String> mySymptomList = myReader.GetSymptoms();
        IProcessSymptoms myProcessSymptoms = new ProcessSymptoms();
        Map<String, Integer> mySymptomMap = myProcessSymptoms.makeSortedMapFromList(mySymptomList) ;
        IMakeSymptomFile myFileMaker = new MakeSymptomFile(writeFilepath);
        myFileMaker.makeSymptomFileFromMap(mySymptomMap);


    }
}
