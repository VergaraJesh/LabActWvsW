public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void Telekinesis(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Telekinesis (Damage - 30 , Mana Cost - 35)");
        int damagePoints = 30;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Slam(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Slam (Damage - 50 , Mana Cost - 20)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void FireHeal(Character characterName) {
    public void Salve(Character characterName) {
        System.out.println(super.characterName + " Use Fire Heal (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void CauterantInferno(Character enemyCharacter) {
    public void Inferno(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with CauterantInferno (Damage - 50 , Mana Cost - 15)");
                + " with Inferno (Damage - 50 , Mana Cost - 15)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);
    }
}
