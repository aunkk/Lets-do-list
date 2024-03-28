import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Notepad extends JInternalFrame implements ActionListener, MouseListener, MouseMotionListener{
    private Point fPoint;
    private Point sPoint;
    private String drawMode;
    private JMenuBar mb;
    private JMenu file, edit, draw;
    private JMenuItem addImage, save, newfile, lineD, rectD, freeH;
    private JScrollPane pane;
    private JScrollBar bar;
    private JTextPane note;
    public Notepad(){
        fPoint = new Point(0,0);
        sPoint = new Point(0,0);
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        draw = new JMenu("Draw");
        addImage = new JMenuItem("Add Images");
        lineD = new JMenuItem("Lines");
        rectD = new JMenuItem("Rectangle");
        freeH = new JMenuItem("Free Hand");
        note = new JTextPane();
        pane = new JScrollPane(note, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        note.setFont(new Font("TH Chakra Petch 23", Font.PLAIN,20));
        this.setPreferredSize(new Dimension(500, 600));
        this.setResizable(true);
        
        addImage.addActionListener(this);
        draw.addActionListener(this);
        note.addMouseListener(this);
        note.addMouseMotionListener(this);
        lineD.setActionCommand("lineD");
        rectD.setActionCommand("rectD");
        freeH.setActionCommand("freeH");
        
        mb.add(file);
        mb.add(edit);
        edit.add(addImage);
        edit.add(draw);
        draw.add(lineD);
        draw.add(rectD);
        draw.add(freeH);

        add(pane);
        add(mb, BorderLayout.NORTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent me){
        fPoint.setLocation(0, 0);
        sPoint.setLocation(0, 0);
        fPoint.setLocation(me.getX(),me.getY());
        System.out.println("Pressed at "+fPoint.getLocation());
    }
    @Override
    public void mouseReleased(MouseEvent me){
        sPoint.setLocation(me.getX(),me.getY());
        repaint();
        System.out.println("Released at "+sPoint.getLocation());
    }
    @Override
    public void mouseDragged(MouseEvent me){}
    @Override
    public void mouseMoved(MouseEvent me){}
    @Override
    public void mouseClicked(MouseEvent me){}
    @Override
    public void mouseEntered(MouseEvent me){}
    @Override
    public void mouseExited(MouseEvent me){}
    
    //ActionPerformed
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(addImage)){
            addImages();
        }else if (ae.getSource().equals(draw)){
            drawMode = ae.getActionCommand();
        }
    }
    public void addImages(){
        System.out.println("Choosing Image...");
        File i;
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Open Image", "jpg", "jpeg", "gif"));
        fc.showOpenDialog(this);
        i = fc.getSelectedFile();
        if (i != null){
            System.out.println("Done");
            Icon img = new ImageIcon(i.getAbsolutePath());
            note.insertIcon(img);
        }else{
            System.out.println("Cancel the process");
        }
    }
    /*@Override
    public void paint(Graphics g){
        if (fPoint.equals(sPoint)){return;}
        switch(drawMode){
            case "LineD":
                g.drawLine(fPoint.x,fPoint.y, sPoint.x, sPoint.y);
                break;
        }
    }*/
}
