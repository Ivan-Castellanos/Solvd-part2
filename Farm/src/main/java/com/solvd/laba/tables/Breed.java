package com.solvd.laba.tables;

public class Breed {
    private int id;
    private Specie specie;
    private String breed_name;

    public Breed(int id) {
        this.id = id;
    }

    public Breed() {

    }

    public Breed(int id, int specie_id, String breed_name) {
    }

    @Override
    public String toString() {
        return "Breed{" +
                "breed_name='" + breed_name + '\'' +
                '}';
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

    public String getBreed_name() {
        return breed_name;
    }

    public void setBreed_name(String breed_name) {
        this.breed_name = breed_name;
    }
}
