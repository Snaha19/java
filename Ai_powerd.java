interface speaker{
    
    void speak(String text);
}

interface translattor{
    void translate(String text,String language);
}
class AiAssistant implements speaker,translattor{
    public void speak(String text){
       System.out.println("text :"+text);
    }
    public void translate(String text,String language){
        System.out.println("trnlating "+text+""+"to"+language);
    }
}
public class Ai_powerd {
    public static void main(String[] args) {
        AiAssistant a=new AiAssistant();
        a.speak("hello");
        a.translate("hello", "bengali");
    }
    
}
