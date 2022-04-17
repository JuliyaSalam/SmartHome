package ru.netologi.radio;

public class Radio {
    private int radioStationNumber;
    private int increaseVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }
    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public void setIncreaseVolume(int increaseVolume) {
        if (increaseVolume < 0) {
            return;
        }
        if (increaseVolume > 10) {
            return;
        }
        this.increaseVolume = increaseVolume;
    }

    public void setNext(int radioStationNumber) {
        if (radioStationNumber > 8) {
            this.radioStationNumber = 0;
        } else {
            this.radioStationNumber = radioStationNumber + 1;
        }
    }

    public void setPriv(int radioStationNumber) {
        if (radioStationNumber < 1) {
            this.radioStationNumber = 9;
        } else {
            this.radioStationNumber = radioStationNumber - 1;
        }
    }
    public void setIncreaseVolumeAp(int increaseVolume) {
        if (increaseVolume > 9) {
            this.increaseVolume = 10;
        }else {
            this.increaseVolume = increaseVolume + 1;
        }
    }

    public void setIncreaseVolumeDown(int increaseVolume) {
        if (increaseVolume < 1) {
            this.increaseVolume = 0;
        }else {
            this.increaseVolume = increaseVolume - 1;
        }
    }


}
