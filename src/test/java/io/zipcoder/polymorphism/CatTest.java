package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void getNameTest() {
        // Given: a cat and expected name
        Cat c = new Cat();
        String expected = "Nyan";

        // When: getting the name
        String actual = c.getName();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given: a cat and expected name
        Cat c = new Cat();
        String expected = "Garfield";

        // When: setting the name
        c.setName(expected);

        // When: getting the name
        String actual = c.getName();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        // Given: a cat and expected speech
        Cat c = new Cat();
        String expected = "meow";

        // When: get the speech
        String actual = c.speak();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }
}