package edu.unc.comp301.decorator.lowkey;

public class TTT implements BrainRot {
    BrainRot rot;

    public TTT(BrainRot rot){
        this.rot = rot;
    }


    @Override
    public String getDescription() {
        return rot.getDescription() + "tungtungtungsahur";
    }
}
