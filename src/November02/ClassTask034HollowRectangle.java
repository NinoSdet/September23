package November02;

public class ClassTask034HollowRectangle {
    public static void main(String[] args) {
    /*
     Write a program that prints out a hollow rectangle of any dimension using any char (10x10 for example)
     Use nested for loops to achieve the task.

          Example:
          * * * * *
          *       *
          *       *
          *       *
          * * * * *
    */
        int x=5;
        int y=5;
        for(int i = 1; i<=x; i++){


            for (int j =1; j<=y; j++){
                if (j==1 || j==y|| i==1 || i==x) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
