package com.analytics.test;

import java.util.List;
import java.util.Map;

public class    AnalyticsApplication {
    public static void main(String[] args) {

        String filepath = "ressource/symptoms.txt";
        String writeFilepath ="ressource/output.txt";
        IReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile(filepath);
        List<String> mySymptomList = myReader.GetSymptoms();
        IProcessSymptoms myProcessSymptoms = new ProcessSymptoms();
        Map<String, Integer> mySymptomMap = myProcessSymptoms.makelistToSortedMap(mySymptomList) ;
        IMakeSymptomFile myFileMaker = new MakeSymptomFile(writeFilepath);
        myFileMaker.makeSymptomFileFromMap(mySymptomMap);


    }
}
