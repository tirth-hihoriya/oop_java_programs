
// Enter the name to Search in the command Line argument that is available in file   `subjects.txt`
// In command line :   `java p10c oop dsa dc `   <----- Example

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


class p10c {
    public static void main(String[] args) {
        File subjects = new File("subjects.txt");

        for (String find : args) {
            Thread t = new Thread(new Search(subjects, find));
            t.start();
        }
    }
}

class Search implements Runnable{

    File subjects;
    String find;

    Search(File subjects, String find){
        this.subjects = subjects;
        this.find = find;
    }

    @Override
    public  void run() {
        Scanner input;
        try{
        input = new Scanner(subjects);
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found...!!!");
            return;
        }
        boolean flag = false;
        while(input.hasNextLine()) {
            flag = input.nextLine().toLowerCase().contains(find.toLowerCase());
            if (flag) {
                break;
            }
        }

        if(flag){
            System.out.println(find + " found in the file");
        }
        else{
            System.out.println(find + " not found in the file");
        }
        input.close();
    }
}