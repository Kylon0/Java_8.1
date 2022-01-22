public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setMinVolume() {
        currentVolume = minVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }

    public void selectStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void plusVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void minusVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }
}
