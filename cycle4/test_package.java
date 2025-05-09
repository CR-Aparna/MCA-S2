import GraphicS.Area;

public class test_package {
    public static void main(String[] args) {
        Area A = new Area();

        System.out.println("**COMPUTATION OF AREA OF DIFFERENT FIGURES**");
        System.out.println("\n____RECTANGLE____");
        A.rectangle();

        System.out.println("\n____TRIANGLE____");
        A.triangle();

        System.out.println("\n____SQUARE____");
        A.square();

        System.out.println("\n____CIRCLE____");
        A.circle();
    }
}


/***COMPUTATION OF AREA OF DIFFERENT FIGURES**

____RECTANGLE____
Enter the length:
10
Enter the breadth:
20
Area of the rectangle:200

____TRIANGLE____
Enter the base:
20
Enter the height:
10
Area of the triangle:100.0

____SQUARE____
Enter the side:
20
Area of the square:400

____CIRCLE____
Enter the radius:
30
Area of the circle:2827.4333882308138 */