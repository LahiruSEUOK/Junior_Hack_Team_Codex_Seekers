
import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("press 1 to search \nPress 2 to view list of searchable fields\nType 'quit' at anytime to exit ");

        String in = input.nextLine();
        switch (in)
        {
            case "1":
                System.out.println("Select \n [1] - Users \n [2] - Tickets \n [3] - Organizations ");

                String i = input.nextLine();

                switch (i) {
                    case "1":
                        users user1 = new users();
                        user1.user();
                        break;

                    case "2":
                        tickets tic = new tickets();
                        tic.ticket();
                        break;
                    case "3":
                        organizations org1 = new organizations();
                        org1.organize();
                        break;
                    case "quit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Input invalid");
                        break;
                }
                    break;
            case "2":
                View list = new View();
                list.items();
                break;
            case "quit":
                System.exit(0);
                break;
            default:
                System.out.println("Input Invalid");
                break;
        }


    }
}
