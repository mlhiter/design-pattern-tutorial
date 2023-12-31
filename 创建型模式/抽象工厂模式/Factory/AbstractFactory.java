package Factory;

import Color.Color;
import Shape.Shape;

public abstract class AbstractFactory {
  public abstract Color getColor(String color);

  public abstract Shape getShape(String shape);
}
