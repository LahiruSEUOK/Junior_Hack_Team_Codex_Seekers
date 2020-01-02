import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Scanner;
public class tickets {

    public void ticket() {
        JSONParser parser = new JSONParser();

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter search term");
        String input = ch.nextLine();

        switch (input) {
            case "id":
                System.out.println("Enter search ID");
                break;
            case " url" :
                System.out.println("Enter search URL");
                break;
            case "external_id":
                System.out.println("Enter external_id");
                break;
            case"type":
                System.out.print("Enter type");
                break;
            case"subject":
                System.out.print("Enter subject");
                break;
            case"description":
                System.out.print("Enter description");
                break;
            case"priority":
                System.out.print("Enter priority");
                break;
            case"status":
                System.out.print("Enter status");
                break;
            case"recipient":
                System.out.print("Enter recipient");
                break;
            case "requested at":
                System.out.println("Enter requested place");
                break;
            case "":
                System.out.println("Enter search domain");
                break;
            case "organization_id":
                System.out.println("Enter organization id");
                break;
            case "submitter id":
                System.out.println("Enter submitter id");
                break;
            case "assignee id":
                System.out.println("Enter assignee id");
                try {
                    int k = ch.nextInt();
                    Object obj = parser.parse(new FileReader("E:\\Junior_Hack\\src\\tickets.json"));
                    JSONArray jsonObject = (JSONArray) obj;
                    System.out.println(jsonObject.get(k));

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tags":
                System.out.println("Enter Tags");
                break;
            case "has_incidents":
                System.out.println("Enter incidents");
                break;
            case "due at":
                System.out.println("Enter due date");
                break;
            case "via":
                System.out.println("Enter search via");
                break;
             default:System.out.println("Invalid input");
                break;
            case "quit":
                System.exit(0);
                break;
        }
    }
}
