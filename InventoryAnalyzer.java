import java.util.HashMap;
import java.util.Map;

public class InventoryAnalyzer {

    public static void main(String[] args) {
        String inventory = "Apples 10, Bananas 5, Oranges 8, Apples 5, Grapes 12";
        Map<Character, Integer> frequencyMap = calculateFrequency(inventory);
        
        // Display the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> calculateFrequency(String inventory) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string
        for (char ch : inventory.toLowerCase().toCharArray()) {
            if (ch != ' ' && ch != ',') { // Skip spaces and commas
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        return frequencyMap;
    }
}
