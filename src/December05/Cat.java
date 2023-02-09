package December05;

public class Cat {

        String name;
        String breed;
        String color;
        int age;
        char gender;
        double weight;

        public Cat(String name, String breed, String color, int age, char gender, double weight) {
//        this.weight = weight;
//        this(name,breed,color,age, gender); //Call to 'this()' must be first statement in constructor body

            this(name,breed,color,age, gender);
            this.weight = weight;
//

        }

        public Cat(String name, String breed, String color, int age, char gender) {
            this.name = name;
            this.breed = breed;
            this.color = color;
            this.age = age;
            this.gender = gender;

        }

        public Cat(){
            this("Garfield", "domestic", "orange" , 10, 'm', 10); // call to another constructor within the same class
        }

        public Cat(String name){ //Recursive constructor invocation is not allowed
            this();
//          this("Garfield", "domestic", "orange" , 10, 'm', 10);
        }

        //    public static void main(String[] args) {
//
//        String name = "Felix";
//
//        System.out.println(name); // local variables have more precedence over class variables
//
//    }

        public String getName(){
            return this.name;
        }
        //
        public void setName(String name){

            this.name = name; //  local variable name is assigned to itself, because
        }

        public String getInfo(){
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", weight=" + weight +
                    '}';
        }

    }

