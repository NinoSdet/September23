package December19.inheritanceDemo.animals;

public class TestAnimals {


    public static void main(String[] args) {




        Cat cat = new Cat(2,4,"black",5,true,true);


        System.out.println(cat.toString());


        SiameseCat siameseCat = new SiameseCat();

        siameseCat.setColor("beige");

        System.out.println(siameseCat.getColor());



    }
}
