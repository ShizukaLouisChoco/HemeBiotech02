package com.analytics.test;

import java.util.List;
import java.util.Map;

public class    AnalyticsApplication {
    public static void main(String[] args) {

        String filepath = "ressource/symptoms.txt";
        String writeFilepath ="ressource/output.txt";
        ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(filepath);
        List<String> symptomList = read.GetSymptoms();
        ProcessSymptoms processSymptoms = new ProcessSymptoms();
        Map<String, Integer> symptomMap = processSymptoms.makelistToSortedMap(symptomList) ;
        MakeSymptomFile makeSymptomFile = new MakeSymptomFile(writeFilepath);
        makeSymptomFile.makeSymptomFileFromMap(symptomMap);


    }
}
