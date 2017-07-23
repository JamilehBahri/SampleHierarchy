package ir.phgint;

import ir.phgint.Janevaran.*;

public class ProfileBuilder {

    private Profile profile;


    public static ProfileBuilder getProfileInstance() {
        return new ProfileBuilder(null);
    }

    public static ProfileBuilder getProfileInstance(Profile  profile) {
        return new ProfileBuilder(profile);
    }

    public ProfileBuilder name(String n) {
        profile.setName(n);
        return this;
    }

    public ProfileBuilder foodType(Foods f) {
       profile.setFoodType(f);
        return this;
    }

    public ProfileBuilder talk(String t) {
       profile.setTalk(t);
        return this;
    }

    public ProfileBuilder habitats(Habitats h) {
       profile.setHabitats(h);
        return this;
    }

    public ProfileBuilder birthType(Pregnant p) {
        profile.setPregnant(p);
        return this;
    }

    public  Profile build() {
        Profile p = Profile.getProfileInstance(profile);
        if (p == null) throw new NullPointerException("Profile Is Null");
        return p;
    }


    private ProfileBuilder(Profile pb) {

        if (pb != null)
        profile = pb;
        else
        {
            name(profile.getName());
            foodType(profile.getFoodType());
            talk(profile.getTalk());
            habitats(profile.getHabitats());
            birthType(profile.getPregnant());
        }

    }




}
