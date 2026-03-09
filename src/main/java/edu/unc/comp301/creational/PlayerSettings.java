package edu.unc.comp301.creational;

/**
 * A Singleton that stores basic player settings for the game.
 *
 * <p>This class ensures that there is exactly one settings object
 * shared across the entire application. Any system that needs to
 * read or modify settings accesses the same instance via
 * {@link #getInstance()}.</p>
 *
 * <p>The settings currently stored are:</p>
 * <ul>
 *   <li>Master volume (0–100)</li>
 *   <li>Subtitles enabled/disabled</li>
 * </ul>
 */
public class PlayerSettings {

    /** The single instance of PlayerSettings. */
    private static PlayerSettings instance;

    /** Master audio volume (0–100). */
    private int volume;

    /** Whether subtitles are enabled. */
    private boolean subtitlesEnabled;

    /**
     * Private constructor prevents external instantiation.
     * Initializes default settings.
     */
    private PlayerSettings() {
        this.volume = 75;
        this.subtitlesEnabled = true;
    }

    /**
     * Returns the single instance of {@code PlayerSettings}.
     * Uses lazy initialization to create the instance when it
     * is first requested.
     *
     * @return the singleton instance
     */
    public static PlayerSettings getInstance() {
        if (instance == null) {
            instance = new PlayerSettings();
        }
        return instance;
    }

    /**
     * Returns the current volume.
     *
     * @return volume value (0–100)
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the master volume. Values outside the range
     * 0–100 are clamped to the nearest valid value.
     *
     * @param volume desired volume level
     */
    public void setVolume(int volume) {
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    /**
     * Returns whether subtitles are enabled.
     *
     * @return true if subtitles are enabled, false otherwise
     */
    public boolean areSubtitlesEnabled() {
        return subtitlesEnabled;
    }

    /**
     * Enables or disables subtitles.
     *
     * @param enabled true to enable subtitles, false to disable
     */
    public void setSubtitlesEnabled(boolean enabled) {
        this.subtitlesEnabled = enabled;
    }
}
