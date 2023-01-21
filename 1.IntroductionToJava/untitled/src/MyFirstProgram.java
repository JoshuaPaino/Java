
public class MyFirstProgram {

    public static int staticVar = 20;
    public static void main(String[] args){
        final int maxRating = 10;
        int varInt;

        varInt = 50;

        System.out.println(staticVar);

        System.out.format("The integer %d is the value of the variable.", varInt );
        String varString = "This is a string\n";

        System.out.println(varString);
        System.out.format(varString);
        System.out.format("The string value: " + varString);
        int number = 20;
        System.out.println(number); //In-line Comment
        System.out.println(varInt); //In-line Comment
        System.out.println(maxRating); //In-line Comment
    }


}