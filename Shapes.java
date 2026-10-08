import java.util.Scanner;

class Shape{
    float area(){
        return 0;
    }
    float perimeter(){
        return 0;
    }
    float volume(){
        return 0;
    }
}
class Triangle extends Shape{
    float area(int l,int h){
        return 0.5f*l*h;
    }
    float perimeter(int a,int b,int c){
        return a+b+c;
    }
} 
class Square extends Shape{
    float area(int a){
        return a*a;
    }
    float perimeter(int a){
        return 4*a;
    }
}
class Rectangle extends Shape{
    float area(int l,int b){
        return l*b;
    }
    float perimeter(int l,int b){
        return (2*l)+(2*b);
    }
}
class Circle extends Shape{
    float PI = 3.14f;
    float area(int r){
        return PI*r*r;
    }
    float perimeter(int r){
        return 2*PI*r;
    }
}
public class Shapes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n----Menu----");
            System.out.println("1.Square");
            System.out.println("2.Rectangle");
            System.out.println("3.Triangle");
            System.out.println("4.Circle");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Square s = new Square();
                    System.out.println("Length of a side:");
                    int a = sc.nextInt();
                    System.out.println("Area: "+s.area(a));
                    System.out.println("Perimenter:"+s.perimeter(a));
                    break;
                case 2:
                    Rectangle r = new Rectangle();
                    System.out.println("Enter Length:");
                    int l = sc.nextInt();
                    System.out.println("Enter Breadth");
                    int b = sc.nextInt();
                    System.out.println("Area: "+r.area(l,b));
                    System.out.println("Perimenter"+r.perimeter(l,b));
                    break;
                case 3:
                    Triangle t = new Triangle();
                    System.out.println("Enter Height:");
                    int h = sc.nextInt();
                    System.out.println("Enter Base");
                    int ba = sc.nextInt();
                    System.out.println("Enter side 1:");
                    int s1 = sc.nextInt();
                    System.out.println("Enter side 2:");
                    int s2 = sc.nextInt();
                    System.out.println("Enter side 3:");
                    int s3 = sc.nextInt();
                    System.out.println("Area: "+t.area(ba,h));
                    System.out.println("Perimenter"+t.perimeter(s1,s2,s3));
                    break;
                case 4:
                    Circle c = new Circle();
                    System.out.println("Enter the radius:");
                    int rad = sc.nextInt();
                    System.out.println("Area: "+c.area(rad));
                    System.out.printf("Perimenter: %.2f",c.perimeter(rad));
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(ch!=5);
        sc.close();
    }
}