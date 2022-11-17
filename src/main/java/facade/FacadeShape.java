package facade;

public class FacadeShape {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public FacadeShape(Shape circle, Shape rectangle, Shape square) {
        this.circle = circle;
        this.rectangle = rectangle;
        this.square = square;
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
