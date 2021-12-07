package by.tms.homework13XML.domain;

import java.util.Objects;

public class Device {

    private String name;
    private String origin;
    private double price;
    private boolean critical;
    private Type type;
    private String id;

    public Device(String name, String origin, double price, boolean critical, Type type, String id) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.critical = critical;
        this.type = type;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Double.compare(device.price, price) == 0 && critical == device.critical && name.equals(device.name) && origin.equals(device.origin) && type.equals(device.type) && id.equals(device.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, origin, price, critical, type, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", critical=" + critical +
                ", type=" + type +
                ", id='" + id + '\'' +
                '}';
    }
}
