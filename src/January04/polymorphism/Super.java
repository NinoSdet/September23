package January04.polymorphism;




public class Super {

    int id;

    public void printId(){

    }


    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.id);
        obj.printId();
//        System.out.println(obj.name);  // Super class does not have direct access to subclass's members
//        obj.printName();
    }
}
class Sub extends Super {

    String name;

    public void printName(){}
}

