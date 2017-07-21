package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

public class Mammals extends Janevaran implements Cloneable, Serializable, Comparable<Janevaran> {

    private boolean hasHair;
    private boolean hasBackbone;


    protected Mammals(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        super(name, foods, t, habitats, pregnant);
        this.hasHair = hasHair;
        this.hasBackbone = hasBackbone;
    }

    protected Mammals(Mammals mammals) {
        super(mammals);
        hasHair = mammals.hasHair;
        hasBackbone = mammals.hasBackbone;
    }

    public static Mammals getMammalsInstance(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        return new Mammals(name, foods, t, habitats, pregnant, hasHair, hasBackbone);
    }


    public void setHasHair(boolean hair) {
        this.hasHair = hair;
    }

    public boolean getHasHair() {
        return hasHair;
    }

    public void setHasBackbone(boolean backbone) {
        this.hasBackbone = backbone;
    }

    public boolean getHasBackbone() {
        return hasBackbone;
    }

    public boolean equals(Mammals mammals) {

        if (mammals == this)
            return true;
        if (mammals == null)
            return false;
        return super.equals(mammals) && (this.hasHair == mammals.hasHair) && (this.hasBackbone == mammals.hasBackbone);
    }

    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.hasHair == true ? 1 : 0);
        hash = 31 * hash + (this.hasBackbone == true ? 1 : 0);
        return hash;
    }

    public Mammals clone() throws CloneNotSupportedException {
        return (Mammals) super.clone();
    }

    @Override
    public int compareTo(Janevaran o) {

        return super.compareTo(o);
    }

}
