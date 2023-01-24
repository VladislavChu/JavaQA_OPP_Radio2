package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
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
        Radio radioStationNumber = new Radio();
        radioStationNumber.setCurrentRadioStationNumber(stationNum);

        int actual = radioStationNumber.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "0,9",
            "9,8",
            "1,0",
            "2,1"
    })
    public void shouldNextRadioStationIfBorderValue(int expected, int station) {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(station);

        radioStation.nextRadioStationNumber();

        int actual = radioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,5",
            "9,0",
            "8,9",
            "0,1",
            "1,2"
    })
    public void shouldPrevRadioStationIfBorderValue(int expected, int station) {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(station);

        radioStation.prevRadioStationNumber();

        int actual = radioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "5,5",
            "0, 11",
            "1,1",
            "0,0",
            "9,9",
            "10,10",
    })
    public void inBorderAndAboveBelowBorderVolume(int expected, int volumeVal) {
        Radio volume = new Radio();
        volume.setCurrentVolume(volumeVal);

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "1,0",
            "2,1",
            "9,8",
            "10,9",
            "10,10"
    })
    public void shouldToIncreaseVolume(int expected, int volumeVal) {
        Radio volume = new Radio();
        volume.setCurrentVolume(volumeVal);

        volume.increaseVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,1",
            "4,5",
            "9,10",
            "8,9"
    })
    public void shouldToDecreaseVolume(int expected, int volumeVal) {
        Radio volume = new Radio();
        volume.setCurrentVolume(volumeVal);

        volume.decreaseVolume();

        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
