package edu.curtin.texteditor.api;

/**
 * Entry point that every plugin implements.
 */
public interface Plugin
{
    /**
     * Called once when the plugin is loaded.
     *
     * @param host The API through which the plugin talks to the editor.
     */
    void start(Host host);
}
