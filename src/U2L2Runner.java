public class U2L2Runner {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();


        rect1.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);


        System.out.println("Perimeter for rect1: " + (2*(rect1.getLength() + rect1.getWidth())));
        System.out.println("Perimeter for rect2: " + (2*(rect2.getLength() + rect2.getWidth())));
        System.out.println("Perimeter for rect3: " + (2*(rect3.getLength() + rect3.getWidth())));
        


        rect1.printRectangleInfo();
        rect2.printRectangleInfo();
        rect3.printRectangleInfo();
    }
}