import java.util.stream.IntStream;

class Hamming {

  private String leftStrand;
  private String rightStrand;

  Hamming(String leftStrand, String rightStrand) {
    this.validateInput(leftStrand, rightStrand);
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
  }

  int getHammingDistance() {
    return (int) IntStream.range(0, this.leftStrand.length())
      .filter(i -> this.leftStrand.charAt(i) != this.rightStrand.charAt(i))
      .count();
  }

  void validateInput(String leftStrand, String rightStrand) {
    if (leftStrand.length() == rightStrand.length()) {
      return;
    }
    if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
      throw new IllegalArgumentException("left strand must not be empty.");
    }
    if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
      throw new IllegalArgumentException("right strand must not be empty.");
    }
    throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
  }

}
