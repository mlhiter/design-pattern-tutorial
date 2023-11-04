import Shape.Circle;

public class CircleFactory implements AbstractShapeFactory {
  @Override
  public Circle getShape() {
    return new Circle();
  }
}
