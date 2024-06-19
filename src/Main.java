import javax.xml.transform.Source;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String a = "3";
        String b = "+";
        String c = "7";
        String d = "=";
        String e = "10";
        //1.
        System.out.println("Hello "+ANSI_RED+"World"+ANSI_RESET+"!");
        //2.
        System.out.println("Benjamin");
        System.out.println("Kranzl");
        //3.+4.
        System.out.print("Heute \t");
        System.out.print("ist \t");
        System.out.print("Mittwoch \t");
        System.out.print("der \t");
        System.out.print("04. \t");
        System.out.print("Oktober \t");
        System.out.println("2023 \t");
        //5.
        System.out.println(ANSI_RED+"3"+"+"+"7"+"="+"10"+ANSI_RESET);
        System.out.println(a+b+c+d+e);
        //5.1
        System.out.println(ANSI_CYAN+"Hello"+" "+ANSI_GREEN+"World"+ANSI_RESET+"!");
        //6.
        System.out.println(a);
        //7.
        System.out.println(ANSI_CYAN+"1\t"+ANSI_GREEN+"2\t"+ANSI_RED+"3\t"+ANSI_BLUE+"4\t"+ANSI_PURPLE+"5"+ANSI_RESET);
        System.out.println(3+7);

    }
}