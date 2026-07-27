class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap();


        for (String s : strs) {
            var sorted = sortedString(s);
            if (map.containsKey(sorted)) {
               var arr = map.get(sorted);
               arr.add(s);
            } else {
                var arr = new ArrayList<String>();
                arr.add(s);
                map.put(sorted, arr);
            }
        }

        map.values().forEach(v -> res.add(v));
        return res;
    }

    public String sortedString(String s) {
        var charArr = s.toCharArray();
        var buf = new StringBuffer();

        Arrays.sort(charArr);
        for (char c : charArr)
            buf.append(c);

        return buf.toString();
    }
}
