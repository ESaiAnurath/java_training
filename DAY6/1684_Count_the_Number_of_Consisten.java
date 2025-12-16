//1684. Count the Number of Consistent Strings
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet <Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int c =0;
        for(int i=0;i<words.length;i++){
            int f=0;
            for(int j=0;j<words[i].length();j++){
            if(!set.contains(words[i].charAt(j))){
                f = 1;
                break;
            }
        }
        
        if(f==0){
            c++;
        }
        }
        return c;
    }
        
    }
