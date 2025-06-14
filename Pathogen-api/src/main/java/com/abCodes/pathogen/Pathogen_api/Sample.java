package com.abCodes.pathogen.Pathogen_api;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
public class Sample {

    @Id
    private String sampleId;
    private int red;
    private int green;
    private int brightness;
    private String timestamp;
    private String classification;

    //Generate Constructor , Getters and Setters

    public Sample(String sampleId, int red, int green, int brightness, String timestamp, String classification) {
        this.sampleId = sampleId;
        this.red = red;
        this.green = green;
        this.brightness = brightness;
        this.timestamp = timestamp;
        this.classification = classification;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
