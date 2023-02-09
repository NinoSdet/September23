package December05;

public class Dog {

        String name;
        String breed;
        char gender;
        int age;
        boolean isVaccinated;

        public Dog(String name, String breed, char gender, int age, boolean isVaccinated) {
            this.name = name;
            this.breed = breed;
            this.gender = gender;
            this.age = age;
            this.isVaccinated = isVaccinated;
        }

        public Dog(String name) {
            this.name = name;

        }

        //
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", isVaccinated=" + isVaccinated +
                    '}';
        }
    }

