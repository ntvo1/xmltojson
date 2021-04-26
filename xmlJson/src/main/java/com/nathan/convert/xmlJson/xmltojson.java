package com.nathan.convert.xmlJson;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class xmltojson {
    public static void main(String[] args) {
        try {
            String url ="http://www.bindows.net/documentation/download/ab.xml";
            String json_outfile ="output/json.txt";
            String xml_outfile ="output/xml.txt";
            String xmlString1 = new getTemplate().getContent(url) ;
            if(xmlString1.equals("error"))
            {
                System.out.println("Unable to hit url");
                System.exit(1);
            }
            JSONObject json = XML.toJSONObject(xmlString1); // converts xml to json
            String jsonPrettyPrintString = json.toString(4); // json pretty print

            utility UT = new utility();
            UT.writetoFile( jsonPrettyPrintString, json_outfile);

            jsontoxml jo = new jsontoxml();
            jo.converttoxm(jsonPrettyPrintString,xml_outfile);
        } catch(JSONException je) {
            System.out.println(je.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
