import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        final String menu = "A - Add D - Delete P - Print Q - Quit";
        boolean done = false;
        String cmd = "";


        do
        {

            displayList();
            cmd = SafeInput.getRegExString(in, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            switch(cmd)
            {
                case "A":
                 add(in, list);
                    break;
                case "D":
                 if (list.size()==0)
                 {
                     System.out.println("There are no items on the list");
                     break;
                 }
                    delete(in, list);
                    break;
                case "P":
                    print(list);
                    break;
                case "Q":
                    System.exit(0);
                    break;
            }


        }while(!done);
    }

    private static void displayList()
    {

        if (list.size() != 0)
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println((i + 1) + list.get(i));
            }

    }
    public static void add(Scanner in, ArrayList list)
    {
        String item = SafeInput.getNonZeroLengthString(in, "What item do you want to add?");
        list.add(item);
    }
    public static void delete(Scanner in, ArrayList list)
    {
        int high = list.size();
        String item = SafeInput.getNonZeroLengthString(in, "What item do you want to remove?");
        list.remove(item);
    }
    public static void print(ArrayList list)
    {
        for (int i=0; i<list.size(); i++)
        {
            System.out.println((i+1) + " " + list.get(i));
        }
        System.out.println();
    }

}