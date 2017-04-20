package prj5;

public class Input {
    /**
     * Runs the program
     * @param args the person file and song file in that order
     */
    public static void main(String[] args) {
        PersonScanner personScanner = new PersonScanner(args[0]);
        SongScanner songScanner = new SongScanner(args[1]);
        GUIDisplayWindow gui;
        gui = new GUIDisplayWindow();
    }
}
