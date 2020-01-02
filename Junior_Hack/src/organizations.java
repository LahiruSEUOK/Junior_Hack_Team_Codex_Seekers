import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class organizations {

    public void organize () {
        JSONParser parser = new JSONParser();
        int i;
        Scanner ch = new Scanner(System.in);

                System.out.println("Enter search term");
                String input = ch.nextLine();

                switch (input)
                {
                    case "id" :
                        try {
                            System.out.println("Enter search value");
                            i = ch.nextInt();
                            Object obj = parser.parse(new FileReader("E:\\Junior_Hack\\src\\organizations.json"));
                            JSONArray jsonObject = (JSONArray) obj;
                            System.out.println(jsonObject.get(i - 101));
                        } catch(Exception e){
                            e.printStackTrace();
                        }
                        break;
                    case " url" :
                        System.out.println("Enter search URL");
                        break;
                    case "external_id":
                        System.out.println("Enter external_id");
                        break;
                    case "name":
                        System.out.println("Enter search name");
                        break;
                    case "domain_name":
                        System.out.println("Enter search domain");
                        break;
                    case "created_at" :
                        System.out.println("Enter created place");
                        break;
                    case "details":
                        System.out.println("Enter search details");
                        break;
                    case"shared_tickets":
                        System.out.println("Enter shared tickets value");
                        break;
                    case"tags":
                        System.out.println("Enter search tags");
                        break;
                    default:System.out.println("Invalid input");
                        break;
                    case "quit":
                        System.exit(0);
                        break;


                }







        }
    }

