package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void switchingTheRadioStationToTheNext(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.switchingTheRadioStationToTheNext();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    void switchingTheRadioStationToThePreviousOne(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.switchingTheRadioStationToThePreviousOne();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    void radioStationSelection(){
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());

    }

    @Test
    void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    void decreaseSoundVolume(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }


}