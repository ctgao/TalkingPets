package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
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