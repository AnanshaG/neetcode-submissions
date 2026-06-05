class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String word: strs){
            res+= word.length() + "#" + word;
        }
        return res;
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int delimeter = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimeter));
            String word = str.substring(delimeter + 1, delimeter + 1 + length);
            res.add(word);
            i = delimeter + 1 + length;
        }
        return res;

    }
}
