package Activities;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {
        FileReader file = new FileReader("src/test/resources/sample.csv");
        CSVReader reader = new CSVReader(file);
//        Iterator<String[]> itr = reader.iterator();
//        Integer size = itr.size();
        List<String[]> list = reader.readAll();
        Integer size = list.size();
        System.out.println("Total number of rows are "+size);

        Iterator<String[]> itr = list.iterator();
        System.out.println("Values in the rows are ");
        while(itr.hasNext()){
            String[] str = itr.next();
            for(int i=0; i<str.length; i++) {
                System.out.println(str[i]);
            }
        }
        reader.close();
    }
}

