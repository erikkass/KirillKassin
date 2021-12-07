package by.tms.homework13XML.domain;

import java.util.Objects;

public class Type {

    private boolean peripheral;
    private double powerConsumption;
    private boolean fan;

    public Type(boolean peripheral, double powerСonsumption, boolean fan) {
        this.peripheral = peripheral;
        this.powerConsumption = powerСonsumption;
        this.fan = fan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return peripheral == type.peripheral && Double.compare(type.powerConsumption, powerConsumption) == 0 && fan == type.fan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peripheral, powerConsumption, fan);
    }

    public boolean isPeripheral() {
        return peripheral;
    }

    public void setPeripheral(boolean peripheral) {
        this.peripheral = peripheral;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerСonsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isFan() {
        return fan;
    }

    public void setFan(boolean fan) {
        this.fan = fan;
    }

    @Override
    public String toString() {
        return "Type{" +
                "peripheral=" + peripheral +
                ", powerСonsumption=" + powerConsumption +
                ", fan=" + fan +
                '}';
    }
}
