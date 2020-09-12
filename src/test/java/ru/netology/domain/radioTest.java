
package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void SetCurrentStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(4);
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void increaseStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(3);
        radio.increaseStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
        }
    @Test
    public void decreaseStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(3);
        radio.decreaseStation();
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void increaseStationOverMax() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void decreaseStationBelowMin() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void SetCurrentVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(3);
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        int expected = 4;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void DecreaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        int expected = 2;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void IncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void DecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
}

