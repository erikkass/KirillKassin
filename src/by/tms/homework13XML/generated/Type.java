//
// This file was by.tms.homework13XML.generated by the JavaTM Architecture for by.tms.homework13XML.XML Binding(JAXB) Reference Implementation, v2.3.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.06 at 02:37:07 PM MSK 
//


package by.tms.homework13XML.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="peripheral" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="powerConsumption" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fan" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type", propOrder = {
    "peripheral",
    "powerConsumption",
    "fan"
})
public class Type {

    protected boolean peripheral;
    protected double powerConsumption;
    protected boolean fan;

    /**
     * Gets the value of the peripheral property.
     * 
     */
    public boolean isPeripheral() {
        return peripheral;
    }

    /**
     * Sets the value of the peripheral property.
     * 
     */
    public void setPeripheral(boolean value) {
        this.peripheral = value;
    }

    /**
     * Gets the value of the powerConsumption property.
     * 
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Sets the value of the powerConsumption property.
     * 
     */
    public void setPowerConsumption(double value) {
        this.powerConsumption = value;
    }

    /**
     * Gets the value of the fan property.
     * 
     */
    public boolean isFan() {
        return fan;
    }

    /**
     * Sets the value of the fan property.
     * 
     */
    public void setFan(boolean value) {
        this.fan = value;
    }

}
