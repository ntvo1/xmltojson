package com.nathan.convert.xmlJson;

import javax.xml.bind.annotation.XmlElement;

public class contact {
    @XmlElement(name = "CompanyName")
    private String CompanyName;
    @XmlElement(name = "Email")
    private String Email;
    @XmlElement(name = "Address")
    private String Address;
    @XmlElement(name = "Phone")
    private String Phone;
    @XmlElement(name = "PostalCode")
    private String PostalCode;
    @XmlElement(name = "Country")
    private String Country;
    @XmlElement(name = "CustomerID")
    private String CustomerID;
    @XmlElement(name = "City")
    private String City;
    @XmlElement(name = "Fax")
    private String Fax;
    @XmlElement(name = "ContactName")
    private String ContactName;
    @XmlElement(name = "ContactTitle")
    private String ContactTitle;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }
}
