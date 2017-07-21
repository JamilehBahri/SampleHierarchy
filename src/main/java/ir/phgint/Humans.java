package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Humans extends Mammals implements Cloneable, Serializable, Comparable<Janevaran> {

    private Ages age;
    private Gender gender;

    private Humans(String name, Gender gender, Ages age, Foods foods, String t, Habitats habitats,
                  Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        super(name, foods, t, habitats, pregnant, hasHair, hasBackbone);
        this.age = age;
        this.gender = gender;
    }

    private Humans(Humans humans) {
        super(humans);
        age = humans.age;
        gender = humans.gender;
    }

    public static Humans getHumansInstance(String name ,Gender gender,Ages age, Foods foods, String t,Habitats habitats, Pregnant pregnant, boolean hasHair, boolean hasBackbone){
        return new Humans(name,gender,age,foods,t,habitats,pregnant,hasHair,hasBackbone);
    }
    public static Humans getHumansInstance(Humans humans){
        return new Humans(humans);
    }

    public void setAge(Ages age) {
        this.age = age;
    }

    public Ages getAge() {
        return age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }


    public Foods eat(Foods food) {
        if (food.equals(Foods.Carnivorous))
            return Foods.Carnivorous;
        else if (food.equals(Foods.Vegetarian))
            return Foods.Vegetarian;
        else
            return Foods.Unknown;

    }


    public String toString() {
        return "Humans name :" + getProfile().getName() + "\n" +
                "Humans Gender :" + getGender() + "\n" +
                "Humans Age :" + getAge() + "\n" +
                "Humans eat :" + getProfile().getFoodType() + "\n" +
                "Humans talk:" + getProfile().getTalk() + "\n" +
                "Humans Habitats:" + getProfile().getHabitats() + "\n" +
                "Humans Birth:" + getProfile().getPregnant() + "\n" +
                "Humans hasHair:" + getHasHair() + "\n" +
                "Humans hasBackbone :" + getHasBackbone() + "\n";


    }


    public boolean equals(Humans humans) {
        if (humans == this)
            return true;
        if (humans == null)
            return false;
        return super.equals(humans) && (this.age == humans.age) && (this.gender == humans.gender);
    }

    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.age != null ? this.age.hashCode() : 0);
        hash = 31 * hash + (this.gender != null ? this.gender.hashCode() : 0);
        return hash;
    }

    public Humans clone() throws CloneNotSupportedException {
        return (Humans) super.clone();
    }

    public int compareTo(Janevaran o) {

        return super.compareTo(o);

    }
}
