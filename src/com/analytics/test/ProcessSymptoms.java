package com.analytics.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProcessSymptoms implements IProcessSymptoms {

    public Map<String, Integer> listToMap(List<String> SymptomList) {
        Map<String, Integer> map = new HashMap<>();
        for (String line : SymptomList) {
            Integer value = map.getOrDefault(line, 0);
            Integer newValue = value + 1;
            map.put(line, newValue);
        }
        return map;

    }
}