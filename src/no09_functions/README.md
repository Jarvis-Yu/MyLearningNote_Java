# Functional Interface

Interfaces that has exactly one abstract method

e.g.

```
interface A {
  MyType fun(AnotherType t);
}

// Add this @FunctionalInterface annotation when you mean
//     this interface should be functional
@FunctionalInterface
interface B {
  void fun();
}
```