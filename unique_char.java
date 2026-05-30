public class unique_char {
    public static void main(String[] args) {
        String word = "hel";
        demo d = new demo();
        boolean result = d.check(word);
        System.out.println(result);
    }
}
class demo{
    boolean check(String word){
         int[] arr=new int[26];
        for(char ch: word.toCharArray()){
        arr[ch - 'a']++;
    }
    for(int i=0;i<26;i++){
        if(arr[i]>1){
          return false;
        }
          
    }
    return true;
    
}
}
