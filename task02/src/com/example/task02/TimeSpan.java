package com.example.task02;

public class TimeSpan {

    private int inHours;
    private int inMinutes;
    private int inSeconds;

    public TimeSpan( int hours, int minutes, int seconds){
        inHours = hours;
        inMinutes = minutes;
        inSeconds = seconds;
    }

    public int GetHours(){
        return inHours;
    }
    public void SetHours(int inHours){
        this.inHours = inHours;
    }

    public int GetMinutes(){
        return inMinutes;
    }
    public void SetMinutes(int inMinutes){
        this.inMinutes = inMinutes;
    }

    public int GetSeconds(){
        return inSeconds;
    }
    public void SetSeconds(int inSeconds){
        this.inSeconds = inSeconds;
    }

    void add(TimeSpan time){
        this.inHours += time.inHours;
        this.inMinutes += time.inMinutes;
        this.inSeconds += time.inSeconds;
    }

    void subtract(TimeSpan time){
        this.inHours -= time.inHours;
        this.inMinutes -= time.inMinutes;
        this.inSeconds -= time.inSeconds;
    }

    public String toString(){
        return String.format("Интервал времени: %d часов %d минут %d сек", inHours, inMinutes, inSeconds);
    }

}
