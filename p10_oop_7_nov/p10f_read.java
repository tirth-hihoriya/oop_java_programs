// content is in students.txts

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p10f_read {

    public static void main(String[] args) {
        File file = new File("students.txt");
        Scanner sca = new Scanner(System.in);
        try {
            sca = new Scanner(file);
            sca.useDelimiter("[\n,]");

            while (sca.hasNext()) {
                System.out.println("Name: " + sca.next() + "\nRoll No: " + sca.next() + "\nAddress: " + sca.next() + "\nAge: " + sca.next() + "\n\n\n");                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}