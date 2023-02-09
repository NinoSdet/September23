package January2.objectClass;

public class CatTester {


    public static void main(String[] args) {


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println(cat1.equals(cat2));

        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println(str1.equals(str2));


        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");

        System.out.println(sb1.equals(sb2));
    }
}
