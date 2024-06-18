package model;

import view.AppFrame;

/**
 * The main class to launch the application.
 */
public class App {
    private static AppFrame appContainer;

    /**
     * The main method to start the application.
     *
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        appContainer = new AppFrame();
        appContainer.setVisible(true);
    }
}
