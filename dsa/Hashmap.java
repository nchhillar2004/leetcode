import java.util.HashMap;
import java.util.Map;

class Hashmap{
    public static void main(String[] args){
        // Key-value pairs, O(1) time complexity
        // similar to dictionaries in python and Objects in JavaScript
        HashMap<String, Integer> myHashMap = new HashMap<>();

        myHashMap.put("I", 1);
        myHashMap.put("V", 5);
        myHashMap.put("X", 10);
        myHashMap.put("L", 50);

        if (myHashMap.containsKey("L")){ // check is key exists
            System.out.println("Contains L");
            System.out.println(myHashMap.get("L")); // get value of key 'L'
        }

        // returns all keys seperately
        for (String key : myHashMap.keySet()){
            System.out.println(key);
        }

        for (Map.Entry<String, Integer> entry : myHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        myHashMap.remove("X");

        System.out.println(myHashMap.values()); // HashMap values, return set of all values
        System.out.println(myHashMap.size()); // HashMap size
        
        myHashMap.clear(); // clear hash map, delete all key and values

        System.out.println(myHashMap.isEmpty()); // check is empty
    }
}
