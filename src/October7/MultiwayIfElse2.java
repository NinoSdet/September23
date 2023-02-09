package October7;

import java.util.Scanner;

public class MultiwayIfElse2 {

    public static void main(String[] args) {

        System.out.println(getBrowser(9));

    }

    public static String getBrowser(int number){

        if(number == 1){
            return "Chrome";
        }else if(number == 2){
            return "Firefox";
        }else if(number == 3){
            return "Edge";
        }else{
            return "Invalid browser";
        }
    }

}
