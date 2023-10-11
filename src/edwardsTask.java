import java.util.Scanner;

public class edwardsTask {

    static void endProgram(){
        System.out.println("Opps: you entered an invalid character");
    }


    public static void main(String args[]) {

        //Welcome message
        System.out.println("Welcome to Edwards Limited Edition Calculator");
        System.out.println("Hello; type in your input elements here");

        //The line of code below enables you to type in your input variables
        Scanner scan = new Scanner(System.in);
        String cal = scan.nextLine();

        //This line gets printed toshow your input variables before displaying your solution
        System.out.println("Your input expression is " + cal);

        //initializing your variables
        int result = 0;
        int digit = 0;
        String opp = "0";

        char a = opp.charAt(0);

        //capturing the lenght of the input variables
        int inputlenght = cal.length();

        if (inputlenght <= 5) {
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

                //values created for the purposes of comparing invalid operator values
                //char a = opp.charAt(0);
                char b = add.charAt(0);
                char c = minus.charAt(0);
                char d = divide.charAt(0);
                char e = multiply.charAt(0);

                //this splits our input variables and formats them into char
                //this enables us to iterate through the elements from 0 to its nth value.
                char aChar = cal.charAt(i);

                // converts our char values to strings
                String value = String.valueOf(aChar);

                // an if statement utilized to sort out our string values that are at
                // positions between 0 to 9 and are divisible by 2
                if (i % 2 == 0) {

                    //converts our string values to integer values.
                    int number = Integer.parseInt(value);

                    // an if statement to capture the first digit of the expression and the other digits
                    if (i == 0) {
                        result = number;
                    } else {
                        digit = number;

                        //an if statement to capture calculations involving the last element in
                        //our input variable
                        var b1 = a != b || a != c || a != d || a != e;
                        if (i == (inputlenght - 1)) {

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

                                //checking for invalid characters
                            } else if (b1) {

                                //System.out.println("you entered an invalid character");
                                endProgram();
                                System.exit(0);
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

                            //checking for invalid characters
                        } else if (b1) {

                            //System.out.println("you entered an invalid character");
                            endProgram();
                            System.exit(0);
                        }

                    }


                } else {
                    // checks for elements in the input variable that represents
                    // mathematical operation symbols
                    opp = String.valueOf(aChar);
                    //System.out.println(opp);
                     a = opp.charAt(0);

                }

            }
            //this displays our result after performing all our calculations.
            System.out.println("Thank you for your time, your final result is: " + result);

        } else if (inputlenght >= 6) {

            System.out.println("Opps: you can't work with more than three numbers per time");

        }
    }
    }
