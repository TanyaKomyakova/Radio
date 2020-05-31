package ru.netology.domain;

public class Radio {
    private String name = "Panasonic";
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 10;
    private int minSoundVolume = 0;

    public void switchingTheRadioStationToTheNext() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;

    }

    public void switchingTheRadioStationToThePreviousOne(){
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void increaseSoundVolume(){
        if (currentSoundVolume >= maxSoundVolume){
            return;
        }
        currentSoundVolume++;
    }

    public void decreaseSoundVolume(){
        if (currentSoundVolume <= minSoundVolume){
            return;
        }
        currentSoundVolume--;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }
}
