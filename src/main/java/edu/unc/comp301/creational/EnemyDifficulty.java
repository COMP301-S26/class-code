package edu.unc.comp301.creational;

/**
 * Enumerated difficulty levels for enemies.
 * <p>
 * Used by {@link Enemy#spawn(EnemyDifficulty)} to decide which concrete enemy
 * type should be instantiated.
 * </p>
 */
public enum EnemyDifficulty {
    /** Beginner-friendly enemies. */
    EASY,

    /** Standard difficulty enemies. */
    MEDIUM,

    /** High difficulty enemies. */
    HARD
}
