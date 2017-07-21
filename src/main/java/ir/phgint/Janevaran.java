package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

public abstract class Janevaran implements Cloneable, DeepCopyable, ShallowCopyable, Serializable, Comparable<Janevaran> {

    private Profile profile;

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    protected Janevaran(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        profile = Profile.getProfileInstance(name, foods, t, habitats, pregnant);
    }

    protected Janevaran(Janevaran janevaran) {

        profile = Profile.getProfileInstance(janevaran.profile);
    }

    public static Profile getJanevaranInstance(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {

        return Profile.getProfileInstance(name, foods, t, habitats, pregnant);

    }

    public static Profile getJanevaranInstance(Profile janevaran) {

        return Profile.getProfileInstance(janevaran);
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

    public void deepCopyFrom(Janevaran janevaran) {

        this.profile = Janevaran.getJanevaranInstance(janevaran.profile);
    }

    public Janevaran deepCopy() {

        Janevaran.getJanevaranInstance(this.profile);
        return this;
    }

    public void shallowCopyFrom(Janevaran janevaran) {

        this.profile = janevaran.profile;

    }

    public Janevaran shallowCopy() {

        Janevaran j = deepCopy();
        j.profile = this.profile;
        return j;

    }

    //  @Override
    public int compareTo(Janevaran o) {
        String currentobj = profile.getName().toUpperCase();
        return currentobj.compareTo(o.getProfile().getName().toUpperCase());
    }
}
