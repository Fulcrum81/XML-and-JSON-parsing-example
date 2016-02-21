package parsers;

import com.company.Contact;
import com.company.Information;
import com.thoughtworks.xstream.XStream;

import java.io.*;

public class XmlParser {

    public static void write(Information info, String path) throws IOException {

        XStream xStream = getXstreamObject();

        String xml = xStream.toXML(info);

        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(xml);

        bw.close();
        fw.close();
    }

    public static Information read(String path) throws IOException {
        StringBuffer xmlStr = new StringBuffer();

        XStream xStream = getXstreamObject();

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            xmlStr.append(line);
        }

        String xml = xmlStr.toString();

        Object obj = xStream.fromXML(xml);

        Information info = (Information) obj;
        return info;
    }

    private static XStream getXstreamObject() {
        XStream xstream = new XStream();
        xstream.alias("Information", Information.class);
        xstream.alias("contact", Contact.class);
        xstream.useAttributeFor(Information.class, "information");
        return xstream;
    }
}
