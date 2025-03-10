package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newNameTest() {
        String expected = "Doge";

        Dog lab = new Dog("Doge", null, null);

        String actual = lab.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        Date givenBirthDate = new Date(1 / 20 / 20);

        Dog dog = new Dog(null, givenBirthDate, null);

        Date retrievedBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }

    @Test
    public void getIDTest() {
        Integer givenId = 0;

        Dog dog = new Dog(null, null, givenId);

        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void eatFood() {
        Dog dog = new Dog(null, null, null);

        Food puppyChow = new Food();
        dog.eat(puppyChow);

        int expected = dog.getNumberOfMealsEaten();



        Assert.assertEquals(expected,1);
    }

    @Test
    public void speak() {
        Dog dog = new Dog(null, null, null);
        String actual = dog.speak();

        Assert.assertEquals("bark!",actual);
    }

    @Test
    public void isAnimal() {
        Animal dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Animal);


    }

    @Test
    public void isMammal() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
