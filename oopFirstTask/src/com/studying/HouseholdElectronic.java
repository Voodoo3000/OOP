package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 * Домашние электроприборы. Определить иерархию электроприборов.
 * Включить некоторые в розетку. Подсчитать потребляемую мощность.
 * Провести сортировку приборов в квартире на основе мощности. Найти
 * прибор в квартире, соответствующий заданному диапазону параметров.
 */
public abstract class HouseholdElectronic implements Comparable{

    double power;
    boolean onOff;

    @Override
    public int compareTo(Object o) {
        if (power < ((HouseholdElectronic) o).power) {
            return -1;
        } else if (power == ((HouseholdElectronic) o).power) {
            return 0;
        } else return 1;
    }

    @Override
    public String toString() {
        return "HouseholdElectronic{" +
                "power=" + power +
                ", onOff=" + onOff +
                '}';
    }
}
