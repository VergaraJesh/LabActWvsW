public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void Blizzard(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Blizzard(Damage - 30 , Mana Cost - 25)");
        int damagePoints = 30;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Scythe(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Scythe (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Wraith(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Wraith (Damage - 65 , Mana Cost - 35)");
        int damagePoints = 65;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Tango(Character characterName) {
        System.out.println(super.characterName + " Use Salve (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void Slash(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Slash (Damage - 15 , Mana Cost - 10)");
        int damagePoints = 15;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void Curse(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Curse (Damage - 25 , Mana Cost - 15)");
        int damagePoints = 25;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

}