package com.solvd.laba.tables;

public class Animal {
    private int id;
    private Status status;
    private Breed breed;
    private Building building;
    private Objective objective;
    private int age;
    private int weight;

    public Animal(int id, int building) {
        this.id = id;
        this.status = status;
        this.breed = this.breed;
        this.building = this.building;
        this.objective = objective;
        this.age = age;
        this.weight = weight;
    }

    public Animal(int id) {
        this.id = id;
    }

    public Animal() {
    }

    public Animal(int id, int age, int weight) {
        this.id = id;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", status=" + status.getStatus_name() +
                ", breed=" + breed.getBreed_name() +
                ", building=" + building.getName() +
                ", objective=" + objective.getObjective() +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
