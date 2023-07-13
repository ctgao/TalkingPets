package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    // Constructor Tests
    @Test
    public void nullaryConstructorTest() {
        // Given: expected default name
        String expectedName = "Snoop";

        // When: dog is created with nullary constructor
        Dog d = new Dog();

        // When: get dog's name
        String actualName = d.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void constructorWithNameTest() {
        // Given: expected default name
        String expectedName = "Peppy";

        // When: dog is created with name constructor
        Dog d = new Dog(expectedName);

        // When: get dog's name
        String actualName = d.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getNameTest() {
        // Given: a dog and expected name
        Dog d = new Dog();
        String expected = "Snoop";

        // When: getting the name
        String actual = d.getName();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given: a dog and expected name
        Dog d = new Dog();
        String expected = "Peppy";

        // When: setting the name
        d.setName(expected);

        // When: getting the name
        String actual = d.getName();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        // Given: a dog and expected speech
        Dog d = new Dog();
        String expected = "woof";

        // When: getting the speech
        String actual = d.speak();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }
}