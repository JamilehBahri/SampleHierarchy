package ir.phgint;


import com.sun.org.apache.bcel.internal.generic.ObjectType;

import java.io.Serializable;


public abstract class Janevaran implements Cloneable, DeepCopyable, ShallowCopyable, Serializable, Comparable<Janevaran> {

    private Profile profile;


    protected Janevaran(Profile profiles) {
        profile = Profile.getProfileInstance(profiles);
    }

    protected Janevaran(String name, F.Foods foods, String t, H.Habitats habitats, P.Pregnant pregnant) {
        profile = Profile.getProfileInstance(name, foods, t, habitats, pregnant);
    }

    protected Janevaran(Janevaran janevaran) {
        profile = Profile.getProfileInstance(janevaran.profile);
    }

    public static Janevaran getJanevaranInstance(ObjectTypes.Type objectType, Profile profile) {
        if (objectType == ObjectTypes.Type.ANIMALS)
            return Animals.getAnimalsInstance(profile);
        else if (objectType == ObjectTypes.Type.HUMANS)
            return Humans.getHumansInstance(profile);
        else if (objectType == ObjectTypes.Type.BIRDS)
            return Birds.getBirdsInstance(profile);

        return null;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }


    public boolean equals(Janevaran janevaran) {
        if (janevaran == this)
            return true;
        if (janevaran == null)
            return false;
        return profile.equals(profile);
    }

    public Janevaran clone() throws CloneNotSupportedException {

        profile.clone();
        return (Janevaran) super.clone();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (null == profile ? 0 : profile.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Janevaran{");
        sb.append("profile=").append(profile.toString());
        sb.append('}');
        return sb.toString();
    }

    public void deepCopyFrom(Janevaran janevaran) {

        try {
            this.profile = janevaran.profile.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Janevaran deepCopy() {

        try {
            return this.clone();
            } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void shallowCopyFrom(Janevaran janevaran) {

        this.profile = janevaran.profile;
    }

    public Janevaran shallowCopy() {

        Janevaran j = null;
        try {
            j = this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        j.profile = this.profile;
        return j;
    }

    public int compareTo(Janevaran o) {
        return profile.compareTo(o.profile);

    }


    //inner class
    public static class A{
        enum Ages {
            Baby,
            Child,
            Teenager,
            Young,
            Mature,
            Middleage,
            Old

        }
    }
    public static class AB{
        enum AnimalBehavior {
            Wild,
            Domestic,
            Unknown
        }
    }
    public static class F{
        enum Foods {
            Vegetarian,
            Herbivorous,
            Carnivorous,
            Unknown
        }
    }

    public static class G{
        enum Gender {
            Male,
            Female
        }
    }
    public static class H{
        enum Habitats {
            Dry,
            Water,
            Beach,
            Jungle,
            Mountain,
            Lake

        }
    }
    public static class ObjectTypes{
        enum Type {
            ANIMALS,HUMANS,BIRDS
        }
    }
    public static class P{
        enum  Pregnant {
            Viviparous,// bacheza
            Oviparous,//tokhmghozar
            Marsupial//kisedar
        }

    }

    public static class Profile implements Cloneable, Serializable {

        public static class ProfileBuilder {
            private String name;
            private F.Foods foodType;
            private String talk;
            private H.Habitats habitats;
            private P.Pregnant birthType;

            public ProfileBuilder name(String n) {
                name = n;
                return this;
            }
            public ProfileBuilder foodType(F.Foods f) {
                foodType = f;
                return this;
            }
            public ProfileBuilder talk(String t) {
                talk = t;
                return this;
            }
            public ProfileBuilder habitats(H.Habitats h) {
                habitats = h;
                return this;
            }
            public ProfileBuilder birthType(P.Pregnant p) {
                birthType = p;
                return this;
            }
            public Profile build() {
                return new Profile(this);
            }



        }

        private String name;
        private F.Foods foodType;
        private String talk;
        private H.Habitats habitats;
        private P.Pregnant birthType;



        private Profile(ProfileBuilder builder) {
            name = builder.name;
            foodType = builder.foodType;
            talk = builder.talk;
            habitats = builder.habitats;
            birthType = builder.birthType;

        }

        private Profile(String name, F.Foods foods, String t, H.Habitats habitats, P.Pregnant pregnant) {
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

        public static Profile getProfileInstance(String name, F.Foods foods, String t, H.Habitats habitats, P.Pregnant pregnant) {
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

        public void setFoodType(F.Foods foodType) {
            this.foodType = foodType;
        }

        public F.Foods getFoodType() {
            return foodType;
        }

        public void setTalk(String talk) {
            this.talk = talk;
        }

        public String getTalk() {
            return talk;
        }

        public void setHabitats(H.Habitats habitats) {
            this.habitats = habitats;
        }

        public H.Habitats getHabitats() {
            return habitats;
        }

        public void setPregnant(P.Pregnant pregnant) {
            this.birthType = pregnant;
        }

        public P.Pregnant getPregnant() {
            return birthType;
        }

        public boolean equals(Profile profile) {

            if (profile == this)
                return true;
            if (profile == null)
                return false;

            return (this.name == profile.name) &&
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
            final StringBuilder sb = new StringBuilder();
            sb.append("name='").append(name).append('\'');
            sb.append(", foodType=").append(foodType);
            sb.append(", talk='").append(talk).append('\'');
            sb.append(", habitats=").append(habitats);
            sb.append(", birthType=").append(birthType);

            return sb.toString();
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
                } else {
                    if (foodType.compareTo(o.foodType) > 0)
                        return 1;
                    if (foodType.compareTo(o.foodType) < 0)
                        return -1;
                }
                return 0;
            }


        }
    }

}
