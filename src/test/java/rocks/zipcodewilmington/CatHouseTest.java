package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
    @Test
    public void addCatToCatHouse() {
        CatHouse.clear();
        Cat catdge = new Cat("Catdge", new Date(11-1-2020), 11);

        CatHouse.add(catdge);

        Cat actual = CatHouse.getCatById(11);

        Assert.assertEquals(catdge,actual);

    }

    @Test
    public void removeCatByID() {
        CatHouse.clear();
        Cat catdge = new Cat("Catdge", new Date(11-1-2020), 11);

        CatHouse.add(catdge);

        CatHouse.remove(catdge);

        Cat actual = CatHouse.getCatById(11);

        Assert.assertEquals(null,actual);

    }

    @Test
    public void removeCatByName() {
        CatHouse.clear();
        Cat catdge = new Cat("Catdge", new Date(11-1-2020), 11);

        CatHouse.add(catdge);

        CatHouse.remove(catdge);

        Cat actual = CatHouse.getCatById(11);

        Assert.assertEquals(null,actual);
    }

    @Test
    public void searchCatByID() {
        CatHouse.clear();
        Cat catdge = new Cat("Catdge", new Date(11-1-2020), 11);

        CatHouse.add(catdge);

        CatHouse.getCatById(11);

        Cat actual = CatHouse.getCatById(11);

        Assert.assertEquals(catdge,actual);
    }

    @Test
    public void getTotalCats() {
        CatHouse.clear();
        Cat catdge = new Cat("Catdge", new Date(11-1-2020), 11);
        Cat kitty = new Cat("Kitty", new Date(11-1-2020), 109);
        Cat sammie = new Cat("Sammie", new Date(11-1-2020), 110);

        CatHouse.add(catdge);
        CatHouse.add(kitty);
        CatHouse.add(sammie);

        int expected = 3;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
}


