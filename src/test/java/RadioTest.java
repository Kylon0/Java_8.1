import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStation() {
        Radio station = new Radio();
        station.currentStation = 4;

        station.selectStation(station.currentStation);
        station.nextStation(station.currentStation);
        station.prevStation(station.currentStation);
    }

    @Test
    public void setStation2() {
        Radio station = new Radio();
        station.currentStation = 10;

        station.selectStation(station.currentStation);
    }

    @Test
    public void setStation3() {
        Radio station = new Radio();
        station.currentStation = -1;

        station.selectStation(station.currentStation);
    }

    @Test
    public void setStation4() {
        Radio station = new Radio();
        station.currentStation = 0;

        station.prevStation(station.currentStation);
    }

    @Test
    public void setStation5() {
        Radio station = new Radio();
        station.currentStation = 9;

        station.nextStation(station.currentStation);
    }

    @Test
    public void setVolume1() {
        Radio volume = new Radio();
        volume.currentVolume = 10;

        volume.plusVolume(volume.currentVolume);
    }

    @Test
    public void setVolume2() {
        Radio volume = new Radio();
        volume.currentVolume = 5;

        volume.plusVolume(volume.currentVolume);
    }

    @Test
    public void setVolume3() {
        Radio volume = new Radio();
        volume.currentVolume = 0;

        volume.minusVolume(volume.currentVolume);
    }

    @Test
    public void setVolume4() {
        Radio volume = new Radio();
        volume.currentVolume = 5;

        volume.minusVolume(volume.currentVolume);
    }
}
