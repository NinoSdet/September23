package December05;

public class Student {


        String name = "Johnny Depp";
        int age = 24;

        char gender;
        String sc = null;
        Character ch;

        public String getName(){
            return name;
        }

        public String getInfo(){
            return gender + " " + sc.toUpperCase() + " " + ch;
        }
    }
