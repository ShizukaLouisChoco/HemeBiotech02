package com.analytics.test;

import java.util.Map;

/**
 * Make Map typed data to .txt data
 * filepath will be defined in main method (writeFilepath)
 *
 */
public interface WriteSymptoms {
    /**
     *makeSymptomFileFromMap method
     * @param symptomData: Map typed data with string data (Symptom name)in key and Integer data(Counts of symptoms) in value
     */
    void writeSymptomFileFromMap(Map<String, Integer> symptomData) ;

    }
