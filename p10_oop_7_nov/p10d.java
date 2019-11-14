

// java p10d f1.txt f2.txt   ---> example

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;


public class p10d {
    public static void main(String[] args) {
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        Thread t1 = new Thread(new printData(f1));
        Thread t2 = new Thread(new printData(f2));

        

        t1.start();
        t2.start();
    }
}

class printData implements Runnable {
    File file;

    printData(File file) {
        this.file = file;
    }

    @Override
    public void run() {

        BufferedReader read;
        Random x = new Random();

        try {
            read = new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        try{
        while (read.readLine()!=null) {

            try {    Thread.sleep(x.nextInt(100));   } catch (InterruptedException e) {e.printStackTrace();}
            
            System.out.println(file.getName() +" ---> "+ read.readLine());
        }

       read.close();}
        catch(Exception e){};

    }
}