import java.util.stream.IntStream;

class Hamming {

  private String leftStrand;
  private String rightStrand;

  Hamming(String leftStrand, String rightStrand) {
    this.validateInput(leftStrand, rightStrand);
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
  }

  long getHammingDistance() {
    IntStream stream = IntStream.range(0, this.leftStrand.length());
    return stream.filter(i -> this.leftStrand.charAt(i) != this.rightStrand.charAt(i)).count();
  }

  void validateInput(String leftStrand, String rightStrand) {
    if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
      throw new IllegalArgumentException("left strand must not be empty.");
    }
    if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
      throw new IllegalArgumentException("right strand must not be empty.");
    }
    if (leftStrand.length() != rightStrand.length()) {
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
  }

}
