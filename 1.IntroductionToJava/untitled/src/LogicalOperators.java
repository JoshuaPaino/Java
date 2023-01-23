public class LogicalOperators {

    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isCoffeeBitter  = true;
        boolean isTheSkyPurple = false;
        boolean isTheEarthFlat = false;

        //The OR Operator
        System.out.println("(isJavaFun || isCoffeeBitter):" + (isJavaFun || isCoffeeBitter));
        System.out.println("(isJavaFun || isCoffeeBitter):" + (isJavaFun || isTheSkyPurple));
        System.out.println("(isJavaFun || isCoffeeBitter):" + (isTheEarthFlat || isCoffeeBitter));
        System.out.println("(isJavaFun || isCoffeeBitter):" + (isTheSkyPurple || isTheEarthFlat));
    }
}
