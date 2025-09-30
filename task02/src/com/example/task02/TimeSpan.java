package com.example.task02;

public class TimeSpan {

    private int inHours;
    private int inMinutes;
    private int inSeconds;

    public TimeSpan( int hours, int minutes, int seconds){
        inHours = hours;
        inMinutes = minutes;
        inSeconds = seconds;
        transformTime();
    }

    public int getHours(){
        return inHours;
    }
    public void setHours(int inHours){
        if (inHours < 0) {
            throw new IllegalArgumentException("Часы не могут быть отрицательными");
        }
        this.inHours = inHours;
    }

    public int getMinutes(){
        return inMinutes;
    }
    public void setMinutes(int inMinutes){
        if (inMinutes < 0) {
            throw new IllegalArgumentException("Минуты не могут быть отрицательными");
        }
        this.inMinutes = inMinutes;
        transformTime();
    }

    public int getSeconds(){
        return inSeconds;
    }
    public void setSeconds(int inSeconds){
        if (inSeconds < 0) {
            throw new IllegalArgumentException("Секунды не могут быть отрицательными");
        }
        this.inSeconds = inSeconds;
        transformTime();
    }

    private void transformTime(){
        if(inSeconds >= 60) {
            inMinutes += inSeconds / 60;
            inSeconds %= 60;
        }

        if (inMinutes >= 60){
            inHours += inMinutes / 60;
            inMinutes %= 60;
        }

        // Обрабатываем отрицательные секунды
        if (inSeconds < 0){
            inSeconds = - inSeconds;
            int borrowMinutes = (inSeconds + 59) / 60;
            inMinutes -= borrowMinutes;
            inSeconds = (borrowMinutes * 60) - inSeconds;
        }

        // Обрабатываем отрицательные минуты
        if(inMinutes < 0){
            inMinutes = -inMinutes;
            int borrowHours = (inMinutes + 59) / 60;
            inHours -= borrowHours;
            inMinutes = (borrowHours * 60) - inMinutes;
        }
    }

    public void add(TimeSpan time){
        this.inHours += time.inHours;
        this.inMinutes += time.inMinutes;
        this.inSeconds += time.inSeconds;
        transformTime();
    }

    public void subtract(TimeSpan time){
        this.inHours -= time.inHours;
        this.inMinutes -= time.inMinutes;
        this.inSeconds -= time.inSeconds;
        transformTime(); // также исправляет отрицательное значение
    }

    public String toString(){
        return String.format("Временной интервал: %d ч %d мин %d сек", inHours, inMinutes, inSeconds);
    }

}
