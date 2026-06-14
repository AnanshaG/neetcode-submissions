class Solution {

    private final String deli = "#";

    public String encode(List<String> strs) {

        StringBuffer en = new StringBuffer();

        for(String str: strs){
            int length = str.length();
            String temp = "" + length + deli + str;
            en.append(temp);
        }
        System.out.println(en.toString());
        return en.toString();

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        String count = "";
        for(int i = 0; i < str.length(); i++){
        	
            System.out.println("count: " + count);
            if(Character.isDigit(str.charAt(i))) {
            	
            	count = count + String.valueOf(str.charAt(i));
            	
            }
            
            
            else if(str.charAt(i) == '#') {
            	int len = Integer.valueOf(count);
                count = "";
            	String result = str.substring(i + 1, i + 1 + len);
            	res.add(result);
            	i = i + len;
            }
        }
        
        return res;

    }
}
