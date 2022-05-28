package com.analytics.test;

import java.util.List;
import java.util.Map;

public class AnalyticsApplication {
    public static void main(String[] args) {

        String filepath = "ressource/symptoms.txt";
        String writeFilepath ="ressource/output.txt";
        ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(filepath);
        List<String> symptomList = read.GetSymptoms();
        ProcessSymptoms processSymptoms = new ProcessSymptoms();
        Map<String, Integer> symptomMap = processSymptoms.listToSortedMap(symptomList) ;
        SymptomFileMaker makeSymptomFile = new SymptomFileMaker(writeFilepath);
        makeSymptomFile.symptomFileMaker(symptomMap);


    }
}
