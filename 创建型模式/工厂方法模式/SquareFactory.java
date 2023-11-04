import Shape.Square;

public class SquareFactory implements AbstractShapeFactory {
  @Override
  public Square getShape() {
    return new Square();
  }
}
