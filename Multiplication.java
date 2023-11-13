import java.io.*;

public class Multiplication {

    public static void main(String[] args) {
        String num1 = "37837378387378378387387387387337";
        String num2 = "6687637837837837838738737837378";
        int temp;
        int remainder = 0;
        String result = "";
        int count = 0;
        String finalResult = "0";

        for (int j = num2.length() - 1; j >= 0; j--) {
            String y = "" + num2.charAt(j);

            //one digit multiple one string
            for (int i = num1.length() - 1; i >= 0; i--) {
                String x = "" + num1.charAt(i);
                temp = Integer.parseInt(x) * Integer.parseInt(y) + remainder;
                if (temp < 10) {
                    result = temp + result;
                    remainder = 0;
                } else {
                    result = temp % 10 + result;
                    remainder = temp / 10;
                    if (i == 0) {
                        result = remainder + result;
                        remainder = 0;
                    }
                }
            }

            for (int z = 0; z < count; z++) {
                result = result + 0;
            }

            //sum
            finalResult = sum(finalResult, result);
            result = "";
            count++;


        }
        //get the result
        System.out.println(finalResult);
    }

    public static String sum(String n1, String n2) {

        int length1 = n1.length() - 1;
        int length2 = n2.length() - 1;

        int temp;
        int remainder = 0;

        String result = "";

        for (int i = length1; i >= 0; --i) {
            String nn1 = "" + n1.charAt(i);
            String nn2 = "" + n2.charAt(length2);
            temp = Integer.parseInt(nn1) + Integer.parseInt(nn2) + remainder;

            if (temp < 10) {
                result = temp + result;
                remainder = 0;
            } else {
                remainder = temp / 10;
                result = temp % 10 + result;

            }
            length2 -= 1;

            if (i == 0) {
                for (int n = length2; n >= 0; n--) {
                    nn2 = "" + n2.charAt(n);
                    temp = Integer.parseInt(nn2) + remainder;
                    if (temp < 10) {
                        result = temp + result;
                        remainder = 0;
                    } else {
                        remainder = temp / 10;
                        result = temp % 10 + result;
                        if (n == 0) {
                            result = remainder + result;
                        }
                    }
                }

            }

        }
        return result;
    }
}