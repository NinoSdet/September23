package December16;

public class ClassTask063WrapperClasses {
    public static void main(String[] args) {

        System.out.println(convertPrice("$40.90")); // 40.9
        System.out.println(convertPrice("$91.01")); // 91.01
        System.out.println(convertPrice("$1,149.99")); // 1149.99
        System.out.println(convertPrice("$1,699.00")); // 1699.0
        System.out.println(convertPrice("$14,688.35")); // 14688.35




    }


    // Create  a method that takes a String, i.e "$40.90" (assuming all prices will be double) and processes it and returns the double value as primitive;


    public static double convertPrice(String price){
       /*StringBuilder sb = new StringBuilder();
        for (int i=0; i<price.length(); i++){
            char ch =price.charAt(i);
            if (Character.isDigit(ch) || ch=='.'){
                sb.append(ch);
            }
        }

        return Double.parseDouble(sb.toString());*/
        price=price.replaceAll("[$,]", "");
        return Double.parseDouble(price);
    }
}
