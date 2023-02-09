package December9.pack1;
import  December9.pack2.Cat; // import packageName.ClassName
// regular imports are for importing Classes

import  December9.pack2.*; // wildcard import is for importing all classes from specific package

import static java.util.Arrays.sort;
//static imports are for importing static members of the class

import static java.util.Arrays.binarySearch; // there is no parameter or even parentheses

import static java.util.Arrays.*; // // wildcard import is for importing all static member from specific class


import static java.lang.Math.random;
import static java.lang.Math.PI;




public class MyClass {


    public static void main(String[] args) {


        Test test  = new Test();

       Cat cat = new Cat();

        // if we didn't use import you would mention the package everytime you use the class
//        december9.pack2.Cat cat2 = new december9.pack2.Cat();


       sort(new int[]{});
        sort(new int[]{});
        sort(new int[]{});
        sort(new int[]{});
        sort(new int[]{});
       sort(new int[]{});

       binarySearch(new int[]{}, 2 );




//        System.out.println(Arrays.toString());


        System.out.println(  random()  );
        System.out.println(PI);






    }

}
