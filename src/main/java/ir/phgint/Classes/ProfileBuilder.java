package ir.phgint.Classes;

import ir.phgint.Classes.Janevaran.*;
import ir.phgint.StringLengthException;

public class ProfileBuilder {

    private Profile profile;


    public static ProfileBuilder getProfileInstance() {
        return new ProfileBuilder(null);
    }

    public static ProfileBuilder getProfileInstance(Profile profile) {
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

    public Profile build() {

        if (profile.getName() == null) throw new NullPointerException("ProfileName Is Null");
        if (profile.getFoodType() == null) throw new NullPointerException("ProfileFood Is Null");
        if (profile.getTalk() == null) throw new NullPointerException("ProfileTalk Is Null");
        if (profile.getHabitats() == null) throw new NullPointerException("ProfileHabitats Is Null");
        if (profile.getPregnant() == null) throw new NullPointerException("ProfilePregnant Is Null");
        if (profile.getName().length()>20) throw  new StringLengthException("Name is longer than 20");
        if (profile.getTalk().length()>20) throw  new StringLengthException("Talk is longer than 20");
        return profile;
    }

    private ProfileBuilder(Profile pb) {

        if (pb != null) {

            profile = pb;
        } else {
            profile = Profile.getProfileInstance();
        }
    }


}
