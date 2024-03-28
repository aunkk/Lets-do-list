package javaant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;

public class testJFrame extends JFrame{
    StudyWithMe_P swm;
    StudyWithMeGUI swmG;
    private JPanel p1, p2;

    public testJFrame() {
        swm = new StudyWithMe_P();
        swmG = new StudyWithMeGUI();
        p1 = new JPanel();
        p1.setPreferredSize(new Dimension(400, 400));
        p1.setBackground(Color.GRAY);
        p2 = swm;
        p2 = swmG.pBase;
        /*
        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(400, 400));
        p2.setBackground(Color.WHITE);
        */
        setLayout(new BorderLayout());
        add(p1, BorderLayout.EAST);
        add(p2, BorderLayout.WEST);
        
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new testJFrame();
    }
}
