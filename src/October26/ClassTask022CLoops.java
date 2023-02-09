package October26;

public class ClassTask022CLoops {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        printEven(100, 500);

    /*int i = 100;
    while (i<=500){
      if (i % 2 ==0) {
       System.out.println(i);
    }
    i++;
    } */
    }

    public static void printEven(int start, int end){
        while (start<=end){
            if ((start % 2)==0 ){
                System.out.println(start);
            }
            start++;
        }
    }
}
