class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
      this.leftStrand = leftStrand;
      this.rightStrand = rightStrand;
      if(this.leftStrand.isEmpty() && !this.rightStrand.isEmpty()) {
        throw new IllegalArgumentException("left strand must not be empty.");
      }
      if(!this.leftStrand.isEmpty() && this.rightStrand.isEmpty()) {
        throw new IllegalArgumentException("right strand must not be empty.");
      }
      if (this.leftStrand.length() != this.rightStrand.length()) {
        throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
      }
    }

    int getHammingDistance() {
      int hammingDistance = 0;
      for (int i = 0; i < this.leftStrand.length(); i++) {
        if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
          hammingDistance++;
        }
      };
      return hammingDistance;
    }

}
