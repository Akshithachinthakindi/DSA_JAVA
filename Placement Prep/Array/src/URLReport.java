import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URLReport {

    public static void parseURL(String url) {
        // Split the URL into base URL and query string
        String[] parts = url.split("\\?");
        String baseURL = parts[0];
        Map<String, String> params = new HashMap<>();

        // Parse the query string if it exists
        if (parts.length > 1) {
            String[] paramPairs = parts[1].split("&");
            for (String paramPair : paramPairs) {
                String[] keyValue = paramPair.split("=");
                params.put(keyValue[0], keyValue[1]);
            }
        }

        // Check parameter validity and print report
        if (checkParams(params)) {
            System.out.println(baseURL);
            System.out.println(params.size());
            params.entrySet().stream().sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
            System.out.println("200");
        } else {
            System.out.println("404");
        }
    }

    public static boolean checkParams(Map<String, String> urlParams) {
        // Get reference values (modify this as needed)
        Map<String, Integer> refParams = new HashMap<>();
        refParams.put("page", 10);
        refParams.put("limit", 20);
        refParams.put("sort", 1); // Assuming a numerical value for "sort"

        // Check parameter validity
        for (Map.Entry<String, String> entry : urlParams.entrySet()) {
            String key = entry.getKey();
            int value = Integer.parseInt(entry.getValue());
            if (!refParams.containsKey(key) || value > refParams.get(key)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = scanner.nextLine();
        parseURL(url);
    }
}
