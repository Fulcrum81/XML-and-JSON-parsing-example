package parsers;

import com.company.Information;
import com.google.gson.Gson;

import java.io.*;

public class JsonParser {

    public static void write(Information info, String path) throws IOException {
        Gson gson = new Gson();

        String json = gson.toJson(info);

        FileWriter writer = new FileWriter(path);
        writer.write(json);
        writer.close();
    }


    public static Information read(String path) throws FileNotFoundException {

        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader(path));

        Information info = gson.fromJson(br, Information.class);

        return info;
    }
}
