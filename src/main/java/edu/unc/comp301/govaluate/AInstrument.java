package edu.unc.comp301.govaluate;


public abstract class AInstrument implements Playable {

    private String name;
    private String material;

    public AInstrument(String name, String material){
        this.name = name;
        this.material = material;
    }

    public String getName(){
        return name;
    }

    public String getMaterial(){
        return material;
    }


//    @Override
//    public String toString() {
//        return "The instrument " + getName() + " is made of " + getMaterial();
//    }
}
