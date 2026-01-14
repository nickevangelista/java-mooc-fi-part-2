
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("mrthur", "artie");

        String translation = nicknames.get("matthew");
        System.out.println(translation);
    }

}
