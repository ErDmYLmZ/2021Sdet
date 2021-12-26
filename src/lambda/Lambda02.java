package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(15,14,9,13,4,9,2,4,14));


        printWithSpace(list);
        System.out.println("\n*********************");
        sumOfDigit(list);


    }

    public static void sumOfDigit(List<Integer> list) {
list.stream().map(MethodLambda02::sumOfDigits).forEach(MethodLambda02::printWithSpace);

    }

    public static void printWithSpace(List<Integer> list) {
        list.stream().forEach(MethodLambda02::printWithSpace);

    }


}
