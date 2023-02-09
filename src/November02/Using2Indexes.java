package November02;

public class Using2Indexes {

        public static void main(String[] args) {

            String str = "inflation";  // innofilta

            // print characters from both ends till they meet in the middle

            // skips the middle char
            for (int i = 0, j = str.length()-1; i < j ; i++, j--) {
                System.out.print("" + str.charAt(i)+ str.charAt(j));

            }

            System.out.println();
            // prints the middle char
            for (int i = 0, j = str.length()-1; i <= j ; i++, j--) {
                if(i == j){
                    System.out.print(str.charAt(i));
                }else{
                    System.out.print("" + str.charAt(i) + str.charAt(j));
                }

            }

            // You can use the above logic to check if string is a palindrome
            // civic, mom, dad, anna,

        }
    }

