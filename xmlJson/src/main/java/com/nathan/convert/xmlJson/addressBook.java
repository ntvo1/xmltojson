package com.nathan.convert.xmlJson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name = "AddressBook")
@XmlAccessorType(XmlAccessType.NONE)
public class addressBook {

    private List<contact> Contact;

    public addressBook() {
    }

    public addressBook(List<contact> contact) {
        Contact = contact;
    }

    @XmlElement(name = "Contact")
    public List<contact> getContact() {
        return Contact;
    }
    public void setContact(List<contact> contact) {
        Contact = contact;
    }
}
