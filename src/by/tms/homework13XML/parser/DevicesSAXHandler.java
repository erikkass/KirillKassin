package by.tms.homework13XML.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DevicesSAXHandler extends DefaultHandler {

    private boolean isName;
    private boolean isOrigin;
    private boolean isPrice;
    private boolean isCritical;
    private boolean isType;
    private boolean isDevice;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("device".equalsIgnoreCase(localName)) {
            System.out.print("\n\n" + localName + ": ");
            String name = attributes.getValue("ID");
            System.out.println(name);
            isDevice = true;
        }
        if ("name".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isName = true;
        }
        if ("origin".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isOrigin = true;
        }
        if ("price".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isPrice = true;
        }
        if ("critical".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isCritical = true;
        }
        if ("type".equalsIgnoreCase(localName)) {
            System.out.print(localName + " -");
            isType = true;
        }
        if ("peripheral".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isType = true;
        }
        if ("powerConsumption".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isType = true;
        }
        if ("fan".equalsIgnoreCase(localName)) {
            System.out.print(localName + ": ");
            isType = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("device".equalsIgnoreCase(localName)) {
            isName = false;
        }
        if ("name".equalsIgnoreCase(localName)) {
            isName = false;
        }
        if ("origin".equalsIgnoreCase(localName)) {
            isOrigin = false;
        }
        if ("price".equalsIgnoreCase(localName)) {
            isPrice = false;
        }
        if ("critical".equalsIgnoreCase(localName)) {
            isCritical = false;
        }
        if ("type".equalsIgnoreCase(localName)) {
            isType = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        value = value.replace("\n", "").trim();
        if (isName) {
            System.out.println(value);
        }
        if (isOrigin) {
            System.out.println(value);
        }
        if (isPrice) {
            System.out.println(value);
        }
        if (isCritical) {
            System.out.println(value);
        }
        if (isType) {
            System.out.print(value + " ");
        }
    }
}
