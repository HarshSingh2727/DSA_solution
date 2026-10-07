class Solution {
    public String toGoatLatin(String s) {

        HashSet < Character> vowel = new HashSet() ;
        for(char ch : "aeiouAEIOU".toCharArray()){
            vowel.add(ch) ;
        }
        
        String result = "" ;
        int index = 1 ;

        for(String word : s.split("\\s")){

            if(index > 1){
                result += " " ;
            }

            char firstletter = word.charAt(0) ;
            if(vowel.contains(firstletter)){
                result += word + "ma" ;
            } 
            else{
                result += word.substring(1) + firstletter + "ma" ;
            }

            for(int j = 0 ; j < index ; j++){
                result += "a" ;
            }
            index += 1 ;
        }
    return result ;
    }
}