package December05;

import java.util.Arrays;
import December05.Student;

//import java.sql.SQLOutput;

import java.util.Scanner;

public class AnonymousObjects {



        public static void main(String[] args) {

//        Student st = new Student();
//
//        st.getName();
//        System.out.println(st.name);
//
//
//        new Student();
//
//        String str = new Student().getName();
//
//
////        Scanner sc = new Scanner(System.in);
////
////        String name = sc.next();
////        String last = sc.next();
////        String mid = sc.next();
////        String dob = sc.next();
//
//
//       String fullName=  new Scanner(System.in).next();

            doSomething(new int[] {1,2,4}, new Student());

            System.out.println(new Student().getInfo());

        }

        public static void doSomething(int[] arr, Student student){
            System.out.println(Arrays.toString(arr));
            System.out.println(student.getName());

        }

    }

