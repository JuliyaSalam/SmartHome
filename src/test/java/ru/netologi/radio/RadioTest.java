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
        stat.setRadioStationNumber(5);
        stat.setNext();
        int expected = 6;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextMax() {
        Radio stat = new Radio();
        stat.setRadioStationNumber(9);
        stat.setNext();
        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPrivMin() {
        Radio stat = new Radio();
        stat.setRadioStationNumber(0);
        stat.setPriv();
        int expected = 9;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPrivAverage() {
        Radio stat = new Radio();
        stat.setRadioStationNumber(5);
        stat.setPriv();
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
        stat.setIncreaseVolume(10);
        stat.setIncreaseVolumeAp();

        int expected = 10;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeApAverage() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(5);
        stat.setIncreaseVolumeAp();

        int expected = 6;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeDownMin() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(0);
        stat.setIncreaseVolumeDown();

        int expected = 0;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setIncreaseVolumeDownAverage() {
        Radio stat = new Radio();
        stat.setIncreaseVolume(5);
        stat.setIncreaseVolumeDown();

        int expected = 4;
        int actual = stat.getIncreaseVolume();

        assertEquals(expected, actual);
    }
}