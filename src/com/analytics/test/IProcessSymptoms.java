package com.analytics.test;

import java.util.List;
import java.util.Map;

/**
 * It gets data in List type counts duplicate elements and sorts by keys automatically using TreeMap
 */
public interface IProcessSymptoms {
    /**
     *makeSortedMapFromList method
     *
     * @param SymptomList : String data in List type
     * @return TreeMap type data with symptom names in key and counts in value
     */
    Map<String, Integer> makeSortedMapFromList(List<String> SymptomList) ;


}