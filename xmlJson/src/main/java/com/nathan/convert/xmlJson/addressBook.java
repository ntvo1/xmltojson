package com.nathan.convert.xmlJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name = "AddressBook")
@XmlAccessorType(XmlAccessType.NONE)
public class addressBook {
    @XmlElement(name = "Contact")
    private List<contact> Contact;

    public addressBook() {
    }

    public addressBook(List<contact> contact) {
        Contact = contact;
    }

    public List<contact> getContact() {
        return Contact;
    }

    public void setContact(List<contact> contact) {
        Contact = contact;
    }
}
