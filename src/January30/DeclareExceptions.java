package January30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DeclareExceptions {


    public static void main(String[] args) throws FileNotFoundException, InterruptedException {


        readFromFile("C:\\Users\\Nuclues\\IdeaProjects\\Batch10\\src\\january30\\info1.txt");



         doSomething();  // compiles fine, since it throws Unchecked exception
         doSomething2(); // InterruptedException is a checked exception hence it doesn't compile
    }


    public static void doSomething() throws NumberFormatException {}
    public static void doSomething2() throws InterruptedException {}


    public static void readFromFile(String path) throws FileNotFoundException {

//
            BufferedReader bf =  new BufferedReader(new FileReader(path));



    }



}
