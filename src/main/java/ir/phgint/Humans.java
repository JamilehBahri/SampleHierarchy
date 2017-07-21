package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

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

    public static Humans getHumansInstance(Profile profile) {
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

        stringBuilder.append(super.toString());
        stringBuilder.append("Humans{");
        stringBuilder.append("age=");
        stringBuilder.append(age);
        stringBuilder.append("gender=");
        stringBuilder.append(gender);
        stringBuilder.append("}");
        return stringBuilder.toString();
//        return "Humans{" +
//                "age=" + age +
//                ", gender=" + gender +
//                '}';
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

    public void deepCopyFrom(Humans humans) {

        super.deepCopyFrom(humans);
        this.gender = humans.gender;
        this.age = humans.age;

    }

    public Humans clone() throws CloneNotSupportedException {
        Humans hh = (Humans) super.clone();
        hh.gender = gender;
        hh.age = age;
        return hh;
    }

    public Humans deepCopy() {

        Humans humans = (Humans) super.deepCopy();
        humans.gender = this.gender;
        humans.age = this.age;
        return humans;
//        return new Humans(this);
    }

    public void shallowCopyFrom(Humans humans) {

        super.shallowCopyFrom(humans);
        this.gender = humans.gender;
        this.age = humans.age;
    }

    public Humans shallowCopy() {

        Humans h = (Humans) super.shallowCopy();
        h.gender = this.gender;
        h.age = this.age;
        return h;
    }

    public int compareTo(Humans o) {
        int res = super.compareTo(o);
        if (res == 0) {
            if (gender != null) {
                if (gender.compareTo(o.gender) > 0)
                    return 1;
                else if (gender.compareTo(o.gender) < 0)
                    return -1;
                else {
                    if (age != null)
                        if (age.compareTo(o.age) > 0)
                            return 1;
                        else if (age.compareTo(o.age) < 0)
                            return -1;
                        else return 0;
                }
            }
        }
        return res;
    }
}

