package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class AxolotlTest {
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