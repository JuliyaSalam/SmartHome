package ru.netologi.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void getRadioStationNumberTest() {
        Radio stat = new Radio();
     stat.setRadioStationNumber(2);

     int expected = 2;
     int actual = stat.getRadioStationNumber();

     assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberTestMax() {
        Radio stat = new Radio();
        stat.setRadioStationNumber(11);
        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setRadioStationNumberTestMin() {
        Radio stat = new Radio();
        stat.setRadioStationNumber(-2);
        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setRadioStationNumberTestAverage() {
        Radio stat = new Radio();
        stat.setRadioStationNumber(5);
        int expected = 5;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextAverage() {
        Radio stat = new Radio();
        stat.setNext(5);
        int expected = 6;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextMax() {
        Radio stat = new Radio();
        stat.setNext(9);
        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPrivMin() {
        Radio stat = new Radio();
        stat.setPriv(0);
        int expected = 9;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPrivAverage() {
        Radio stat = new Radio();
        stat.setPriv(5);
        int expected = 4;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void getIncreaseVolume() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(2);

        int expected = 2;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeMax() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(11);

        int expected = 0;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeMin() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(-1);

        int expected = 0;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeAverage() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(5);

        int expected = 5;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeApMax() {
        Radio stat = new Radio();
        stat.setIncreaseVolumeAp(10);

        int expected = 10;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeApAverage() {
        Radio stat = new Radio();
        stat.setIncreaseVolumeAp(5);

        int expected = 6;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeDownMin() {
        Radio stat = new Radio();
        stat.setIncreaseVolumeDown(0);

        int expected = 0;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeDownAverage() {
        Radio stat = new Radio();
        stat.setIncreaseVolumeDown(5);

        int expected = 4;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
}