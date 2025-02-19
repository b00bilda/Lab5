package org.example.a;

import java.io.*;

// читает данные из json файла
public class Reader {

    static void read(String path) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(path); //path - путь до файла

        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line;
        StringBuilder text = new StringBuilder();

        while((line = br.readLine()) != null) {
            text.append(line);
        }

        // Gson gson = new GsonBuilder().create();
    }

}
