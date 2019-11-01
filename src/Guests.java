import java.util.Scanner;
public class Guests
{
    //creates an array of guests' names and allows the user to
    //search the aray for a particular vvalue
    public static void main(String[] args)
    {
        String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame",
                            "Ian", "Isobel", "Hakem"};
        String name;
        boolean found = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        name = scan.nextLine();

        //perform a linear search
        for(String guest: guests)
        {
            if(name.equals(guest))
            {
                found = true;
            }//end of if
        }//end of for
        if(found)
            System.out.println(name + " is on the guest list");
        else
            System.out.println(name + " is not on the guest list.");
        System.out.println("By Grace Hudgens");
    }//end of main method
}//end of guest class
