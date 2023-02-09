package December16;
//import hello.IntegerDivision;

public class WrapperDemo {
    public static void main(String[] args) {

        Integer integer1 = 23;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        Integer i  = 3;

        byte b = i.byteValue();  // returns the corresponding primitive type

        Double d =  3.4;

        int num = d.intValue();

        System.out.println(num);

    }
}
