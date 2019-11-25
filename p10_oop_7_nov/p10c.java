
// Enter the name to Search in the command Line argument that is available in file   `subjects.txt`
// In command line :   `java p10c oop dsa cp `   <----- Example

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


class p10c {
    public static void main(String[] args) {
        File subjects = new File("subjects.txt");

        for (String find : args) {
            Thread t = new Thread(new Search_item(subjects, find));
            t.start();
        }
    }
}

class Search_item implements Runnable{

    File subjects;
    String find;

    Search_item(File subjects, String find){
        this.subjects = subjects;
        this.find = find;
        
    }

    
    public  void run() {
        BufferedReader read;

        try{
        read = new BufferedReader(new FileReader("subjects.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found...!!!");
            return;
        }
        boolean flag = false;
        
        try{
        while(read.readLine()!=null) {
           
            flag = read.readLine().toLowerCase().contains(find.toLowerCase());
            
            if (flag) {
                break;
              }
            }
        }
        catch(Exception e){};

        if(flag){
            System.out.println(find + " found in the file");
        }
        else{
            System.out.println(find + " not found in the file");
        }
        try{read.close();} catch(Exception e){};

    }
}