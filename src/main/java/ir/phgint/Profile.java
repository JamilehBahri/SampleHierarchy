package ir.phgint;

import ir.phgint.Enum.Foods;
import ir.phgint.Enum.Habitats;
import ir.phgint.Enum.Pregnant;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Profile implements Cloneable , Serializable {

    private String name;
    private Foods foodType;
    private String talk;
    private Habitats habitats;
    private Pregnant birthType;

    public Profile(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        this.name = name;
        this.foodType = foods;
        this.talk = t;
        this.habitats = habitats;
        this.birthType = pregnant;
    }


    //Copy Constractor
    public Profile(Profile profile) {
        name = profile.name;
        foodType = profile.foodType;
        talk = profile.talk;
        habitats = profile.habitats;
        birthType = profile.birthType;
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
           if(  (profile==null)||
                !(profile instanceof Profile) )
               return false;
     //   return super.equals(profile) &&
       return       (this.foodType == profile.foodType)&&
                    (this.name == profile.name )&&
                    (this.talk == profile.talk) &&
//                    (this.talk == null) ? (profile.talk != null) : !this.talk.equals(profile.talk) &&
                    (this.habitats == profile.habitats) &&
                    (this.birthType == profile.birthType) ;

    }

    public Profile clone() throws CloneNotSupportedException {
        return (Profile) super.clone();
    }


}
