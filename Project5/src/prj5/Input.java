package prj5;

public class Input {
    /**
     * Runs the program
     * @param args the person file and song file in that order
     */
    public static void main(String[] args) {
        GUIDisplayWindow gui;
        gui = new GUIDisplayWindow(args[0], args[1]);
    }
}
