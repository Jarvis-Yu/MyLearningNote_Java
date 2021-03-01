package no06_class.n04_advancedGenerics;

import java.util.HashSet;
import java.util.Set;

public class ShapeExample {

  /** The ? can represent any T where <T extends Object>. */
  public static double getMaxHashCode(Set<?> objects) {
    return objects
        .stream()
        .map(Object::hashCode)
        .reduce(Math::max)
        .orElse(0);
  }

  /** The "<? extends Shape>" means it can be any Set<T> where T implements/extends Shape. */
  public static double getMaxArea(Set<? extends Shape> shapes) {
    return shapes
        .stream()
        .map(Shape::getArea)
        .reduce(Math::max)
        .orElse(0.0);
  }

  /** This allows you to refer to the type T used. */
  public static <T extends Shape> T getMaxAreaOne(Set<T> shapes) {
    T biggestShape = shapes
        .stream()
        .reduce((item1, item2) -> item1.getArea() > item2.getArea() ? item1 : item2)
        .orElse(null);
    return biggestShape;
  }

  public static void main(String[] args) {
    Circle circle1 = new Circle(1.0);
    Circle circle2 = new Circle(2.0);
    Circle circle3 = new Circle(3.0);
    Rectangle rectangle1 = new Rectangle(1, 2);
    Rectangle rectangle2 = new Rectangle(3, 4);
    Rectangle rectangle3 = new Rectangle(5, 6);

    Set<Circle> circles = new HashSet<>(Set.of(circle1, circle2, circle3));
    Set<Rectangle> rectangles = new HashSet<>(Set.of(rectangle1, rectangle2, rectangle3));

    System.out.println(getMaxHashCode(circles));
    System.out.println(getMaxHashCode(rectangles));
    System.out.println(getMaxArea(circles));
    System.out.println(getMaxArea(rectangles));
    System.out.println(getMaxAreaOne(circles));
    System.out.println(getMaxAreaOne(rectangles));
  }
}

interface Shape {
  double getArea();
}

class Rectangle implements Shape {
  private final double width;
  private final double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }


  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + width +
        ", height=" + height +
        '}';
  }
}

class Circle implements Shape {
  private final double radius;
  private static final double pi = 3.1415926;

  Circle(double radius) {
    this.radius = radius;
  }


  @Override
  public double getArea() {
    return pi * Math.pow(radius, 2);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        '}';
  }
}
