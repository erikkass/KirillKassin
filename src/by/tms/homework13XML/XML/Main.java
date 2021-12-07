package by.tms.homework13XML.XML;

import by.tms.homework13XML.domain.Device;
import by.tms.homework13XML.domain.Devices;
import by.tms.homework13XML.domain.Type;
import by.tms.homework13XML.generated.ObjectFactory;


import java.util.Arrays;

public class Main {
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

//        XMLUtil.generateJAXBObjects("src", "resources/pc.xsd");
        ObjectFactory factory = new ObjectFactory();
        by.tms.homework13XML.generated.Type typeJaxbCpu = factory.createType();
        typeJaxbCpu.setPeripheral(cpu.getType().isPeripheral());
        typeJaxbCpu.setPowerConsumption(cpu.getType().getPowerConsumption());
        typeJaxbCpu.setFan(cpu.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbCpu = factory.createDevice();
        jaxbCpu.setName(cpu.getName());
        jaxbCpu.setOrigin(cpu.getOrigin());
        jaxbCpu.setPrice(cpu.getPrice());
        jaxbCpu.setCritical(cpu.isCritical());
        jaxbCpu.setType(typeJaxbCpu);
        jaxbCpu.setID(cpu.getId());

        by.tms.homework13XML.generated.Type typeJaxbMotherboard = factory.createType();
        typeJaxbMotherboard.setPeripheral(motherboard.getType().isPeripheral());
        typeJaxbMotherboard.setPowerConsumption(motherboard.getType().getPowerConsumption());
        typeJaxbMotherboard.setFan(motherboard.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbMotherboard = factory.createDevice();
        jaxbMotherboard.setName(motherboard.getName());
        jaxbMotherboard.setOrigin(motherboard.getOrigin());
        jaxbMotherboard.setPrice(motherboard.getPrice());
        jaxbMotherboard.setCritical(motherboard.isCritical());
        jaxbMotherboard.setType(typeJaxbMotherboard);
        jaxbMotherboard.setID(motherboard.getId());

        by.tms.homework13XML.generated.Type typeJaxbGpu = factory.createType();
        typeJaxbGpu.setPeripheral(gpu.getType().isPeripheral());
        typeJaxbGpu.setPowerConsumption(gpu.getType().getPowerConsumption());
        typeJaxbGpu.setFan(gpu.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbGpu = factory.createDevice();
        jaxbGpu.setName(gpu.getName());
        jaxbGpu.setOrigin(gpu.getOrigin());
        jaxbGpu.setPrice(gpu.getPrice());
        jaxbGpu.setCritical(gpu.isCritical());
        jaxbGpu.setType(typeJaxbGpu);
        jaxbGpu.setID(gpu.getId());

        by.tms.homework13XML.generated.Type typeJaxbCooler = factory.createType();
        typeJaxbCooler.setPeripheral(cooler.getType().isPeripheral());
        typeJaxbCooler.setPowerConsumption(cooler.getType().getPowerConsumption());
        typeJaxbCooler.setFan(cooler.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbCooler = factory.createDevice();
        jaxbCooler.setName(cooler.getName());
        jaxbCooler.setOrigin(cooler.getOrigin());
        jaxbCooler.setPrice(cooler.getPrice());
        jaxbCooler.setCritical(cooler.isCritical());
        jaxbCooler.setType(typeJaxbCooler);
        jaxbCooler.setID(cooler.getId());

        by.tms.homework13XML.generated.Type typeJaxbRam = factory.createType();
        typeJaxbRam.setPeripheral(ram.getType().isPeripheral());
        typeJaxbRam.setPowerConsumption(ram.getType().getPowerConsumption());
        typeJaxbRam.setFan(ram.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbRam = factory.createDevice();
        jaxbRam.setName(ram.getName());
        jaxbRam.setOrigin(ram.getOrigin());
        jaxbRam.setPrice(ram.getPrice());
        jaxbRam.setCritical(ram.isCritical());
        jaxbRam.setType(typeJaxbRam);
        jaxbRam.setID(ram.getId());

        by.tms.homework13XML.generated.Type typeJaxbSsd = factory.createType();
        typeJaxbSsd.setPeripheral(ssd.getType().isPeripheral());
        typeJaxbSsd.setPowerConsumption(ssd.getType().getPowerConsumption());
        typeJaxbSsd.setFan(ssd.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbSsd = factory.createDevice();
        jaxbSsd.setName(ssd.getName());
        jaxbSsd.setOrigin(ssd.getOrigin());
        jaxbSsd.setPrice(ssd.getPrice());
        jaxbSsd.setCritical(ssd.isCritical());
        jaxbSsd.setType(typeJaxbSsd);
        jaxbSsd.setID(ssd.getId());

        by.tms.homework13XML.generated.Type typeJaxbPsu = factory.createType();
        typeJaxbPsu.setPeripheral(psu.getType().isPeripheral());
        typeJaxbPsu.setPowerConsumption(psu.getType().getPowerConsumption());
        typeJaxbPsu.setFan(psu.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbPsu = factory.createDevice();
        jaxbPsu.setName(psu.getName());
        jaxbPsu.setOrigin(psu.getOrigin());
        jaxbPsu.setPrice(psu.getPrice());
        jaxbPsu.setCritical(psu.isCritical());
        jaxbPsu.setType(typeJaxbPsu);
        jaxbPsu.setID(psu.getId());

        by.tms.homework13XML.generated.Type typeJaxbPcCase = factory.createType();
        typeJaxbPcCase.setPeripheral(pcCase.getType().isPeripheral());
        typeJaxbPcCase.setPowerConsumption(pcCase.getType().getPowerConsumption());
        typeJaxbPcCase.setFan(pcCase.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbPcCase = factory.createDevice();
        jaxbPcCase.setName(pcCase.getName());
        jaxbPcCase.setOrigin(pcCase.getOrigin());
        jaxbPcCase.setPrice(pcCase.getPrice());
        jaxbPcCase.setCritical(pcCase.isCritical());
        jaxbPcCase.setType(typeJaxbPcCase);
        jaxbPcCase.setID(pcCase.getId());


        by.tms.homework13XML.generated.Type typeJaxbMouse = factory.createType();
        typeJaxbMouse.setPeripheral(mouse.getType().isPeripheral());
        typeJaxbMouse.setPowerConsumption(mouse.getType().getPowerConsumption());
        typeJaxbMouse.setFan(mouse.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbMouse = factory.createDevice();
        jaxbMouse.setName(mouse.getName());
        jaxbMouse.setOrigin(mouse.getOrigin());
        jaxbMouse.setPrice(mouse.getPrice());
        jaxbMouse.setCritical(mouse.isCritical());
        jaxbMouse.setType(typeJaxbMouse);
        jaxbMouse.setID(mouse.getId());

        by.tms.homework13XML.generated.Type typeJaxbKeyboard = factory.createType();
        typeJaxbKeyboard.setPeripheral(keyboard.getType().isPeripheral());
        typeJaxbKeyboard.setPowerConsumption(keyboard.getType().getPowerConsumption());
        typeJaxbKeyboard.setFan(keyboard.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbKeyboard = factory.createDevice();
        jaxbKeyboard.setName(keyboard.getName());
        jaxbKeyboard.setOrigin(keyboard.getOrigin());
        jaxbKeyboard.setPrice(keyboard.getPrice());
        jaxbKeyboard.setCritical(keyboard.isCritical());
        jaxbKeyboard.setType(typeJaxbKeyboard);
        jaxbKeyboard.setID(keyboard.getId());

        by.tms.homework13XML.generated.Type typeJaxbMonitor = factory.createType();
        typeJaxbMonitor.setPeripheral(monitor.getType().isPeripheral());
        typeJaxbMonitor.setPowerConsumption(monitor.getType().getPowerConsumption());
        typeJaxbMonitor.setFan(monitor.getType().isFan());
        by.tms.homework13XML.generated.Device jaxbMonitor = factory.createDevice();
        jaxbMonitor.setName(monitor.getName());
        jaxbMonitor.setOrigin(monitor.getOrigin());
        jaxbMonitor.setPrice(monitor.getPrice());
        jaxbMonitor.setCritical(monitor.isCritical());
        jaxbMonitor.setType(typeJaxbMonitor);
        jaxbMonitor.setID(monitor.getId());

        by.tms.homework13XML.generated.Devices jaxbDevices = factory.createDevices();
        jaxbDevices.getDevice().add(jaxbCpu);
        jaxbDevices.getDevice().add(jaxbMotherboard);
        jaxbDevices.getDevice().add(jaxbGpu);
        jaxbDevices.getDevice().add(jaxbCooler);
        jaxbDevices.getDevice().add(jaxbRam);
        jaxbDevices.getDevice().add(jaxbSsd);
        jaxbDevices.getDevice().add(jaxbPsu);
        jaxbDevices.getDevice().add(jaxbPcCase);
        jaxbDevices.getDevice().add(jaxbMouse);
        jaxbDevices.getDevice().add(jaxbKeyboard);
        jaxbDevices.getDevice().add(jaxbMonitor);

        XMLUtil.marshallToXml(jaxbDevices, "pc.xml");

        boolean result = XMLUtil.validateXml("pc.json", "pc.xml");
        System.out.println(result);
    }
}
