class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String s : strs) {
            builder.append(s.toCharArray().length);
            builder.append("#");
            builder.append(s);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int hashIndex = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, hashIndex));
            int start = hashIndex+1;
            int end = start+length;
            result.add(str.substring(start, end));
            i=end;
        }
        return result;
    }
}
