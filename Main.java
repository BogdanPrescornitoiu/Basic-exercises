import Engine.Functions;

public class Main {
    public static void main(String[]args){

        System.out.println(Functions.reverseString("Hello World"));

        Functions.swapNumbers(2,5);

        Functions.swapNumbers2(2,5);

        System.out.println(Functions.countWords("Hello World"));

        System.out.println(Functions.isPrimeNumber(3));

        System.out.println(Functions.isPalindrome("Helloolleh"));

        System.out.println(Functions.fibSeries(17));

        System.out.println(Functions.isFibonacci(144));

        System.out.println(Functions.duplicateChars("Heeeellooo"));

        System.out.println(Functions.secondHighest(new int[]{1, 3, 3, 4,5,6}));

        System.out.println(Functions.isArmstrong(1634));

        System.out.println(Functions.removeSpaces("Hello world"));
    }
}
