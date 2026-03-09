package edu.unc.comp301.creational;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
public static void main() {

    PlayerSettings mySettings = PlayerSettings.getInstance();
    PlayerSettings yourSettings = PlayerSettings.getInstance();

   System.out.println(mySettings.getVolume());
    mySettings.setVolume(100);
    System.out.println(mySettings.getVolume());

    System.out.println(yourSettings.getVolume());


    GameMap desert = GameMap.getMap("Desert");
    GameMap desert2 = GameMap.getMap("Desert");

    System.out.println(desert);
    System.out.println(desert2);


}
}
