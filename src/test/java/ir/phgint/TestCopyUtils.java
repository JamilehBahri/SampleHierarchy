package ir.phgint;
import ir.phgint.Classes.Animals;
import ir.phgint.Classes.AnimalsBuilder;
import ir.phgint.Classes.Janevaran;
import ir.phgint.Classes.Janevaran.*;
import ir.phgint.Classes.ProfileBuilder;
import ir.phgint.Copyables.CopyUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCopyUtils {

    private Animals animals,animals2 , newAnimal;


    private Profile profileAnimal,profileAnimal2;



    @Before
    public void initObjectJanevaran() {

        profileAnimal =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals = AnimalsBuilder.getAnimalsInstance(profileAnimal).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("Cat").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

    }

    @Test
    public void a ()
    {
        List<Animals> animalses = new ArrayList<>();
        List<Janevaran> newanimalses = new ArrayList<>();

        animalses.add(animals);
        animalses.add(animals2);
        CopyUtils<Janevaran> cp = new CopyUtils<>();
        cp.copy(newanimalses,animalses);
        for (Janevaran janevaran:newanimalses)
        {
            System.out.println(janevaran);
        }


    }

}
