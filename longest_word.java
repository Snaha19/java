public class longest_word {
    public static void main(String[] args) {
        String sen="innovation distringuises between a leader and a follower";
        int len=0;
        String s="";
        for(String ch:sen.split(" ")){
           if( ch.length()>len){
            len=ch.length();
            s=ch;
           }
        }
        System.out.println(len+" : "+s);
    }
}
