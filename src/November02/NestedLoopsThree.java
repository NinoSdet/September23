package November02;

public class NestedLoopsThree {

        public static void main(String[] args) throws InterruptedException {

            for (int i = 0; i < 24; i++) {

                for (int j = 0; j < 60; j++) {

                    for (int k = 0; k < 60; k++) {
                        System.out.print(i + ":" + j + ":" + k + "\r");
                        Thread.sleep(1000);
                    }
                }
            }

        }
    }

