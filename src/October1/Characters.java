package October1;

public class Characters {
    public static void main(String[] args) {
        char ch = '1';


        char ch1 = '\u45dE';

        char ch2 = '\u3fFa';
        char ch3 = '\b';
        char ch4 = '\t';



        int k = 'a';

        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';



        float f = 1000.34f;
        int l = (int)f;

        double d = 1000.34;
        int m = (int)d;

        int n = 97;
        char c = (char)n;

        char randomChar = (char)(97 + (Math.random() * 27));
        System.out.println(randomChar);

        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x-y);

        System.out.println(c);
        System.out.println(k);
        System.out.println(j);
        System.out.println(m);
        System.out.println(l);
        System.out.println(c);

    }
}
