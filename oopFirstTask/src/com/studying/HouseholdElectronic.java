package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 * Домашние электроприборы. Определить иерархию электроприборов.
 Включить некоторые в розетку. Подсчитать потребляемую мощность.
 Провести сортировку приборов в квартире на основе мощности. Найти
 прибор в квартире, соответствующий заданному диапазону параметров.
 */
public abstract class HouseholdElectronic {
    public void PlugIn(int power) {
        System.out.println("Plug in socket:" + power);
    }
}
