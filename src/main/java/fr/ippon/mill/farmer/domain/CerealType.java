package fr.ippon.mill.farmer.domain;

public enum CerealType {
    WHEAT("Wheat"), RYE("Rye"), OATS("Oats"), BARLEY("Barley");

    private final String value;

    CerealType(String value) {
        this.value = value;
    }
}
