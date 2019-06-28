class Twofer {
    String twofer(String name) {
        String who = name;
        if (who == null) {
          who = "you";
        }
        return "One for " + who + ", one for me.";
    }
}
