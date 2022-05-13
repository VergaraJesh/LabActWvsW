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
        Warlock Dazzle = new Warlock("Dazzle");
        Morphling.Blizzard(Dazzle);
        Morphling.Scythe(Dazzle);
        Dazzle.Telekinesis(Morphling);
        Morphling.Wraith(Dazzle);
        Dazzle.Slam(Morphling);
        Dazzle.Salve(Dazzle);
        Morphling.Tango(Morphling);
        Morphling.Slash(Thamuz);
        Thamuz.CauterantInferno(Morphling);
        Morphling.Curse(Thamuz);
        Morphling.Slash(Dazzle);
        Dazzle.Inferno(Morphling);
        Morphling.Curse(Dazzle);

    }
}