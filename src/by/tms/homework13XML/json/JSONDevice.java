package by.tms.homework13XML.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import by.tms.homework13XML.domain.Device;
import by.tms.homework13XML.domain.Devices;
import by.tms.homework13XML.domain.Type;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class JSONDevice {
    public static void main(String[] args) {
        Device cpu = new Device("CPU", "USA", 600, true, new Type(false, 65, false), "AD231254");
        Device motherboard = new Device("Motherboard", "China", 250, true, new Type(false, 30, false), "FD532164");
        Device gpu = new Device("GPU", "Germany", 1000, true, new Type(false, 200, true), "DA565425");
        Device cooler = new Device("CPU Cooler", "USA", 30.99, false, new Type(false, 10, true), "LA254854");
        Device ram = new Device("RAM", "Canada", 100, true, new Type(false, 50, false), "JA943621");
        Device ssd = new Device("SSD", "USA", 60, true, new Type(false, 50, false), "IK763254");
        Device psu = new Device("PSU", "Japan", 200, true, new Type(false, 30, true), "RD242944");
        Device pcCase = new Device("PC Case", "Sweden", 100, false, new Type(false, 0, true), "HG453254");
        Device mouse = new Device("Mouse", "China", 20, false, new Type(true, 5, false), "VB781254");
        Device keyboard = new Device("Keyboard", "China", 50, false, new Type(true, 10, false), "CX875254");
        Device monitor = new Device("Monitor", "Japan", 300, false, new Type(true, 100, false), "FD432865");
        Devices pc = new Devices(Arrays.asList(cpu, motherboard, gpu, cooler, ram, ssd, psu, pcCase, mouse, keyboard, monitor));

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(Path.of("resources", "pc.json").toFile(), pc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Devices devicesFromJson = objectMapper.readValue(Path.of("resources", "pc.json").toFile(), Devices.class);
            System.out.println(devicesFromJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
