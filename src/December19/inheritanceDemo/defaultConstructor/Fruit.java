package December19.inheritanceDemo.defaultConstructor;

public class Fruit {

    int age;

    public Fruit(int age){
        System.out.println("int arg super");
        this.age = age;
    }

    public Fruit(){
        System.out.println("No arg super");
    }

}
