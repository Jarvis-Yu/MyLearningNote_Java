package no08_exception;

/**
 * The "@SuppressWarnings("serial")" ignores a compiler warning which is not used normally.
 *     Details in "MyException.md"
 */
@SuppressWarnings("serial")
public class MyException extends Exception{

  @Override
  public String getMessage() {
    return String.format("MyException message (%s)", super.getMessage());
  }
}
