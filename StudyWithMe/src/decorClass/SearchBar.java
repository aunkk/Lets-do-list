/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package decorClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;

/**
 *
 * @author DELL
 */
public class SearchBar extends javax.swing.JPanel {
    ArrayList<Task> tasks;
    DefaultListModel<String> model;
    /**
     * Creates new form NewJPanel
     */
    public SearchBar() {
        initComponents();
        taskPopup.add(panellist);
        
        tasks = new ArrayList<>();
        tasks.add(new Task("do homework", "2024-04-01")); // Example task data
        tasks.add(new Task("clean house", "2024-04-02")); // Example task data
        tasks.add(new Task("OOP project", "2024-05-01")); // Example task data
        tasks.add(new Task("FE test", "2024-03-02")); // Example task data
        tasks.add(new Task("business project", "2024-05-02"));
        tasks.add(new Task("my birthday!", "2024-05-03"));
        tasks.add(new Task("go vacation", "2024-05-30"));
        tasks.add(new Task("midterm", "2024-06-02"));
        tasks.add(new Task("prob quiz#1", "2024-06-02"));
        tasks.add(new Task("prob quiz#2", "2024-12-02"));
        tasks.add(new Task("prob quiz#3", "2024-12-02"));
        tasks.add(new Task("prob quiz#4", "2024-12-02"));
        tasks.add(new Task("data structure homework", "2024-11-02"));
        tasks.add(new Task("business quiz", "2024-11-05"));
        tasks.add(new Task("my cat's birthday!", "2024-06-22"));
        tasks.add(new Task("go shopping", "2024-12-02"));
        tasks.add(new Task("study for midterm", "2024-12-02"));
        tasks.add(new Task("math quiz", "2024-12-02"));
        
        model = new DefaultListModel<>(); // create model
        ListTask.setModel(model); //put model in list
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellist = new javax.swing.JPanel();
        scrollList = new javax.swing.JScrollPane();
        ListTask = new javax.swing.JList<>();
        taskPopup = new javax.swing.JPopupMenu();
        searchingBar = new javax.swing.JTextField();

        ListTask.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollList.setViewportView(ListTask);

        javax.swing.GroupLayout panellistLayout = new javax.swing.GroupLayout(panellist);
        panellist.setLayout(panellistLayout);
        panellistLayout.setHorizontalGroup(
            panellistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(panellistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panellistLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panellistLayout.setVerticalGroup(
            panellistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(panellistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panellistLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        searchingBar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        searchingBar.setBorder(null);
        searchingBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchingBarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchingBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchingBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingBarKeyReleased
        String searchText = searchingBar.getText().toLowerCase();
        model.removeAllElements(); //clear model
        if (!searchText.isEmpty()) {
            taskPopup.show(searchingBar, 0, searchingBar.getHeight());
            ArrayList<Task> matchingTasks = new ArrayList<>(); //new ArtrayList to store matching task
                    for (Task task : tasks) {   //task = object in tasks -> loop to compare searchText-task
                        if (task.getName().toLowerCase().contains(searchText) || task.getDueDate().contains(searchText)) { //1.check from name 2.check from duedate -> use (.contains(searchText))
                            matchingTasks.add(task); //if match add match-task to matchingTasks-ArrayList
                        }
                    }
                    Collections.sort(matchingTasks, new Comparator<Task>() {                    //Sort matchingTask // Comparator is filter -> sort(ArrayList, filter)
                        public int compare(Task t1, Task t2) {                                  // filter -> show task with 1st.closer name -> 2nd.closer due date
                        char firstLetter1 = t1.getName().toLowerCase().charAt(0);           //first letter of task name
                        char firstLetter2 = t2.getName().toLowerCase().charAt(0);
                            
                        if (firstLetter1 == searchText.charAt(0) && firstLetter2 != searchText.charAt(0)) {         //task1 closer than task2 -> come first
                            return -1;
                        } else if (firstLetter1 != searchText.charAt(0) && firstLetter2 == searchText.charAt(0)) {  //task 2 closer than task1
                            return 1;
                        } else {
                            return t1.getDueDate().compareTo(t2.getDueDate()); // same, compare by due date
                        }
                    }
                    });
                    for (Task task : matchingTasks) { //task from matchingTasks -> put task in model and model->list->scrollpane to show in gui
                        model.addElement(task.getName() + " - Due : " + task.getDueDate()); //add("name - Due: xxxx-xx-xx)
                    }
        }
        else{
            taskPopup.setVisible(false); //not type anything -> hide
        }
        revalidate(); //to refresh
    }//GEN-LAST:event_searchingBarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListTask;
    private javax.swing.JPanel panellist;
    private javax.swing.JScrollPane scrollList;
    private javax.swing.JTextField searchingBar;
    private javax.swing.JPopupMenu taskPopup;
    // End of variables declaration//GEN-END:variables
}