package January2.objectClass;

public class CoffeeTester {


    public static void main(String[] args) {


        Coffee coffee = new Coffee("Colombia", true, "coldBrew");
        Coffee coffee1 = new Coffee("Ethiopia", true, "hot");


        System.out.println(coffee.toString());
        System.out.println(coffee);  // equal to System.out.println(coffee.toString());
        // Whenever you print any object with println() method
        // its toString is called implicitly.
        // If it is overriden in the class, you will see an overriden implementation,
        // otherwise you see a default implementation from Object class (className + @ + memory hash)


        System.out.println(new Coffee("Peru", false, "nitro"));
//        System.out.println(new Coffee("Peru", false, "nitro").toString);
//


        int [] arr = new int[10];
        System.out.println(arr);  // array does not override toString() hence you see a memory location for arrays when you print them

        StringBuilder sb =  new StringBuilder("dsd"); // StringBuilder and String classes override toString() method hence you see the content of the objects when you print them
        System.out.println(sb.toString());
    }
}
