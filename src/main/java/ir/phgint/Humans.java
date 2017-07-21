package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Humans extends Mammals {

    private Ages age;
    private Gender gender;

    private Humans(Profile profile) {
        super(profile);
    }

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

    protected static Humans getHumansInstance(Profile profile) {
        return new Humans(profile);
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

    @Override
    public String toString() {
        return "Humans{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
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

    public void deepCopyFrom(Humans humans) {

        Humans human = new Humans(humans);

    }

    public Humans deepCopy() {

        return new Humans(this);
    }

    public void shallowCopyFrom(Humans humans) {

        this.gender = humans.gender;
        this.age = humans.age;
    }

    public Humans shallowCopy() {

        Humans j = new Humans(this);
        j.gender = this.gender;
        j.age = this.age;
        return j;
    }


    public int compareTo(Humans o) {
        int res = super.compareTo(o);
        int res1=0;
        if (res == 0) {
            if (gender != null && age != null) {
                res = gender.compareTo(o.gender);
                res1 = age.compareTo(o.age);
                if (res == 0 && res1 == 0)
                    return 0;
                else if (res > 0)
                    return 1;
                else if (res < 0)
                    return -1;
            }
        }
        return res;

    }
}
