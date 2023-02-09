package January30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class ExceptionClassDemo {


    public static void main(String[] args) {

//  Exception subclasses -> IOException, FileNotFoundException, SQLException , InterruptedException

//
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("c:/users/cdsv/file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("");
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
//


    }
}
