package December14;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // StringBuffer is a legacy class, the main difference is StringBuffer methods are synchronized/thread-safe

        sb.append("123").delete(0,1).insert(0,'2');

        System.out.println();
    }
}
