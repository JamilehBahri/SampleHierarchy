package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Janevaran implements Cloneable, DeepCopyable, ShallowCopyable, Serializable, Comparable<Janevaran>  {


    private Profile profile;

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }


    public Janevaran(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        profile = new Profile(name, foods, t, habitats, pregnant);

    }


    //Copy Constractor
    public Janevaran(Janevaran janevaran) {

        profile = new Profile(janevaran.profile);
    }


    public boolean equals(Janevaran janevaran) {
        if (janevaran == this)
            return true;
        if((janevaran==null)||
                !(janevaran instanceof Janevaran) )
            return false;
        return profile.equals(janevaran.profile);
    }

    public Janevaran clone() throws CloneNotSupportedException {
        profile.clone();
        return (Janevaran) super.clone();

    }

    private volatile int hashCode;
    @Override
    public int hashCode() {
        int hash = hashCode;
        if (hash == 0) {
            hash = 17;
            hash = 31 * hash +(null == profile ? 0 : profile.hashCode()); ;
            hashCode = hash;
        }
        return hash;
    }



    public void deepCopyFrom(Janevaran janevaran) {


    }

    public Janevaran deepCopy() {

        return null;
    }

    public void shallowCopyFrom(Janevaran janevaran) {

    }

    public Janevaran shallowCopy() {

        return null;
    }

  //  @Override
    public int compareTo(Janevaran o) {
        String currentobj = profile.getName().toUpperCase();
        return currentobj.compareTo(o.getProfile().getName().toUpperCase());
    }
}
