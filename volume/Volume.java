import java.util.Scanner;
class Box {
    double width;
    double depth;
    double height;


    void getWidth(double w) {
        width = w;
    }

    void getDepth(double d) {
        depth = d;
    }

    void getHeight(double h) {
        height = h;
    }

    double calVolume() {
        return width * height * depth;
    }
}

public class Volume {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();


        System.out.println("Enter dimentions for box1");

        System.out.print("Width: ");
        double Width1 = scan.nextDouble();
        box1.getWidth(Width1);
        

        System.out.print("Depth: ");
        double Depth1 = scan.nextDouble();
        box1.getDepth(Depth1);

        System.out.print("Height: ");
        double Height1 = scan.nextDouble();
        box1.getHeight(Height1);

        System.out.println("Enter dimentions for box2");

        System.out.print("Width: ");
        double Width2 = scan.nextDouble();
        box2.getWidth(Width2);
        

        System.out.print("Depth: ");
        double Depth2 = scan.nextDouble();
        box2.getDepth(Depth2);

        System.out.print("Height: ");
        double Height2 = scan.nextDouble();
        box2.getHeight(Height2);

        System.out.println("Enter dimentions for box3");

        System.out.print("Width: ");
        double Width3 = scan.nextDouble();
        box3.getWidth(Width1);
        

        System.out.print("Depth: ");
        double Depth3 = scan.nextDouble();
        box3.getDepth(Depth3);

        System.out.print("Height: ");
        double Height3 = scan.nextDouble();
        box3.getHeight(Height3);


        System.out.println("Volume of box 1 is " + box1.calVolume());
        System.out.println("Volume of box 2 is " + box2.calVolume());
        System.out.println("Volume of box 3 is " + box3.calVolume());
    }
}
