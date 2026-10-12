package edu.curtin.texteditor.api;

/**
 * GUI-independent API offered to plugins and scripts.
 */
public interface Host
{
    /**
     * Returns the full text being edited.
     *
     * @return The editor text.
     */
    String getText();
}
