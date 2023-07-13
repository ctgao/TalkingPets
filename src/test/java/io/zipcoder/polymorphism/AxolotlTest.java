package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class AxolotlTest {
    // Constructor Tests
    @Test
    public void nullaryConstructorTest() {
        // Given: expected default name
        String expectedName = "Issac";

        // When: axolotl is created with nullary constructor
        Axolotl a = new Axolotl();

        // When: get cat's name
        String actualName = a.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void constructorWithNameTest() {
        // Given: expected default name
        String expectedName = "Aminal";

        // When: axolotl is created with name constructor
        Axolotl a = new Axolotl(expectedName);

        // When: get axolotl's name
        String actualName = a.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getNameTest() {
        // Given: an axolotl and expected name
        Axolotl a = new Axolotl();
        String expected = "Issac";

        // When: getting the name
        String actual = a.getName();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given: an axolotl and expected name
        Axolotl a = new Axolotl();
        String expected = "Aminal";

        // When: setting the name
        a.setName(expected);

        // When: getting the name
        String actual = a.getName();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        // Given: an axolotl and expected speech
        Axolotl a = new Axolotl();
        String expected = "blub";

        // When: getting the speech
        String actual = a.speak();

        // Then: assert equals!
        Assert.assertEquals(expected, actual);
    }
}