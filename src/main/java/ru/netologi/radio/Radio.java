package ru.netologi.radio;

public class Radio {
    private int radioStationNumber;
    private int radioStationVolume;
    private int radioStationQuantityNumber = 10;
    private int radioStationVolumeMax = 100;

    public Radio() {
    }

    public Radio(int radioStationQuantityNumber) {
        this.radioStationQuantityNumber = radioStationQuantityNumber;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getRadioStationVolume() {
        return radioStationVolume;
    }

    public int getRadioStationQuantityNumber() {
        return radioStationQuantityNumber;
    }

    public int getRadioStationVolumeMax() {
        return radioStationVolumeMax;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > radioStationQuantityNumber - 1) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public void setRadioStationVolume(int radioStationVolume) {
        if (radioStationVolume < 0) {
            return;
        }
        if (radioStationVolume > radioStationVolumeMax) {
            return;
        }
        this.radioStationVolume = radioStationVolume;
    }

    public void setRadioStationQuantityNumber(int radioStationQuantityNumber) {
        if (radioStationQuantityNumber < 0) {
            return;
        }
        this.radioStationQuantityNumber = radioStationQuantityNumber;
    }


    public void setRadioStationVolumeMax(int radioStationVolumeMax) {
        if (radioStationVolumeMax < 0) {
            return;
        }
        this.radioStationVolumeMax = radioStationVolumeMax;
    }

    public void setNext() {
        if (radioStationNumber > radioStationQuantityNumber - 2) {
            this.radioStationNumber = 0;
        } else {
            this.radioStationNumber = radioStationNumber + 1;
        }
    }

    public void setPriv() {
        if (radioStationNumber < 1) {
            this.radioStationNumber = radioStationQuantityNumber - 1;
        } else {
            this.radioStationNumber = radioStationNumber - 1;
        }
    }

    public void setRadioStationVolumeAp() {
        if (radioStationVolume > radioStationVolumeMax - 2) {
            this.radioStationVolume = radioStationVolumeMax;
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
