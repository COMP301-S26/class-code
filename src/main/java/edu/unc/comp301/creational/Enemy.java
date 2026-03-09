package edu.unc.comp301.creational;

/**
 * Represents an enemy in the game and also provides a factory method
 * for creating enemies of different difficulty levels.
 *
 * <p>This class serves two roles:</p>
 * <ul>
 *   <li>Defines the common interface for all enemy types.</li>
 *   <li>Provides a static factory method {@link #spawn(EnemyDifficulty)}
 *       that creates the appropriate enemy subclass.</li>
 * </ul>
 *
 * <p>Concrete implementations such as {@link Grunt}, {@link Swarm}, and
 * {@link Boss} extend this class and implement the required behavior.</p>
 *
 * <p>The static factory method centralizes enemy creation so that client
 * code does not directly instantiate specific subclasses.</p>
 */
public abstract class Enemy {

    /**
     * Protected constructor prevents external code from directly creating
     * generic Enemy objects. Only subclasses can call this constructor.
     */
    protected Enemy() {
        // intentionally empty
    }

    /**
     * Factory method that creates an enemy appropriate for the given difficulty.
     *
     * <p>This method selects and instantiates the correct subclass based on the
     * provided {@link EnemyDifficulty}.</p>
     *
     * @param difficulty the desired difficulty level (must not be null)
     * @return a new {@link Enemy} instance matching the requested difficulty
     * @throws IllegalArgumentException if difficulty is null
     */
    public static Enemy spawn(EnemyDifficulty difficulty) {
        if (difficulty == null) {
            throw new IllegalArgumentException("difficulty cannot be null");
        }

        return switch (difficulty) {
            case EASY -> new Grunt();
            case MEDIUM -> new Swarm();
            case HARD -> new Boss();
        };
    }

    /**
     * Returns the display name of the enemy type.
     *
     * @return enemy name
     */
    public abstract String getName();

    /**
     * Returns the enemy's hit points.
     *
     * @return hit point value
     */
    public abstract int getHitPoints();

    /**
     * Returns the damage this enemy deals per attack.
     *
     * @return damage value
     */
    public abstract int getDamage();
}