package com.solvd.laba.tables;

public class MeatCuts {
    private int id;
    private Specie specie;
    private int price_per_kg;
    private String cut_name;

    public MeatCuts(int id, int specie_id, String cut_name, int price_per_kg) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public int getPrice_per_kg() {
        return price_per_kg;
    }

    public void setPrice_per_kg(int price_per_kg) {
        this.price_per_kg = price_per_kg;
    }

    public String getCut_name() {
        return cut_name;
    }

    public void setCut_name(String cut_name) {
        this.cut_name = cut_name;
    }
}
