package com.nathan.convert.xmlJson;
import org.json.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;

public class jsontoxml {
    public static void converttoxm(String jsonString, String xml_outfile) throws IOException, JAXBException {
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<contact>>(){}.getType();
        JSONObject obj = new JSONObject(jsonString);
        JSONObject addressBook = obj.getJSONObject("AddressBook");

        JSONArray contact1 = addressBook.getJSONArray("Contact");

        ArrayList<contact> contactList = gson.fromJson(String.valueOf(contact1),userListType);

        marshallObject(contactList, xml_outfile);
    }
    public static JSONObject parseJSONFile2(String filename) throws JSONException, IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }
    public static void marshallObject( ArrayList<contact> contactList,String xmlfile) throws JAXBException, FileNotFoundException {
        JAXBContext contextObj = JAXBContext.newInstance(addressBook.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        addressBook addBook=new addressBook(contactList);
        marshallerObj.marshal(addBook, new FileOutputStream(xmlfile));

    }

}
