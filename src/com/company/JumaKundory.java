package com.company;

public enum JumaKundory {

    DUISHOMBU("JAWA sabagy bolot"),
    SHEISHEMBI("Anglis sabagy bolot"),
    SHARSHEMBI("Praktikalyk ish sabagy bolot"),
    BEISHEMBI("Soft skils sabagy bolot"),
    JUMA("Tenikalyk ish sabagy bolot"),
    ISHEMBI("Kaitaloo bolot"),
    JEKSHEMBI("Sabak bolboit");

    String sabak;

    JumaKundory(String sabak) {
        this.sabak = sabak;
    }
    @Override
    public String toString() {
        return this.name() +" kunu - " +sabak;
    }
}
