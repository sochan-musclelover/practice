import java.util.*;

public class SampleJava {
    public static void main(String[] args) {
        String output_tmp;
        for (int num = 1; num < 16; num++) {
            output_tmp = outputFromJudgingNum(num);
            System.out.println("Number" + num + "is:" + output_tmp);
        }
    }

    protected static String outputFromJudgingNum(int num) {
        if (num % 15 == 0) {
            if (num == 0) {
                return "";
            }
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Fizz";
        } else if (num % 3 == 0) {
            return "Buzz";
        } else {
            return "not Fizz and Buzz";
        }
    }
}
