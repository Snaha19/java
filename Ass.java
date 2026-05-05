public class Ass{
    public static void main(String[] args) {
        Prefix sc=new Prefix();
        String[] str={"flower","flow","flight"};
        System.out.println(sc.fun(str));
    }


}
class Prefix {
    String fun(String[] str){
        if (str.length==0){
            return "";

        }
        String s= str[0];
        
        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(s)){
                s=s.substring(0,s.length()-1);

                if (s.isEmpty()){
                    return "";
                }
            }

        }
        return s;
    }  

}
