package edu.unc.comp301.creational;

/**
 * A medium difficulty enemy used for {@link EnemyDifficulty#MEDIUM}.
 * <p>
 * The constructor is {@code protected} to discourage direct instantiation
 * from client code and encourage creation through {@link Enemy}.
 * </p>
 */
public class Swarm extends Enemy {

    /**
     * Protected constructor to encourage creation through {@link Enemy}.
     */
    protected Swarm() {
        // intentionally empty
    }

    @Override
    public String getName() {
        return "Swarm";
    }

    @Override
    public int getHitPoints() {
        return 20;
    }

    @Override
    public int getDamage() {
        return 3;
    }
}
