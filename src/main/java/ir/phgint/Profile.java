package ir.phgint;

import ir.phgint.Enum.Foods;
import ir.phgint.Enum.Habitats;
import ir.phgint.Enum.Pregnant;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Profile implements Cloneable, Serializable {

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

        return (this.foodType == profile.foodType) &&
                (this.name == profile.name) &&
                (this.talk == profile.talk) &&
                (this.habitats == profile.habitats) &&
                (this.birthType == profile.birthType);

    }

    public Profile clone() throws CloneNotSupportedException {
        return (Profile) super.clone();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Profile profile = (Profile) o;
//
//        if (name != null ? !name.equals(profile.name) : profile.name != null) return false;
//        if (foodType != profile.foodType) return false;
//        if (talk != null ? !talk.equals(profile.talk) : profile.talk != null) return false;
//        if (habitats != profile.habitats) return false;
//        return birthType == profile.birthType;
//
//    }
//
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (foodType != null ? foodType.hashCode() : 0);
        result = 31 * result + (talk != null ? talk.hashCode() : 0);
        result = 31 * result + (habitats != null ? habitats.hashCode() : 0);
        result = 31 * result + (birthType != null ? birthType.hashCode() : 0);
        return result;
    }
}
