package edu.unc.comp301.creational;

/**
 * A basic enemy used for {@link EnemyDifficulty#EASY}.
 * <p>
 * The constructor is {@code protected} to discourage direct instantiation
 * from client code and encourage creation through {@link Enemy}.
 * </p>
 */
public class Grunt extends Enemy {

    /**
     * Protected constructor to encourage creation through {@link Enemy}.
     */
    protected Grunt() {
        // intentionally empty
    }

    @Override
    public String getName() {
        return "Grunt";
    }

    @Override
    public int getHitPoints() {
        return 30;
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
