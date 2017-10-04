package ir.phgint;

import ir.phgint.Classes.Animals;
import ir.phgint.Classes.AnimalsBuilder;
import ir.phgint.Classes.ProfileBuilder;
import org.junit.Assert;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import ir.phgint.Classes.Janevaran.*;
import org.junit.Test;

public class TestHashMap {

    private  Profile profileAnimal1,profileAnimal2,profileAnimal3;
    private Animals animals1,animals2,animals3;

    @Test
    public void hashMapTest()
    {
        profileAnimal1 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("cat").foodType(Foods.Carnivorous).talk("MIO").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        Map<String,Animals> animalsMap = new HashMap<String, Animals>();

        animalsMap.put("Dog",animals1);
        animalsMap.put("Cat",animals2);
        animalsMap.put("Dog", animals2);

        Assert.assertFalse(animalsMap.values().contains(animals1));

    }
    @Test
    public void linkedHashMapTest()
    {
        profileAnimal1 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("cat").foodType(Foods.Carnivorous).talk("MIO").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        Map<String,Animals> animalsMap = new LinkedHashMap<String, Animals>();

        animalsMap.put("Dog",animals1);
        animalsMap.put("Cat",animals2);
        animalsMap.put("Dog", animals2);

        Assert.assertFalse(animalsMap.values().contains(animals1));
    }
    @Test
    public void treeMapTest()
    {
        profileAnimal1 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("cat").foodType(Foods.Carnivorous).talk("MIO").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal3=  ProfileBuilder.getProfileInstance().name("cat").foodType(Foods.Carnivorous).talk("MIO").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals3 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        SortedMap<String,Animals> animalsMap = new TreeMap<String, Animals>();

        animalsMap.put("Dog1", animals1);
        animalsMap.put("Ordak", animals2);
        animalsMap.put("Dog2", animals1);
        animalsMap.put("Cat2", animals3);

        System.out.println("Tree Maps : " + animalsMap.keySet());
        System.out.println("Tree map size : " + animalsMap.size());

        System.out.println("First Value is :" + animalsMap.firstKey());
        System.out.println("Last  Value is :" + animalsMap.lastKey());

        SortedMap<String,Animals> subanimalsMap = animalsMap.subMap("Cat2","Dog2");
        System.out.println("Tree Maps : " + subanimalsMap.keySet());

    }

    @Test
    public void navigableMapTest()
    {
        profileAnimal1 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("cat").foodType(Foods.Carnivorous).talk("MIO").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal3=  ProfileBuilder.getProfileInstance().name("cat").foodType(Foods.Carnivorous).talk("MIO").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals3 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        NavigableMap<String,Animals> animalsMap = new TreeMap<String,Animals>();

        animalsMap.put("Dog1", animals1);
        animalsMap.put("Cat1", animals2);
        animalsMap.put("Dog2", animals1);
        animalsMap.put("Cat2", animals3);

        System.out.println("Tree Maps : " + animalsMap.keySet());
        System.out.println( "Tree map size : "+ animalsMap.size());

        System.out.println("First Value is :" + animalsMap.firstKey());
        System.out.println("Last  Value is :" + animalsMap.lastKey());

        NavigableMap<String,Animals> revanimalsMap = animalsMap.descendingMap();
        System.out.println("Tree Maps reverse  : " + revanimalsMap.keySet());

    }

    @Test
    public void concurrentMapTest()
    {

        ConcurrentMap<String,String> animalsMap = new ConcurrentHashMap<String, String>();

            animalsMap.put("Dog1","Dog11" );
            animalsMap.put("Dog2", "Dog22");
            animalsMap.put("Cat1", "Cat11");
            animalsMap.put("Cat2", "Cat22");

        System.out.println("Tree Maps : " + animalsMap.keySet());
        System.out.println("Tree map size : " + animalsMap.size());


    }
    @Test
    public void hashTableTest()
    {
        Map<String,String> HashTable = new Hashtable<String, String>();

        HashTable.put("Dog1","Dog11" );
        HashTable.put("Dog2", "Dog22");
        HashTable.put("Cat1","Cat11");
        HashTable.put("Cat2","Cat22");

        System.out.println("HashTable  : " + HashTable.keySet());
        System.out.println("HashTable size : " + HashTable.size());
    }
    @Test
    public void hashSetTest()
    {
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Dog1");
        hashSet.add("Dog2");
        hashSet.add("Cat1");
        hashSet.add("Cat1");

        Iterator x = hashSet.iterator();
        while (x.hasNext())
        System.out.println(x.next());
    }
    @Test
    public void treeSetTest()
    {
        Set<String> treeSet = new TreeSet<String>();

        treeSet.add("Dog1");
        treeSet.add("Dog2");
        treeSet.add("Cat1");
        treeSet.add("Cat1");
        Iterator x = treeSet.iterator();
        while (x.hasNext())
            System.out.println(x.next());


    }
}
