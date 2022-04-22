package ru.netologi.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio stat = new Radio();

    @Test
    public void getRadioStationNumberTest() {
        stat.setRadioStationNumber(2);

        int expected = 2;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void getRadioStationNumberMaxTestMore10() {
        Radio stat = new Radio(15);
        int expected = 15;
        int actual = stat.getRadioStationNumberMax();

        assertEquals(expected, actual);
    }

    @Test
    public void getRadioStationNumberMaxTestLess10() {
        stat.setRadioStationNumberMax(5);

        int expected = 5;
        int actual = stat.getRadioStationNumberMax();

        assertEquals(expected, actual);
    }
    @Test
    public void getRadioStationNumberMaxTestLess0() {
        stat.setRadioStationNumberMax(-5);

        int expected = 10;
        int actual = stat.getRadioStationNumberMax();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberMore10NumberMaxTestMax() {
        Radio stat = new Radio(15);
        stat.setRadioStationNumber(15);

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberLess10NumberMaxTestMax() {
        Radio stat = new Radio(5);
        stat.setRadioStationNumber(5);

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberTestMax() {
        stat.setRadioStationNumber(11);

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberTestMin() {
        stat.setRadioStationNumber(-2);

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberTestAverage() {
        stat.setRadioStationNumber(5);

        int expected = 5;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setNextAverage() {
        stat.setRadioStationNumber(5);
        stat.setNext();

        int expected = 6;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextMaxMore10NumberMax() {
        Radio stat = new Radio(15);
        stat.setRadioStationNumber(14);
        stat.setNext();

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextMaxless10NumberMax() {
        Radio stat = new Radio(5);
        stat.setRadioStationNumber(4);
        stat.setNext();

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextMax() {
        stat.setRadioStationNumber(9);
        stat.setNext();

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPrivMinMore10NumberMax() {
        Radio stat = new Radio(15);
        stat.setRadioStationNumber(0);
        stat.setPriv();

        int expected = 14;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setPrivMinless10NumberMax() {
        Radio stat = new Radio(5);
        stat.setRadioStationNumber(0);
        stat.setPriv();

        int expected = 4;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setPrivMin() {
        stat.setRadioStationNumber(0);
        stat.setPriv();

        int expected = 9;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPrivAverage() {
        stat.setRadioStationNumber(5);
        stat.setPriv();

        int expected = 4;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void getRadioStationVolume() {
        stat.setRadioStationVolume(2);

        int expected = 2;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeMax() {
        stat.setRadioStationVolume(11);

        int expected = 0;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeMin() {
        stat.setRadioStationVolume(-1);

        int expected = 0;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeAverage() {
        stat.setRadioStationVolume(5);

        int expected = 5;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeApMax() {
        stat.setRadioStationVolume(10);
        stat.setRadioStationVolumeAp();

        int expected = 10;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeApAverage() {
        stat.setRadioStationVolume(5);
        stat.setRadioStationVolumeAp();

        int expected = 6;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeDownMin() {
        stat.setRadioStationVolume(0);
        stat.setRadioStationVolumeDown();

        int expected = 0;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeDownAverage() {
        stat.setRadioStationVolume(5);
        stat.setRadioStationVolumeDown();

        int expected = 4;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }
}