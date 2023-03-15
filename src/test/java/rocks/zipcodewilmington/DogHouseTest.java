package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.remove;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addDogToDogHouse() {
        DogHouse.clear();
    Dog doge = new Dog("Doge", new Date(11-1-2020), 11);

    DogHouse.add(doge);

    Dog actual = DogHouse.getDogById(11);

    Assert.assertEquals(doge,actual);

    }

    @Test
    public void removeDogByID() {
        DogHouse.clear();
        Dog doge = new Dog("Doge", new Date(11-1-2020), 11);

        DogHouse.add(doge);

        DogHouse.remove(doge);

        Dog actual = DogHouse.getDogById(11);

        Assert.assertEquals(null,actual);

    }

    @Test
    public void removeDogByName() {
        DogHouse.clear();
        Dog doge = new Dog("Doge", new Date(11-1-2020), 11);

        DogHouse.add(doge);

        DogHouse.remove(doge);

        Dog actual = DogHouse.getDogById(11);

        Assert.assertEquals(null,actual);
    }

    @Test
    public void searchDogByID() {
        DogHouse.clear();
        Dog doge = new Dog("Doge", new Date(11-1-2020), 11);

        DogHouse.add(doge);

        DogHouse.getDogById(11);

        Dog actual = DogHouse.getDogById(11);

        Assert.assertEquals(doge,actual);
    }

    @Test
    public void getTotalDogs() {
        DogHouse.clear();
        Dog doge = new Dog("Doge", new Date(11-1-2020), 11);
        Dog doggy = new Dog("Doggy", new Date(11-1-2020), 109);
        Dog sammie = new Dog("Sammie", new Date(11-1-2020), 109);

        DogHouse.add(doge);
        DogHouse.add(doggy);
        DogHouse.add(sammie);

        int expected = 3;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
}
