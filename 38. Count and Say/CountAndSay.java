class Solution {
    public String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        String prev = countAndSay(n - 1);
        return count(prev);
    }
    
    public String count(String str){
        StringBuilder ans = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i - 1)){
                count++;
            }
            else{
                ans.append(count);
                ans.append(str.charAt(i - 1));
                count = 1;
            }
        }
        
        ans.append(count);
        ans.append(str.charAt(str.length() - 1));
        
        return ans.toString();
    }
}