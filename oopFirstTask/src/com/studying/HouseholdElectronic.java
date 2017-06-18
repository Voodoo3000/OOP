package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 * Домашние электроприборы. Определить иерархию электроприборов.
 * Включить некоторые в розетку. Подсчитать потребляемую мощность.
 * Провести сортировку приборов в квартире на основе мощности. Найти
 * прибор в квартире, соответствующий заданному диапазону параметров.
 */
public abstract class HouseholdElectronic {
    private boolean onOff;

    public void powerCalc(String name, double amp, int volt) {
        double power = amp * volt;
        System.out.println(name + " pluged in socket, consumed power is: " + power + "W");
    }

}
