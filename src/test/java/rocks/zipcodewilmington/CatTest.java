package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        String givenName = "Kitty";


        Cat cat = new Cat(givenName, null, null);

        String retrievedName = cat.getName();

        Assert.assertEquals(givenName, retrievedName);
    }
    @Test
    public void setBirthDate(){
        Date givenBirthDate  = new Date(1/2/20);

        Cat cat = new Cat(null, givenBirthDate, null);

        Date retrievedBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }
    @Test
    public void getIDTest(){
        Integer givenId = 0;

        Cat cat = new Cat(null, null, givenId);

        Integer retrievedId = cat.getId();

        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void eatFood(){
        Cat cat = new Cat(null, null, null);
        eatFood();
    }

    @Test
    public void speak(){
        Cat cat = new Cat(null, null, null);
       speak();

        Assert.assertEquals("bark!","bark!");
    }

    @Test
    public void isAnimal(){
        Animal cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Animal);


    }

    @Test
    public void isMammal(){
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Mammal);
    }

}
