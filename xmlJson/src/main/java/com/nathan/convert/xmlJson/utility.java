package com.nathan.convert.xmlJson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class utility {
    public static void writetoFile(String content, String filename) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }
}
