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
        int actual = stat.getRadioStationQuantityNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void getRadioStationNumberMaxTestLess10() {
        stat.setRadioStationQuantityNumber(5);

        int expected = 5;
        int actual = stat.getRadioStationQuantityNumber();

        assertEquals(expected, actual);
    }
    @Test
    public void getRadioStationNumberMaxTestLess0() {
        stat.setRadioStationQuantityNumber(-5);

        int expected = 10;
        int actual = stat.getRadioStationQuantityNumber();

        assertEquals(expected, actual);
    }
    @Test
    public void getRadioStationVolumeMax() {
        stat.setRadioStationVolumeMax(50);

        int expected = 50;
        int actual = stat.getRadioStationVolumeMax();

        assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationVolumeMaxlessMin() {
        stat.setRadioStationVolumeMax(-1);

        int expected = 100;
        int actual = stat.getRadioStationVolumeMax();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberMore10QuantityNumberTestMax() {
        Radio stat = new Radio(15);
        stat.setRadioStationNumber(15);

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumberLess10QuantityNumberTestMax() {
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
    void setNextMaxMore10QuantityNumber() {
        Radio stat = new Radio(15);
        stat.setRadioStationNumber(14);
        stat.setNext();

        int expected = 0;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setNextMaxless10QuantityNumber() {
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
    void setPrivMinMore10QuantityNumber() {
        Radio stat = new Radio(15);
        stat.setRadioStationNumber(0);
        stat.setPriv();

        int expected = 14;
        int actual = stat.getRadioStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    void setPrivMinless10QuantityNumber() {
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
    void setRadioStationVolumeMax() {
        stat.setRadioStationVolume(101);

        int expected = 0;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationVolumeMin() {
        stat.setRadioStationVolume(-1);

        int expected = 0;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationVolumeAverage() {
        stat.setRadioStationVolume(5);

        int expected = 5;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationVolumeApMax() {
        stat.setRadioStationVolume(100);
        stat.setRadioStationVolumeAp();

        int expected = 100;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationVolumeApAverage() {
        stat.setRadioStationVolume(50);
        stat.setRadioStationVolumeAp();

        int expected = 51;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationVolumeDownMin() {
        stat.setRadioStationVolume(0);
        stat.setRadioStationVolumeDown();

        int expected = 0;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationVolumeDownAverage() {
        stat.setRadioStationVolume(50);
        stat.setRadioStationVolumeDown();

        int expected = 49;
        int actual = stat.getRadioStationVolume();

        assertEquals(expected, actual);
    }
}