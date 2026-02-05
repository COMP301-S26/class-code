package edu.unc.comp301.govaluate;


public class Guitar extends AInstrument{
    private int numOfStrings;

    public Guitar(String name, String material, int numOfStrings) {
        super(name, material);
        this.numOfStrings = numOfStrings;
    }

    @Override
    public String play() {
        return "Strumming the guitar!";
    }

//    @Override
//    public String toString() {
//        return super.toString() + " and has " + numOfStrings + " strings!";
//    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Guitar){
                Guitar guitar = (Guitar)other;
                return this.numOfStrings == guitar.numOfStrings;
        }
        return false;
    }


    public static void main(String[] args){
     Guitar myGuitar = new Guitar("My Guitar", "Rosewood", 6);
     Guitar yourGuitar = new Guitar("Your Guitar", "Rosewood", 6);

     System.out.println(myGuitar);
     System.out.println(yourGuitar);
     System.out.println(myGuitar.equals(yourGuitar));
    }
}
