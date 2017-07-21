package ir.phgint;

import ir.phgint.Enum.Foods;
import ir.phgint.Enum.Habitats;
import ir.phgint.Enum.Pregnant;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Profile implements Cloneable, Serializable {

    private String name;
    private Foods foodType;
    private String talk;
    private Habitats habitats;
    private Pregnant birthType;

    public StringBuilder stringBuilderProfile = new StringBuilder(200);

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

    public static Profile getProfileInstance(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        return new Profile(name, foods, t, habitats, pregnant);
    }

    public static Profile getProfileInstance(Profile profile) {
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

        return(this.name == profile.name) &&
                (this.foodType == profile.foodType) &&
                (this.talk == profile.talk) &&
                (this.habitats == profile.habitats) &&
                (this.birthType == profile.birthType);

    }

    public Profile clone() throws CloneNotSupportedException {
        Profile profile = (Profile) super.clone();

        profile.name = name;
        profile.foodType = foodType;
        profile.talk = talk;
        profile.habitats = habitats;
        profile.birthType = birthType;

        return profile;

    }

    @Override
    public String toString() {

        stringBuilderProfile.append("name=");
        stringBuilderProfile.append(name);
        stringBuilderProfile.append("foodType=");
        stringBuilderProfile.append(foodType);
        stringBuilderProfile.append("talk=");
        stringBuilderProfile.append(talk);
        stringBuilderProfile.append("habitats=");
        stringBuilderProfile.append(habitats);
        stringBuilderProfile.append("birthType=");
        stringBuilderProfile.append(birthType);


        return stringBuilderProfile.toString();

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

//ok
    public int compareTo(Profile o) {
        if (name.compareTo(o.name) > 0)
            return 1;
        else if (name.compareTo(o.name) < 0)
            return -1;
        else {
            if ((foodType.compareTo(o.foodType) == 0 && talk.compareTo(o.talk) == 0 && habitats.compareTo(o.habitats) == 0 && birthType.compareTo(o.birthType) == 0))
                return 0;
            else if (foodType.compareTo(o.foodType) == 0 && habitats.compareTo(o.habitats) == 0 && talk.compareTo(o.talk) == 0) {
                if (birthType.compareTo(o.birthType) > 0)
                    return 1;
                if (birthType.compareTo(o.birthType) < 0)
                    return -1;
            } else if (foodType.compareTo(o.foodType) == 0 && habitats.compareTo(o.habitats) == 0) {
                if (talk.compareTo(o.talk) > 0)
                    return 1;
                if (talk.compareTo(o.talk) < 0)
                    return -1;
            } else if (foodType.compareTo(o.foodType) == 0) {
                if (habitats.compareTo(o.habitats) > 0)
                    return 1;
                if (habitats.compareTo(o.habitats) < 0)
                    return -1;
            } else  {
                if (foodType.compareTo(o.foodType) > 0)
                    return 1;
                if (foodType.compareTo(o.foodType) < 0)
                    return -1;
            }
            return 0;
        }


    }
}
