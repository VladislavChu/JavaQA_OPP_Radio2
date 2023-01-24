package ru.netology.javaqa;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentRadioStationNumber = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
    }

    public Radio(){

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minStation) {
            return;
        }
        if (newCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //public int getMaxVolume() {
    //    return maxVolume;
    //}

    //public int getMinVolume(){
    //    return minVolume;
    //}

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
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
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
