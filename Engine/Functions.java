package Engine;

import java.util.*;

public class Functions {

    // Write a Java Program to reverse a string without using String inbuilt function.
    public static String reverseString(String input) {

        String result = "";

        for (int i = input.length(); i > 0; i--) {
            result = result.concat(input.substring(i - 1, i));
        }
        return result;
    }

    //Write a Java Program to swap two numbers with using a third variable
    public static void swapNumbers(int num1, int num2) {

        System.out.println("first number: " + num1 + ", second number: " + num2);
        int aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("After the change");
        System.out.println("first number: " + num1 + ", second number: " + num2);
    }

    //Write a Java Program to swap two numbers without using the third variable.
    public static void swapNumbers2(int num1, int num2) {

        System.out.println("first number: " + num1 + ", second number: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After the change");
        System.out.println("first number: " + num1 + ", second number: " + num2);
    }

    //Write a Java Program to count the number of words in a string using HashMap.
    public static int countWords(String input) {

        Map<Integer, String> strMap = new HashMap<>();
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals(" ")) {
                strMap.put(i, input.substring(index, i));
                index = i + 1;
            }
        }
        strMap.put(index, input.substring(index, input.length()));
        return strMap.size();
    }

    //Write a Java Program to find whether a number is prime or not.
    public static boolean isPrimeNumber(int input) {

        boolean result = true;

        if (input < 1) result = false;
        for (int i = 1; i < input; i++) {
            if ((input % i == 0) && (i != 1)) result = false;
        }
        return result;
    }

    //Write a Java Program to find whether a string or number is palindrome or not.
    public static boolean isPalindrome(String input) {

        String str1, str2;

        if (input.length() % 2 == 0) {
            str1 = input.substring(0, input.length() / 2);
            str2 = input.substring((input.length() / 2), input.length());
            if (str1.equalsIgnoreCase(Functions.reverseString(str2))){return true;}
            else return false;
        } else {
            str1 = input.substring(0, input.length() / 2);
            str2 = input.substring((input.length() / 2) + 1, input.length());
            if (str1.equalsIgnoreCase(Functions.reverseString(str2))){return true;}
            else return false;
        }
    }

    //Write a Java Program for Fibonacci series. Returns a list with size equal to input.
    public static List<Integer> fibSeries(int input){

        List<Integer> result = new ArrayList<>();

        int num1=1;
        int num2=1;
        int num3=1;

        result.add(num1);
        result.add(num2);
        for(int i=2;i<input;i++){
            num3=num1+num2;
            result.add(num3);
            num1=num2;
            num2=num3;
        }
        return result;
    }

    //Write a Java Program to find whether a number is Fibonacci or not.
    public static boolean isFibonacci(int input){

        return  ((Functions.fibSeries(input).contains(input)));
    }

    //Write a Java Program to find the duplicate characters in a string.
    public static Map<Character,Integer> duplicateChars(String input){

        Map<Character,Integer> result = new HashMap<>();

        for (int i=0;i<input.length();i++){

            if(result.containsKey(input.charAt(i))){
                result.put(input.charAt(i),((result.get(input.charAt(i)))+1));
            } else result.put(input.charAt(i),1);
        }
        return result;
    }

    // Write a Java Program to find the second highest number in an array.
    public static int secondHighest(int[] input){

        List<Integer> inputList = new LinkedList();
        Set<Integer> inputSet = new HashSet<>();
        Iterator<Integer> iter = inputSet.iterator();
        int j=1;

        for (int i: input){inputSet.add(i);}
        for (int i: inputSet){inputList.add(i);}
        inputList.sort(Integer::compareTo);

        return inputList.get(inputList.size()-2);
    }

    //Write a Java Program to check Armstrong number.
    //Armstrong number is the number which is the sum of the cubes of all its unit.
    public static boolean isArmstrong(int input){

        String strInput = Integer.toString(input);
        int[] arrayInput = new int[strInput.length()];
        int result=0;

        for (int i=0;i<strInput.length();i++){
            result= (int) (result+Math.pow(Integer.valueOf(strInput.substring(i,i+1)),strInput.length()));
        }

        if(input==result) return true;
        else return false;
    }

    //Write a Java Program to remove all spaces from a string without using replace().
    public static String removeSpaces (String input){

        String result="";
        int index=0;

        for(int i=0;i<input.length();i++){
            if (input.charAt(i)==' '){
                result=result+input.substring(index,i);
                index=i+1;
            }
        }
        result=result+input.substring(index,input.length());
        return result;
    }
}
