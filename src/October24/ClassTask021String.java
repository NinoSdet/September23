package October24;

public class ClassTask021String {
    public static void main(String[] args) {

        //TESTS
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
        System.out.println(middleTwo("hi"));
        System.out.println(middleTwo("ethereum") );
        System.out.println(middleTwo("window") );

    }

    //Write your method here

    public static String middleTwo(String str){
        int strLength = str.length();
        if (strLength % 2==0 && strLength>=2){
            return str.substring(strLength/2-1,strLength/2+1);

        }else{
            return "";
        }



    }
}
