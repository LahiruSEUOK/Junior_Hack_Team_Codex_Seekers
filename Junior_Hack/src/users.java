import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;

public class users {

    public void user() {
        JSONParser parser = new JSONParser();
        Scanner ch = new Scanner(System.in);
        try {
            System.out.println("Enter search term\n_id");
            System.out.println("Enter search value");
            int k = ch.nextInt();
            Object obj = parser.parse(new FileReader("E:\\Junior_Hack\\src\\1users.json"));
            JSONArray jsonObject = (JSONArray) obj;
            System.out.println(jsonObject.get(k - 1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }}