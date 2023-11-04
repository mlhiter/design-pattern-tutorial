import Shape.Rectangle;

public class RectangleFactory implements AbstractShapeFactory {
  @Override
  public Rectangle getShape() {
    return new Rectangle();
  }
}
