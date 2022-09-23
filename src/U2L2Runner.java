public class U2L2Runner {
    public static void main(String[] args) {

//sets the length and width of the rectangles
        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();

//changes the width of all the rectangles to 125
        rect1.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);


//calculates the perimeter for all the rectangles and adds them together
        int totalPerimeter = rect1.calculatePerimeter() + rect2.calculatePerimeter() + rect3.calculatePerimeter();

//calculates the area for all the rectangles and adds them together
        int totalArea = rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea();

//displays the values
        System.out.println("-----------------------------");
        System.out.println("Total length in fencing (in feet) needed: " + totalPerimeter);
        System.out.println("Total area (in square feet) that will need seeding: " + totalArea);
        System.out.println("-----------------------------");


    }
}
