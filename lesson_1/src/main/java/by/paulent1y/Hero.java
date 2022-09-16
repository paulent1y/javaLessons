package by.paulent1y;

public class Hero extends Character{
    private String name;
    public Hero(String _name, int _hp, int _ac, int _hitModifier, int _attackDice, int _attackMod) {
        super(_hp,_ac,_hitModifier,_attackDice,_attackMod);
        name = _name;
    }

    @Override
    public String toString() {
        return "".format("%s with %d hp", name, hp);
    }
}
