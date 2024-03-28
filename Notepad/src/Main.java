//this is for test JInternalframe
import javax.swing.*;
public class Main extends JFrame{
    private JDesktopPane dframe;
    private Notepad note;
    public Main(){
        dframe = new JDesktopPane();
        note = new Notepad();
        dframe.add(note);
        add(dframe);
        
        note.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        note.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        new Main();
    }
}
