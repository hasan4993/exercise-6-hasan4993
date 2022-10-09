package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", false);

        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", false);

        Assert.assertEquals("Dog Food", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", true);

        Assert.assertEquals("Salmon", food);
        System.out.println(food);

    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", true);

        Assert.assertEquals("Boiled Chicken", food);
        System.out.println(food);

    }

    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", true);

        Assert.assertEquals("Lettuce", food);
        System.out.println(food);

    }
}
