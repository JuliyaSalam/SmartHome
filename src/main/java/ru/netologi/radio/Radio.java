package ru.netologi.radio;

public class Radio {
    private int radioStationNumber;
    private int radioStationVolume;
    private int radioStationNumberMax = 10;

    public Radio () {
    }

    public Radio (int radioStationNumberMax) {
        this.radioStationNumberMax = radioStationNumberMax;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getRadioStationVolume() {
        return radioStationVolume;
    }

    public int getRadioStationNumberMax() {
        return radioStationNumberMax;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > radioStationNumberMax-1) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public void setRadioStationVolume(int radioStationVolume) {
        if (radioStationVolume < 0) {
            return;
        }
        if (radioStationVolume > 10) {
            return;
        }
        this.radioStationVolume = radioStationVolume;
    }

    public void setRadioStationNumberMax(int radioStationNumberMax) {
        if (radioStationNumberMax < 0) {
            return;
        }
        this.radioStationNumberMax = radioStationNumberMax;
    }


    public void setNext() {
        if (radioStationNumber > radioStationNumberMax - 2) {
            this.radioStationNumber = 0;
        } else {
            this.radioStationNumber = radioStationNumber + 1;
        }
    }

    public void setPriv() {
        if (radioStationNumber < 1) {
            this.radioStationNumber = radioStationNumberMax - 1;
        } else {
            this.radioStationNumber = radioStationNumber - 1;
        }
    }

    public void setRadioStationVolumeAp() {
        if (radioStationVolume > 9) {
            this.radioStationVolume = 10;
        } else {
            this.radioStationVolume = radioStationVolume + 1;
        }
    }

    public void setRadioStationVolumeDown() {
        if (radioStationVolume < 1) {
            this.radioStationVolume = 0;
        } else {
            this.radioStationVolume = radioStationVolume - 1;
        }
    }


}
