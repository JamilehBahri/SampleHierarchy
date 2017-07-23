package ir.phgint;

import ir.phgint.Janevaran.*;

public class ProfileBuilder {

    private Profile profile;
    private Birds birds;

//    public static ProfileBuilder getProfileInstance(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
//        return new ProfileBuilder(name, foods, t, habitats, pregnant);
//    }

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
        return p;
    }

    private ProfileBuilder(Profile builder) {

        profile = builder;
//        profile.setName( builder.getName());
//        profile.setFoodType( builder.getFoodType());
//        profile.setTalk( builder.getTalk());
//        profile.setHabitats( builder.getHabitats());
//        profile.setPregnant( builder.getPregnant());

    }
//    private ProfileBuilder(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
//
//        profile.setName(name);
//        profile.setFoodType(foods);
//        profile.setTalk(t);
//        profile.setHabitats(habitats);
//        profile.setPregnant(pregnant);
//    }



}
