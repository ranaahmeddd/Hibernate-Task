package facade;

public class FacadeDemo {
    public static void main(String[] args) {
        FacadeShape shape = new FacadeShape(new Circle(), new Rectangle(), new Square());

        shape.drawCircle();
        shape.drawRectangle();
        shape.drawSquare();
    }
}
