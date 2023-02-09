package December28;


    public class Child extends Parent{

        public void method1(){

        }

        public void method2(int i){

        }

        //    protected void method3(){  // visibility cannot be reduced
//    }

        //     void method4(){
//    }

        protected void method5(){ // visibility can be increased
        }

        public Integer method6(){ // return type should be the same or covariant type (subtype)
            return 8;
        }

        public String method7(){
            return "d";
        }

        //    public int method8(){  // covariant type does not apply to primitives
//        return 8;
//    }

        //    public Number method9(){
//        return 8;
//    }

        public void printMessage(int i){

        }

        public void calculate(){
            System.out.println(100);
        }

        public void calculate(byte i){
            System.out.println(i);
        }
    }

