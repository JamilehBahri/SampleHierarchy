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

    protected static Janevaran getJanevaranInstance(ObjectType objectType, Profile profile) {
        if (objectType == ObjectType.ANIMALS)
            return Animals.getAnimalsInstance(profile);
        if (objectType == ObjectType.HUMANS)
            return Humans.getHumansInstance(profile);
        if (objectType == ObjectType.BIRDS)
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
        return "Janevaran{" +
                "profile=" + profile +
                '}';
    }

    public void deepCopyFrom(Janevaran janevaran) throws CloneNotSupportedException {

        this.profile = janevaran.clone().profile;
    }

    public Janevaran deepCopy() throws CloneNotSupportedException {

        return this.clone();
    }

    public void shallowCopyFrom(Janevaran janevaran) {

        this.profile = janevaran.profile;
    }

    public Janevaran shallowCopy() throws CloneNotSupportedException {

        Janevaran j = this.clone();
        j.profile = this.profile;
        return j;
    }



    public int compareTo(Janevaran o) {
      int res= profile.compareTo(o.profile);
       if(res==0)
         return 0;
       else if(res>0)
          return 1;
       else if(res<0)
          return -1;

        return 0;
    }
}
