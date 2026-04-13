package edu.unc.comp301.decorator.lowkey;

public class Genuinely implements BrainRot {
    BrainRot rot;

    public Genuinely(BrainRot rot){
        this.rot = rot;
    }


    @Override
    public String getDescription() {

        return rot.getDescription() + "enuinely";
    }
}
