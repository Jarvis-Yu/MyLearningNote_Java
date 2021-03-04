# Further Examples
## Predicate\<T\>
```
public interface Predicate<T> {
  // Evaluates this predicate on the given argument
  boolean test(T t);
}
```
## BiFunction\<T, U, T\>
```
public interface BiFunction<T, U, T> {
  R apply(T arg1, U arg2);
}
```
## BinaryOperator\<T\>
```
public interface BinaryOperator<T>
    extends Bifunction<T, T, T> {
}
```