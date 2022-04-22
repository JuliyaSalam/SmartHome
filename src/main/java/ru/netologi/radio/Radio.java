package ru.netologi.radio;

public class Radio {
    private int radioStationNumber;
    private int radioStationVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }
    public int getRadioStationVolume() {
        return radioStationVolume;
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

    public void setRadioStationVolume(int radioStationVolume) {
        if (radioStationVolume < 0) {
            return;
        }
        if (radioStationVolume > 10) {
            return;
        }
        this.radioStationVolume = radioStationVolume;
    }

    public void setNext() {
        if (radioStationNumber > 8) {
            this.radioStationNumber = 0;
        } else {
            this.radioStationNumber = radioStationNumber + 1;
        }
    }

    public void setPriv() {
        if (radioStationNumber < 1) {
            this.radioStationNumber = 9;
        } else {
            this.radioStationNumber = radioStationNumber - 1;
        }
    }
    public void setRadioStationVolumeAp() {
        if (radioStationVolume > 9) {
            this.radioStationVolume = 10;
        }else {
            this.radioStationVolume = radioStationVolume + 1;
        }
    }

    public void setRadioStationVolumeDown() {
        if (radioStationVolume < 1) {
            this.radioStationVolume = 0;
        }else {
            this.radioStationVolume = radioStationVolume - 1;
        }
    }


}
