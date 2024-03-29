package report;


public class Energize {

    private final int amount;
    private final Type type;

    public Energize(int amount, Type type) {
        this.amount = amount;
        this.type = type;
    }

    public enum Type {
        HEALTH,
        MANA,
        RAGE,
        FOCUS,
        ENERGY,
        PET_HAPPINESS,
        RUNES,
        RUNIC_POWER,
        SOUL_SHARD,
        ECLIPSE, //solar is negative, lunar is positive
        HOLY_POWER,
        ATRAMEDES_SOUND,
    }

}
