package by.tms.homework13XML.domain;

import java.util.List;
import java.util.Objects;

public class Devices {

    private List<Device> devices;

    public Devices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devices devices1 = (Devices) o;
        return devices.equals(devices1.devices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "devices=" + devices +
                '}';
    }
}
