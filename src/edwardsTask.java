import java.util.Scanner;

public class edwardsTask {


    public static void main(String args[]) {

        //Welcome message
        System.out.println("Welcome to Edwards Limited Edition Calculator");
        System.out.println("Hello; type in your input elements here");

        //The line of code below enables you to type in your input variables
        Scanner scan = new Scanner(System.in);
        String cal = scan.nextLine();

        //This line gets printed toshow your input variables before displaying your solution
        System.out.println("my result is " + cal);

        //initializing your variables
        float result = 0;
        int digit = 0;
        String opp = "";

        //capturing the lenght of the input variables
        int inputlenght = cal.length();

        // a for loop for iterating through the input variables
        // input variables are expected to be numbers between 0 to 9
        // and mathematical expressions involing +, -, *, / used for addition,
        //subtraction, multiplication and division respectively
        for (int i = 0; i < inputlenght; i++) {

            //declarations used to capture possible mathematical operations
            String add = "+";
            String minus = "-";
            String multiply = "*";
            String divide = "/";

            //this splits our input variables and formats them into char
            //this enables us to iterate through the elements from 0 to its nth value.
            char aChar = cal.charAt(i);

            // converts our char values to strings
            String value = String.valueOf(aChar);

            // an if statement utilized to sort out our string values that are at
            // positions between 0 to 9 and are divisible by 2
            if ( i % 2 == 0) {

                //converts our string values to integer values.
                int number = Integer.parseInt(value);

                // an if statement to capture the first digit of the expression and the other digits
                if (i == 0){
                    result = number;
                } else {
                    digit = number;

                    //an if statement to capture calculations involving the last element in
                    //our input variable
                    if (i == (inputlenght-1)){

                        //comparing our input operation values with standard maths values
                        //and checking that we have a minimum of two values to work with
                        //while computing for the last element in the input variable
                        if (opp.equals(add) && digit != 0) {

                            result = result + digit;
                            //System.out.println("last value: " + result);

                        } else if (opp.equals(minus) && digit != 0) {

                            result = result - digit;
                            //System.out.println("last value: " + result);

                        } else if (opp.equals(multiply) && digit != 0) {

                            result = result * digit;
                            //System.out.println("last value: " + result);

                        } else if (opp.equals(divide) && digit != 0) {

                            result = result / digit;
                            //System.out.println("last value: " + result);

                        }

                        //comparing our input operation values with standard maths values
                        //and checking that we have a minimum of two values to work with
                        //while computing for the other element in the input variable
                    } else if (opp.equals(add) && digit != 0) {

                        result = result + digit;
                        //System.out.println("value: " + result);

                    } else if (opp.equals(minus) && digit != 0) {

                        result = result - digit;
                        //System.out.println("value: " + result);


                    } else if (opp.equals(multiply) && digit != 0) {

                        result = result * digit;
                        //System.out.println("value: " + result);


                    } else if (opp.equals(divide) && digit != 0) {

                        result = result / digit;
                        //System.out.println("value: " + result);

                    }

                }


            } else {
                // checks for elements in the input variable that represents
                // mathematical operation symbols
                opp = String.valueOf(aChar);
                //System.out.println(opp);

            }

        }
        //this displays our result after performing all our calculations.
        System.out.println("Thank you for your time, your final result is: " + result);
    }
}
