public enum Suit {
    HEARTS("H"), DIMONDS("D"), CLUBS("C"), SPADES("S");

    private String value;

    Suit(String value) {
        this.value = value;
    }
    String getValue(){
        return this.value;
    }
}
