
class registration{
    public static void main(String[] args) {
        demo d=new demo();
        String password="Sn@h@123";
        d.validatePassword(password);
    }
}
class demo{
 void validatePassword(String password){

    boolean upper = false;
    boolean lower = false;
    boolean digit = false;
    boolean special = false;

    String symbols = "~!@#$%^&*()_+?><:/;'[]{}|\\";

    if(password.length() < 8){
        System.out.println("Password must be at least 8 characters long");
        return;
    }

    for(char ch : password.toCharArray()){

        if(Character.isUpperCase(ch)){
            upper = true;
        }

        else if(Character.isLowerCase(ch)){
            lower = true;
        }

        else if(Character.isDigit(ch)){
            digit = true;
        }

        else if(symbols.indexOf(ch) != -1){
            special = true;
        }
    }

    if(upper && lower && digit && special){
        System.out.println("Valid Password");
    }
    else{
        System.out.println("Invalid Password");
    }
}
}