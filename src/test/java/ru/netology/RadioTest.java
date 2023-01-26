package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNew() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNewSecond() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void actualNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void givePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.prevRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneMorePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNew() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNewSecond() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        radio.nextCurrentVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGiveCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.nextCurrentVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGiveVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.nextCurrentVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.nextCurrentVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givePrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.prevVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.prevVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInRange() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(25);

        int actual = radio.getCurrentRadioStation();
        int expected = 25;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOutOfRange() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(35);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        int actual = radio.getCurrentRadioStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeInRange() {
        Radio radio = new Radio(100);

        radio.setCurrentVolume(65);

        int actual = radio.getCurrentVolume();
        int expected = 65;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeOutOfRange() {
        Radio radio = new Radio(100);

        radio.setCurrentVolume(150);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxLimit() {
        Radio radio = new Radio(100);

        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinLimit() {
        Radio radio = new Radio(100);

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
