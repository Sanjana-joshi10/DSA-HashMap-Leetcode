class Solution {
    public static  boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer>need=new HashMap<>();
        HashMap<Character, Integer>have=new HashMap<>();
        // ransomNote Char Count
        for(char c : ransomNote.toCharArray()){
            need.put(c, need.getOrDefault(c,0)+1);
        }
        // Magazine Char Count
        for(char c : magazine.toCharArray()){
            have.put(c, have.getOrDefault(c,0)+1);
        }
        // need Vs have
        for(char c: need.keySet()){
            int required = need.get(c);
            int available = have.getOrDefault(c,0);
            if (available < required){
                return false;
            }
        }
        return true;    
    }
    public static void main(String[] args){
String ransomNote = "aa";
String magazine = "aab";
if(canConstruct(ransomNote, magazine)){
    System.out.println("ransome note can be make");
} else {
    System.out.println("ransome note can not be make ");
}
    }
}
