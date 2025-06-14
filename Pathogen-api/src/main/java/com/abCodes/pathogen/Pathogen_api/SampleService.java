package com.abCodes.pathogen.Pathogen_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService {
    private List<Sample> samples = new ArrayList<>();

    // Classification Logic
    public String classifySample(int red, int green, int brightness) {
        if (brightness < 50) {
            return "Failed";
        } else if (red >= green + 50) {
            return "Positive";
        } else if (green >= red + 50) {
            return "Negative";
        } else {
            return "Inconclusive";
        }
    }

    public void addSample(Sample sample) {
        sample.setClassification(classifySample(sample.getRed(), sample.getGreen(), sample.getBrightness()));
        samples.add(sample);
    }

    public List<Sample> getSamplesByStatus(String status) {
        List<Sample> filteredSamples = new ArrayList<>();
        for (Sample sample : samples) {
            if (sample.getClassification().equalsIgnoreCase(status)) {
                filteredSamples.add(sample);
            }
        }
        return filteredSamples;
    }

    public List<Sample> getAllSamples() {
        return samples;
    }
}
