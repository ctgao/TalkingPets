package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    @Test
    public void catInheritanceTest(){
        // Given
        // When
        Pet p = new Cat();
        // Then
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void dogInheritanceTest(){
        // Given
        // When
        Pet p = new Dog();
        // Then
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void axolotlInheritanceTest(){
        // Given
        // When
        Pet p = new Axolotl();
        // Then
        Assert.assertTrue(p instanceof Pet);
    }
}