package edu.curtin.texteditor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * Application entry point.
 */
public class App extends Application
{
    /**
     * Launches the JavaFX application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        TextArea textArea = new TextArea();
        stage.setScene(new Scene(textArea, 800, 600));
        stage.setTitle("Text Editor");
        stage.show();
    }
}
