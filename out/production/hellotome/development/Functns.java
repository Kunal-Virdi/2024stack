package development;

import java.util.function.BiFunction;

public class Functns {
    public static void main(String[] args){
//        int in1 = incrementbyone(3);
//        System.out.println(in1);
//
//        int in2 = incrementByOneFunction.apply(3);
//        System.out.println(in2);
//
//        int mul = multiplyBy10Function.apply(in2);
//        System.out.println(mul);
//
//        Function<Integer,Integer> addByOneAndMultiplyBy10
//                = incrementByOneFunction.andThen(multiplyBy10Function);
//        System.out.println(addByOneAndMultiplyBy10.apply(5));
        System.out.println(addBy1andMultBy10.apply(1,10));
    }
//    this is a bifunction taking to arguments
    static BiFunction<Integer,Integer,Integer> addBy1andMultBy10 =
            (numberToIncremrntByOne,numberToMultiplyBy) -> (numberToIncremrntByOne+1)*(numberToMultiplyBy);
//    Function<type of argument, return type> and "->" is called lambda function
//
//    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;
//    static Function<Integer,Integer> multiplyBy10Function = number -> number*10;
//
//    static int incrementbyone(int n){
//        return ++n;
//    }
}
