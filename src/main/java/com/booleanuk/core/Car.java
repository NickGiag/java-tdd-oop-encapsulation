package com.booleanuk.core;


public class Car {
    private String colour;
    private String battaryType;
    private boolean isAdvanced;
    private int percentageRemaining;

    public Car() {
        colour = "blue";
        battaryType = "lithium";
        isAdvanced = false;
        percentageRemaining=100;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBattaryType() {
        return battaryType;
    }

    public void setBattaryType(String battaryType) {
        this.battaryType = battaryType;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(boolean advanced) {
        isAdvanced = advanced;
    }

    public int getPercentageRemaining() {
        return percentageRemaining;
    }

    public void setPercentageRemaining(int percentageRemaining) {
        this.percentageRemaining = percentageRemaining;
    }
}
