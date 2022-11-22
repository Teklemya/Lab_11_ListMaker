import java.util.Random;
import java.util.Scanner;

public class SafeInput
{

    /**
     * Return a user supplied int with the specified range
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @param low    The lower bound for the range of valid values
     * @param high   The higher bound for the range of valid values
     * @return An integer within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = low - 1;
        boolean done = false;
        String trash = "";

        do
        {

            System.out.print(prompt + "[" + low + "-" + high + "] : ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println( retVal+ " is out out of range [" + low + "-" + high + "]");

                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash + ".");
            }

        } while (!done);

        return retVal;
    }
    /**
     * Return a user supplied int
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return An arbitrary int within the range
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {

            System.out.print(prompt + " : ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();

                done = true;

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash + ".");
            }

        } while (!done);

        return retVal;
    }
    /**
     * Return a user supplied double
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return An arbitrary double within the range
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {

            System.out.print(prompt + " : ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an double not " + trash + ".");
            }

        } while (!done);

        return retVal;
    }

    /**
     * Return a user supplied double with the specified range
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @param low    The lower bound for the range of valid values
     * @param high   The higher bound for the range of valid values
     * @return An arbritrary double within the range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {

            System.out.print(prompt + "[" + low + "-" + high + "] : ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <=high)
                {
                    done = true;
                }
                else
                {
                    System.out.println( retVal+ " is out out of range [" + low + "-" + high + "]");

                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an double not " + trash + ".");
            }

        }while(!done);

        return retVal;
    }
    /**
     * get a string that matches a Regular Expression pattern like ###-##-#### \d{3}-\{2}-\d{4}
     * get a string that matches a Regular Expression pattern like M #####  (M|m)\\d{5}
     * @param pipe The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return A String that's at least one character
     */

    public static String getRegExString(Scanner pipe, String prompt, String pattern)
    {
        String retVal = "";
        boolean done = false;
        String trash = "";

        do
        {

            System.out.print(prompt +": ");
            retVal = pipe.nextLine();
            if (retVal.matches(pattern))
            {

                done = true;

            }
            else // you have a zero length string
            {

                System.out.println("What you entered does not match the pattern " + trash + ".");
            }

        } while (!done);

        return retVal;
    }

    public static void sayHello()
    {
        System.out.println("Hello!");
    }

    public static void sayHello(int times)
    {
        for (int i = 0; i <= times; i++)
            System.out.println("Hello!");
    }

    public static void sayMsg(String msg, int times)
    {
        for (int i = 0; i <= times; i++)
            System.out.println(msg);
    }

    public static int doubleIt(int num)
    {
        int retVal = 0;

        retVal = num * 2;

        return retVal;
    }
    public static String getNonZeroLengthString(Scanner pipe, String prompt) {
        String retVal = "";
        boolean done = false;
        String trash = "";

        do {

            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() != 0) {

                done = true;

            } else // you have a zero length string
            {

                System.out.println("You must enter at least one character not " + trash + ".");
            }

        } while (!done);

        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retVal = false;
        boolean done = false;
        String inputYN = "";
        do {
            System.out.print(prompt + "[Y/N]:");
            inputYN = pipe.nextLine();
            if (inputYN.equalsIgnoreCase("Y")) {
                done = true;
                retVal = true;
            } else if (inputYN.equalsIgnoreCase("N")) {
                done = true;
                retVal = false;
            } else {
                System.out.println("You must enter Y or N");
            }
        } while (!done);

        return retVal;
    }
    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
    }


}