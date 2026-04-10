class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character,Integer>fun=new HashMap<>();
        //Frequency Count
       for(int i=0; i<n; i++){
        char ch = s.charAt(i);
            fun.put(ch, fun.getOrDefault(ch, 0) + 1);
       }
            for( int i=0; i<n; i++){
                if(fun.get(s.charAt(i))==1){
                    return i;
                }
            }
            return -1;
        }
    
}


