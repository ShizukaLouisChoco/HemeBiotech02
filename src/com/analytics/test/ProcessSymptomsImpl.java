package com.analytics.test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class who has a method which gets List and return map with counted and sorted symptoms
 * @author shizukatanigawa
 * @version 1.0.0
 */
public class ProcessSymptomsImpl implements ProcessSymptoms {

    /**
     * makeSortedMapFromList method
     * @param SymptomList : String data in List format
     * @return sorted map with the symptom in key and count of the symptom in value
     */
    public Map<String, Integer> makeSortedMapFromList(List<String> SymptomList) {
        Map<String, Integer> map = new TreeMap<>();
        for (String line : SymptomList) {
            Integer value = map.getOrDefault(line, 0);
            Integer newValue = value + 1;
            map.put(line, newValue);
        }

        return map;
    }
}