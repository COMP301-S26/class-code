//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PlayerSettings mySettings = PlayerSettings.getInstance();
    PlayerSettings yourSettings = PlayerSettings.getInstance();

    IO.println(mySettings.getVolume());
    mySettings.setVolume(100);
    IO.println(mySettings.getVolume());

    IO.println(yourSettings.getVolume());


    GameMap desert = GameMap.getMap("Desert");
    GameMap desert2 = GameMap.getMap("Desert");

    IO.println(desert);
    IO.println(desert2);


}

