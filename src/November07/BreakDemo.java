package November07;


    public class BreakDemo {

        public static void main(String[] args) {

//
//        for (int i = 0; i < 10; i++) {
//
//            System.out.println(i);
//            break; // terminates the loop
////            System.out.println();
//        }

//        for (int i = 0; i < 10; i++) {
//
//            System.out.println(i);
//
//            if(i == 5){
//                break;
//            }
//
//        }

            System.out.println(indexOf("Hello world", 'l'));
        }

        public static int indexOf(String str, char ch){

            int index = -1;
            for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == ch){
                    index = i;
                    break;
                }
            }

            return index;
        }

    }

