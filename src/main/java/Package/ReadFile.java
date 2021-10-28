package Package;

import java.io.*;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args)  {
        try {
            FileInputStream fis = new FileInputStream("/Computer/Desktop/data.csv");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);
            String line =  reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}



