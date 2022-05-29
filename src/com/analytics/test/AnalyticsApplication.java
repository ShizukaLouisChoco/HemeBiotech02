package com.analytics.test;

import java.util.List;
import java.util.Map;

public class    AnalyticsApplication {
    public static void main(String[] args) {

        String filepath = "ressource/symptoms.txt";
        String writeFilepath ="ressource/output.txt";
        ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile(filepath);
        List<String> mySymptomList = myReader.GetSymptoms();
        ProcessSymptoms myProcessSymptoms = new ProcessSymptoms();
        Map<String, Integer> mySymptomMap = myProcessSymptoms.makelistToSortedMap(mySymptomList) ;
        MakeSymptomFile myFileMaker = new MakeSymptomFile(writeFilepath);
        myFileMaker.makeSymptomFileFromMap(mySymptomMap);


    }
}
