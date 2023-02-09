package December07;

public class Computer {
    int instanceCount;
    static int staticCount;

    public Computer(){
        instanceCount++;
        staticCount++;
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Computer c3 = new Computer();

        System.out.println(c1.instanceCount);  // 3 //1
        System.out.println(c1.staticCount); //3  //1

        System.out.println(c2.instanceCount);
        System.out.println(c3.instanceCount);

        Computer c4 = new Computer();

        System.out.println(c1.staticCount);
        System.out.println(c2.staticCount);
    }

}
