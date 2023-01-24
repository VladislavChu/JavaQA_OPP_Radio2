package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {


    @ParameterizedTest
    @CsvSource({
            "5,5",
            "0,0",
            "0,-1",
            "1,1",
            "0,10",
            "9,9",
            "8,8",
    })
    public void InBorderAndAboveBelowStationNumValue(int expected, int stationNum) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(stationNum);

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IfUserSetMaxStation() {
        Radio radio = new Radio(45);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(44, radio.getMaxStation());
    }

    @ParameterizedTest
    @CsvSource({
            "15,14",
            "1,0",
            "2,1",
            "29,28",
            "28,27",
            "0,29"
    })
    public void shouldNextRadioStationIfBorderValue(int expected, int stationNum) {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStationNumber(stationNum);

        radio.nextRadioStationNumber();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "14,15",
            "29,0",
            "0,1",
            "1,2",
            "28,29",
            "27,28"
    })
    public void shouldPrevRadioStationIfBorderValue(int expected, int stationNum) {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStationNumber(stationNum);

        radio.prevRadioStationNumber();

        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "50,50",
            "0,0",
            "1,1",
            "99,99",
            "100,100",
            "0,101",
            "0,-1"
    })
    public void inBorderAndAboveBelowBorderVolume(int expected, int volumeVal) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volumeVal);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "51,50",
            "1,0",
            "2,1",
            "99,98",
            "100,99",
            "100,100"
    })
    public void shouldToIncreaseVolume(int expected, int volumeVal) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volumeVal);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,1",
            "1,2",
            "50,51",
            "99,100",
            "98,99"
    })
    public void shouldToDecreaseVolume(int expected, int volumeVal) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volumeVal);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
