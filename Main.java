package ro.pentalog.reader;


import java.util.Iterator;
import java.util.List;


import static ro.pentalog.reader.ReadFileInList.readFileInList;


public class Main {

    public static void main(String[] args) {

                List l = readFileInList("/Users/admin/Desktop/TextFileReader/Pentalog.txt");

                Iterator<String> itr = l.iterator();
                while (itr.hasNext())
                    System.out.println(itr.next());
            }
        }






