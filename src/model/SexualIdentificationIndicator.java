package model;

public enum SexualIdentificationIndicator {

    M("Male"),
    F("Female"),
    O("Other");

    String fullName;

    SexualIdentificationIndicator(String fullName) {
        this.fullName = fullName;
    }
}
