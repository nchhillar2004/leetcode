// Beats 10%
class Solution {
    private boolean countFreq(Map<Character, Integer> f){
        
        for (int i : f.values()){
            for (Map.Entry<Character, Integer> entry : f.entrySet()){
                if (i!=entry.getValue()) return false;
            }
        }
        
        return true;
    }
    public boolean equalFrequency(String word) {
        Set<Character> processed = new HashSet<>(); 
        for (int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if (processed.contains(currentChar)) continue;
            
            processed.add(currentChar);
            StringBuilder temp = new StringBuilder(word);
            temp.deleteCharAt(i);
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < temp.length(); j++){
                char ch = temp.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            if (countFreq(map)) return true;
        }

        return false;
    }
}
