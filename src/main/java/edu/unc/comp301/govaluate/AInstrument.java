package edu.unc.comp301.govaluate;


public abstract class AInstrument implements Playable {

    /**
     * These instance variables are necessary for saving state information
     */
    private String name;
    private String material;


    /**
     * Contructor for creating AInstrument.
     *
     * @param name - string representing the type of instrument (e.g. guitar).
     * @param material - type of material it is made from (e.g. rosewood).
     */
    public AInstrument(String name, String material){
        this.name = name;
        this.material = material;
    }


    /**
     * Standard getter for name
     *
     * @return the name of hte instrument
     */
    public String getName(){
        return name;
    }

    /**
     * Standard getter for material
     *
     * @return the material the instrument is made from.
     */
    public String getMaterial(){
        return material;
    }


//    @Override
//    public String toString() {
//        return "The instrument " + getName() + " is made of " + getMaterial();
//    }
}
