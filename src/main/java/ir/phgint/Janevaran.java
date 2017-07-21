package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;


public abstract class Janevaran implements Cloneable, DeepCopyable, ShallowCopyable, Serializable, Comparable<Janevaran> {

    private Profile profile;


    protected Janevaran(Profile profiles) {
        profile = Profile.getProfileInstance(profiles);
    }

    protected Janevaran(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        profile = Profile.getProfileInstance(name, foods, t, habitats, pregnant);
    }

    protected Janevaran(Janevaran janevaran) {
        profile = Profile.getProfileInstance(janevaran.profile);
    }

    public static Janevaran getJanevaranInstance(ObjectType objectType, Profile profile) {
        if (objectType == ObjectType.ANIMALS)
            return Animals.getAnimalsInstance(profile);
        else if (objectType == ObjectType.HUMANS)
            return Humans.getHumansInstance(profile);
        else if (objectType == ObjectType.BIRDS)
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
}
