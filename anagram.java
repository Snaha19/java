public class anagram {
    public static void main(String[] args) {
        String a="dog";
        String b="god";
        demo d=new demo();
        boolean res=d.check(a, b);
        if(res==true){
            System.out.println("anagram");
        }
        else{
            System.out.println("not");
        }

    }
}
class demo{
    boolean check(String a,String b){
        int[] arr=new int[26];
       for(int i=0;i<a.length();i++){
        arr[a.charAt(i)-'a']++;
        arr[b.charAt(i)-'a']--;

       }
       for(int i=0;i<26;i++){
        if(arr[i]!=0){
            return false;
        }
       }
       return true;
        }
    }

