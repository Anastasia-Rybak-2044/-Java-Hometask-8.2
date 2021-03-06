package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void increaseStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else currentStation = ++currentStation;
    }

    public void decreaseStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else currentStation = --currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume = ++currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume = --currentVolume;
    }
}
