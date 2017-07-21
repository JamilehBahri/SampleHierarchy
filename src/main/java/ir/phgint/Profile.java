package ir.phgint;

import ir.phgint.Enum.Foods;
import ir.phgint.Enum.Habitats;
import ir.phgint.Enum.Pregnant;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Profile implements Cloneable, Serializable{

    private String name;
    private Foods foodType;
    private String talk;
    private Habitats habitats;
    private Pregnant birthType;

    private Profile(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        this.name = name;
        this.foodType = foods;
        this.talk = t;
        this.habitats = habitats;
        this.birthType = pregnant;
    }

    private Profile(Profile profile) {
        name = profile.name;
        foodType = profile.foodType;
        talk = profile.talk;
        habitats = profile.habitats;
        birthType = profile.birthType;
    }

    protected static Profile getProfileInstance(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        return new Profile(name, foods, t, habitats, pregnant);
    }

    protected static Profile getProfileInstance(Profile profile) {
        return new Profile(profile);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFoodType(Foods foodType) {
        this.foodType = foodType;
    }

    public Foods getFoodType() {
        return foodType;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public String getTalk() {
        return talk;
    }

    public void setHabitats(Habitats habitats) {
        this.habitats = habitats;
    }

    public Habitats getHabitats() {
        return habitats;
    }

    public void setPregnant(Pregnant pregnant) {
        this.birthType = pregnant;
    }

    public Pregnant getPregnant() {
        return birthType;
    }


    public boolean equals(Profile profile) {

        if (profile == this)
            return true;
        if (profile == null)
            return false;

        return (this.foodType == profile.foodType) &&
                (this.name == profile.name) &&
                (this.talk == profile.talk) &&
                (this.habitats == profile.habitats) &&
                (this.birthType == profile.birthType);

    }

    public Profile clone() throws CloneNotSupportedException {
        return (Profile) super.clone();
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", foodType=" + foodType +
                ", talk='" + talk + '\'' +
                ", habitats=" + habitats +
                ", birthType=" + birthType +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (foodType != null ? foodType.hashCode() : 0);
        result = 31 * result + (talk != null ? talk.hashCode() : 0);
        result = 31 * result + (habitats != null ? habitats.hashCode() : 0);
        result = 31 * result + (birthType != null ? birthType.hashCode() : 0);
        return result;
    }


    public int compareTo(Profile o) {
        if (name.compareTo(o.name) > 0)
            return 1;
        else if (name.compareTo(o.name) < 0)
            return -1;
        else if (name.compareTo(o.name) == 0 && foodType.compareTo(o.foodType) == 0 &&
                talk.compareTo(o.talk) == 0 && habitats.compareTo(o.habitats) == 0 && birthType.compareTo(o.birthType) == 0)
            return 0;
        else if (name.compareTo(o.name) == 0 && foodType.compareTo(o.foodType) == 0 &&
                habitats.compareTo(o.habitats) == 0 && talk.compareTo(o.talk) == 0) {
            if (birthType.compareTo(o.birthType) > 0)
                return 1;
            if (birthType.compareTo(o.birthType) < 0)
                return -1;
        } else if (name.compareTo(o.name) == 0 && foodType.compareTo(o.foodType) == 0 && habitats.compareTo(o.habitats) == 0) {
            if (talk.compareTo(o.talk) > 0)
                return 1;
            if (talk.compareTo(o.talk) < 0)
                return -1;
        } else if (name.compareTo(o.name) == 0 && foodType.compareTo(o.foodType) == 0) {
            if (habitats.compareTo(o.habitats) > 0)
                return 1;
            if (habitats.compareTo(o.habitats) < 0)
                return -1;
        } else if (name.compareTo(o.name) == 0) {
            if (foodType.compareTo(o.foodType) > 0)
                return 1;
            if (foodType.compareTo(o.foodType) < 0)
                return -1;
        }
        return 0;

    }

//    public int compareTo(Profile[] o) {
//
//      List<Profile> list= Arrays.asList(o);
//        Collections.sort(list);
//
//    }
}
