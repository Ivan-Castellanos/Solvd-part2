package com.solvd.laba.desingpatterns;

public class AnimalBuilder {
    private int id;
    private Boolean alive;
    private String breed;
    private String building_name;
    private Integer age;
    private Integer weigth;

    public AnimalBuilder(int id) {
        this.id = id;
        this.alive = false;
        this.breed = null;
        this.building_name = null;
        this.age = null;
        this.weigth = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void isAlive() {
        this.alive = true;
    }

    public String getBreed() {
        return breed;
    }

    public void breedIsHolando() {
        this.breed = "holando-argentina";
    }

    public void breedIsRedCow() {
        this.breed = "red cow";
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void isInSlautherHouse() {
        this.building_name = "happy-butcher";
    }

    public void isInFarm() {
        this.building_name = "feeding-machine";
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "AnimalBuilder{" +
                "id=" + id +
                ", alive=" + alive +
                ", breed='" + breed + '\'' +
                ", building_name='" + building_name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                '}';
    }
}
