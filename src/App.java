public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        System.out.println("");

        Wizard Morphling = new Wizard("Morphling");
        Warlock Thamuz = new Warlock("");
        Morphling.Blizzard(Thamuz);
        Morphling.Scythe(Thamuz);
        Thamuz.Telekinesis(Morphling);
        Morphling.Wraith(Thamuz);
        Thamuz.Slam(Morphling);
        Thamuz.FireHeal(Thamuz);
        Morphling.Tango(Morphling);
        Morphling.Slash(Thamuz);
        Thamuz.CauterantInferno(Morphling);
        Morphling.Curse(Thamuz);

    }
}