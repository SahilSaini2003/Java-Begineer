package classes;

public class P5_StringMethods {
        public static void main(String[] args) {
            String a = "Sahil is a Good Boy.";
            System.out.println(a);
            System.out.println(a.length());
            System.out.println(a.toUpperCase());
            System.out.println(a.toLowerCase());
            // a = "      Sahil is a Good Boy.      ";
            // System.out.println(a);
            // System.out.println(a.trim());
            System.out.println(a.substring(2));
            System.out.println(a.substring(2,8 ));
            System.out.println(a.replace("o", "f"));
            System.out.println(a.replace("Good", "Bad"));
            System.out.println(a.startsWith("Sa"));
            System.out.println(a.endsWith("."));
            System.out.println(a.charAt(16));
            System.out.println(a.indexOf("a"));
            System.out.println(a.indexOf("a",3));
            System.out.println(a.lastIndexOf("o"));
            System.out.println(a.lastIndexOf("o",3));
            System.out.println(a.equals("Sahil is a Good Boy."));
            System.out.println(a.equals("Sahil"));
            System.out.println(a.equals("Sahil is a gOod boy."));
            System.out.println(a.equalsIgnoreCase("Sahil is a gOod boy."));
        }
}
