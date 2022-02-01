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
        int actual1 = station.getCurrentStation();
        int expected1 = 0;
        assertEquals(expected1, actual1);
        station.selectStation(0);
        int actual2 = station.getCurrentStation();
        int expected2 = 0;
        assertEquals(expected2, actual2);
        station.nextStation();
        int actual3 = station.getCurrentStation();
        int expected3 = 1;
        assertEquals(expected3, actual3);
        station.prevStation();
        int actual4 = station.getCurrentStation();
        int expected4 = 0;
        assertEquals(expected4, actual4);
        station.prevStation();
        int actual5 = station.getCurrentStation();
        int expected5 = 9;
        assertEquals(expected5, actual5);
        station.nextStation();
        int actual6 = station.getCurrentStation();
        int expected6 = 0;
        assertEquals(expected6, actual6);
        station.selectStation(10);
        int actual7 = station.getCurrentStation();
        int expected7 = 0;
        assertEquals(expected7, actual7);
    }

    @Test
    public void getVolume() {
        Radio station = new Radio();
        station.setMinVolume();
        int actual1 = station.getCurrentVolume();
        int expected1 = 0;
        assertEquals(expected1, actual1);
        station.minusVolume();
        int actual2 = station.getCurrentVolume();
        int expected2 = 0;
        assertEquals(expected2, actual2);
        station.plusVolume();
        int actual3 = station.getCurrentVolume();
        int expected3 = 1;
        assertEquals(expected3, actual3);
    }

    @Test
    public void getVolume2() {
        Radio station = new Radio();
        station.setMaxVolume();
        int actual1 = station.getCurrentVolume();
        int expected1 = 100;
        assertEquals(expected1, actual1);
        station.plusVolume();
        int actual2 = station.getCurrentVolume();
        int expected2 = 100;
        assertEquals(expected2, actual2);
        station.minusVolume();
        int actual3 = station.getCurrentVolume();
        int expected3 = 99;
        assertEquals(expected3, actual3);
    }

    @Test
    public void selectVolume() {
        Radio station = new Radio();
        station.selectVolume(50);
        int actual1 = station.getCurrentVolume();
        int expected1 = 50;
        assertEquals(expected1, actual1);
        station.selectVolume(-1);
        int actual2 = station.getCurrentVolume();
        int expected2 = 50;
        assertEquals(expected2, actual2);
        station.selectVolume(101);
        int actual3 = station.getCurrentVolume();
        int expected3 = 50;
        assertEquals(expected3, actual3);
        //
    }
}