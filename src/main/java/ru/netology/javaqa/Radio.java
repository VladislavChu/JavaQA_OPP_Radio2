package ru.netology.javaqa;

public class Radio {

    private int currentRadioStationNumber;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber >= maxStation) {
            currentRadioStationNumber = minStation;
            return;
        }
        currentRadioStationNumber++;
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber <= minStation) {
            currentRadioStationNumber = maxStation;
            return;
        }
        currentRadioStationNumber--;
        setCurrentRadioStationNumber(currentRadioStationNumber);

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
