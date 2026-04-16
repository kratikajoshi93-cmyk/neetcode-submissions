class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length()-1;
        for(int i=0; i<s.length()/2; i++) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

             while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            j--;
        }
        return true;
        // String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // int j = input.length()-1;
        // char[] arr = input.toCharArray();
        // for(int i=0; i<input.length()/2; i++) {
        //     if(arr[i]!=arr[j]) {
        //         return false;
        //     }
        //     j--;
        // }
        // return true;
    }
}
