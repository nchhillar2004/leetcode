class Solution {
    public static void main(String[] args){
        String haystack = "mississippi";
        String needle1 = "issip";
        String needle2 = "pi";
    
        int result1 = strStr(haystack, needle1);
        int result2 = strStr(haystack, needle2);
        
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
    }
    public static int strStr(String haystack, String needle) {
        int occurence = -1;

        if (haystack.contains(needle)){
            int startingPoint = 0;
            int endingPoint = haystack.length();
            int requirementLength = needle.length();
            for (int i = 0; i < endingPoint; i++){
                if(haystack.substring(i, i+requirementLength).equals(needle)){
                    occurence = i;
                    break;
                }else{
                    continue;
                }
            }
        }

        return occurence;
    }
}

