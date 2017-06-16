package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 * Домашние электроприборы. Определить иерархию электроприборов.
 Включить некоторые в розетку. Подсчитать потребляемую мощность.
 Провести сортировку приборов в квартире на основе мощности. Найти
 прибор в квартире, соответствующий заданному диапазону параметров.
 */
public abstract class HouseholdElectronic {
    int pcpower = 300;
    int tvpower = 240;
    int routerpower = 50;
    public void plugIn(int power) {
        System.out.println("Pluging in socket, consumed power is: " + power + "W");
    }
}
