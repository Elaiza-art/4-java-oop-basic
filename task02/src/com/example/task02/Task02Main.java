package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(1,100,130);
        System.out.println("Время 1" + time1);
        TimeSpan time2 = new TimeSpan(0,90,0);
        System.out.println("Время 2" + time2);

        System.out.println("Часы: " + time1.getHours());
        System.out.println("Минуты: " + time1.getMinutes());
        System.out.println("Секунды: " + time1.getSeconds());

        time1.setMinutes(75);
        System.out.println("После установки значения: " + time1);
        System.out.println("Минуты: " + time1.getMinutes());

        TimeSpan time3 = new TimeSpan(1, 30, 0);
        TimeSpan time4 = new TimeSpan(0, 45, 30);

        time3.add(time4);
        System.out.println("После метода .add: " + time3);

        TimeSpan time5 = new TimeSpan(2, 0, 0);
        TimeSpan time6 = new TimeSpan(0, 45, 0);
        System.out.println("Время 5: " + time5);
        System.out.println("Время 6: " + time6);

        time5.subtract(time6);
        System.out.println("После метода .subtract: " + time5);
    }
}
