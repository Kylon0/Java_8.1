public class Radio {
    int currentStation;
    int currentVolume;
    int minStation = 0;
    int maxStation = 9;
    int minVolume = 0;
    int maxVolume = 10;

    public int nextStation(int currentStation) {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
        return currentStation;
    }

    public int prevStation(int currentStation) {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
        return currentStation;
    }

    public void selectStation(int station) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void plusVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void minusVolume(int currentVolume) {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }
}
