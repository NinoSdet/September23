package January9;

public class Tester2 {
    public static void main(String[] args) {

        // The usual use case for explicit downcasting
        // Create a Fruit array

//        Fruit[] fruits = new Fruit[] {new Orange(), new Apple()};
//         Orange or =  (Orange) fruits[0];

        Object[] objects =  new Object[] {
                new Apple(),
                new Orange(),
                new String("fsd"),
//                 Integer.valueOf("3"),
                3, // autoboxing -> new Integer(3)
                new String("hello")
        };

        for (Object object : objects) {

            if(object instanceof String){
                System.out.println((  (String)  object  ).toUpperCase());
            }

        }

        Object [] row =  { 23,	"minnie.mouse",	"Minnie	Mouse", 625634125736215635L, 34.5};

        Long expected = 625634125736215635L;
//        Long actual = row[3]; // this doesn't work since row[3]'s type is Object
        Long actual = (Long) row[3]; // hence row[3] must be cast down to Long

        System.out.println(expected.equals(actual));

    }
}
