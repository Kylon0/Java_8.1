import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setStation() {
        Radio station = new Radio();

        station.selectStation(4);

        int expected = 4;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStation2() {
        Radio station = new Radio(100);

        station.selectStation(85);

        int expected = 85;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setBorderStation() {
        Radio station = new Radio();

        station.selectStation(-1);
        station.selectStation(0);
        station.nextStation();
        station.prevStation();
        station.prevStation();
        station.nextStation();
        station.selectStation(10);
    }

    @Test
    public void getVolume() {
        Radio station = new Radio();
        station.setMinVolume();
        station.getCurrentVolume();
        station.minusVolume();
        station.plusVolume();
    }

    @Test
    public void getVolume2() {
        Radio station = new Radio();
        station.setMaxVolume();
        station.getCurrentVolume();
        station.plusVolume();
        station.minusVolume();
    }

    @Test
    public void selectVolume() {
        Radio station = new Radio();
        station.selectVolume(50);
        station.selectVolume(-1);
        station.selectVolume(101);
    }
}
