package com.analytics.test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProcessSymptoms implements IProcessSymptoms {

    public Map<String, Integer> listToSortedMap(List<String> SymptomList) {
        Map<String, Integer> map = new TreeMap<>();
        for (String line : SymptomList) {
            Integer value = map.getOrDefault(line, 0);
            Integer newValue = value + 1;
            map.put(line, newValue);
        }
        return map;

    }

}