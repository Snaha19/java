abstract class shape{
    String color;
    shape(String color){
        this.color=color;

    }
    abstract void calculateArea();
    abstract void draw();
}
class circle extends shape{
    int r;
    circle(int r,String color){
        super(color);
        this.r=r;
    }
    void calculateArea(){
        double area=(3.14*r*r);
        System.out.println("area :"area);
    }
   
    void draw() {
        System.out.println("drawing circle");
    }

}
class rectangle extends shape{
    int l,b;
    rectangle(int l,int b,String color){
        super(color);
        this.l=l;
        this.b=b;
    }
    void calculateArea(){
        double area=(3.14*l*b);
        System.out.println("area :"+area);
    }
   
    void draw() {
        System.out.println("drawing rectangle");
    }

}

class shape_drawing{
    public static void main(String[] args) {
        circle c=new circle(5, "red");
        c.draw();
        c.calculateArea();
        rectangle r=new rectangle(2, 4, "yellow");
        r.draw();
        r.calculateArea();
    }
}