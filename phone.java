class phone{
    public static void main(String[] args) {
        String[] arr={"abc","def"};
        for(int i=0; i<arr[0].length(); i++){
            for (int j = 0; j < arr[1].length(); j++) {
                char a = arr[i].charAt(i);
                char b = arr[i+1].charAt(j);
                System.out.println(a+""+b);
            }
        }
    }
}