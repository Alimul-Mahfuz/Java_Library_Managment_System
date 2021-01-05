package base;

import java.io.FileWriter;
import java.io.IOException;

public class Printer {
    public void filesio(String id, String name, String dept,String bname) throws IOException {
        FileWriter nwf = new FileWriter("statement.txt");
        nwf.write("Name: ");
        nwf.write(name);
        nwf.write('\n');
        nwf.write("ID: ");
        nwf.write(id);
        nwf.write('\n');
        nwf.write("Department: ");
        nwf.write(dept);
        nwf.write('\n');
        nwf.write("Borrowed Book Name: ");
        nwf.write(bname);
        nwf.close();

    }

}