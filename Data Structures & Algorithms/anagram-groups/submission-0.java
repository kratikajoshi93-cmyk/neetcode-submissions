class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String s : strs) {
            int[] arr = new int[26];
            StringBuilder sb = new StringBuilder();
            for(char c: s.toCharArray()) {
                arr[c-'a']++;
            }
            for(int i=0; i<26; i++) {
                sb.append("#");
                sb.append(arr[i]);
            }
            map.computeIfAbsent(sb.toString(), k->new ArrayList()).add(s);
        }
        return new ArrayList(map.values());
        // Map<String, List<String>> map = new HashMap();
        // for(String s : strs) {
        //     char[] arr = s.toCharArray();
        //     Arrays.sort(arr);
        //     String sorted = new String(arr);
        //     map.computeIfAbsent(sorted, k->new ArrayList()).add(s);
        // }
        // return new ArrayList(map.values());
    }
}
