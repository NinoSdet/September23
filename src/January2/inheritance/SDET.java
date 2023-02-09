package January2.inheritance;

public final class SDET extends Employee{



    private boolean hasManualExperience;
    private String progLanguage;

    private String frameworkType;


    public int publicVar = 20;


    public void printInfo(){
        System.out.println(this.publicVar);
        System.out.println(super.publicVar); // to explicitly access super class's hidden variable
    }


    public SDET(String name, long id, boolean fullTime, double salary, boolean hasManualExperience, String progLanguage, String frameworkType) {
        super(name, id, fullTime, salary);
        this.hasManualExperience = hasManualExperience;
        this.progLanguage = progLanguage;
        this.frameworkType = frameworkType;
        setEmail(generateEmail());
    }


     private String generateEmail(){
        return "sdet" + "@company.com";
    }


       public void method1(){

        }

        //public static void doSomething(){
        //        System.out.println("Employee");
        //    }

    // In Java, static methods cannot be overridden, but if the subclass re-declares the method, it is called method hiding

         public static void doSomething(){
            System.out.println("SDET");
        }


//    public void myMethod(){
//
//    }

    public final void myMethod1(){  // subclass of SDET won't be able to override this method


    }

    public boolean isHasManualExperience() {
        return hasManualExperience;
    }

    public void setHasManualExperience(boolean hasManualExperience) {
        this.hasManualExperience = hasManualExperience;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        this.progLanguage = progLanguage;
    }

    public String getFrameworkType() {
        return frameworkType;
    }

    public void setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
    }
}
