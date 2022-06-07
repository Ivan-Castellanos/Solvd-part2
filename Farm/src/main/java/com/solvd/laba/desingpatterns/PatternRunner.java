package com.solvd.laba.desingpatterns;

public class PatternRunner {


    public static void main(String[] args) {
        //Builder pattern
        AnimalBuilder animal = new AnimalBuilder(1);
        animal.isAlive();
        animal.breedIsHolando();
        animal.isInSlautherHouse();
        animal.setAge(5);
        animal.setWeigth(500);

        System.out.println(animal.toString());

        //Builde pattern end


    }

}
