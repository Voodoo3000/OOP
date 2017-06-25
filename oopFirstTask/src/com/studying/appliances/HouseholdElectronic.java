package com.studying.appliances;

/*
 * Created by VladislavYTsa on 15.06.2017.
 * Домашние электроприборы. Определить иерархию электроприборов.
 * Включить некоторые в розетку. Подсчитать потребляемую мощность.
 * Провести сортировку приборов в квартире на основе мощности. Найти
 * прибор в квартире, соответствующий заданному диапазону параметров.
 */

public abstract class HouseholdElectronic implements Comparable{

    private String modelName;
    private double power;
    private boolean onOff;

    @Override
    public int compareTo(Object o) {
            if (power < ((HouseholdElectronic) o).power) {
                return 1;
            } else if (power == ((HouseholdElectronic) o).power) {
                return 0;
            } else return -1;
    }
    @Override
    public String toString() {
        return "";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
}
