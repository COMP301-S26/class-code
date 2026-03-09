package edu.unc.comp301.creational;

/**
 * A high difficulty enemy used for {@link EnemyDifficulty#HARD}.
 * <p>
 * The constructor is {@code protected} to discourage direct instantiation
 * from client code and encourage creation through {@link Enemy}.
 * </p>
 */
public class Boss implements Enemy {

    /**
     * Protected constructor to encourage creation through {@link Enemy}.
     */
    protected Boss() {
        // intentionally empty
    }

    @Override
    public String getName() {
        return "Boss";
    }

    @Override
    public int getHitPoints() {
        return 250;
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
