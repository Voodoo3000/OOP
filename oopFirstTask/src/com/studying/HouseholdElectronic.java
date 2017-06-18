package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 * Домашние электроприборы. Определить иерархию электроприборов.
 * Включить некоторые в розетку. Подсчитать потребляемую мощность.
 * Провести сортировку приборов в квартире на основе мощности. Найти
 * прибор в квартире, соответствующий заданному диапазону параметров.
 */
public abstract class HouseholdElectronic {

    boolean onOff;

    public void powerCalc(String name, double amp, int volt, boolean onOff) {
        if (onOff == true) {
            double power = amp * volt;
            System.out.println(name + " pluged in the socket, consumed power is: " + power + "W");
        } else System.out.println(name + " isn't pluged the in socket");
    }
}
