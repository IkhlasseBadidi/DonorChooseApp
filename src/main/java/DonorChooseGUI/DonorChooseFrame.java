package DonorChooseGUI;

import Project.ProjectCollection;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ikhlasse & Nouhaila
 */
public class DonorChooseFrame extends javax.swing.JFrame {

    public static ProjectCollection prj;

    public DonorChooseFrame() {
        setTitle("Donors Choose Application");
        setLayout(new FlowLayout());
        initData();
        initComponents();

        setResizable(false);
        setSize(700, 600);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public void initData() {
        prj = new ProjectCollection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        addProject1 = new DonorChooseGUI.AddProject();
        displayProject1 = new DonorChooseGUI.DisplayProject();
        jPanel1 = new javax.swing.JPanel();
        projectDeleteEdit2 = new DonorChooseGUI.ProjectDeleteEdit();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        save = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane3.setBackground(new java.awt.Color(255, 153, 153));
        jTabbedPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addProject1.setMaximumSize(new java.awt.Dimension(500, 500));
        addProject1.setMinimumSize(new java.awt.Dimension(500, 500));
        addProject1.setName(""); // NOI18N
        addProject1.setPreferredSize(new java.awt.Dimension(500, 500));
        jTabbedPane3.addTab("Add Project", addProject1);
        jTabbedPane3.addTab("Display Projects", displayProject1);

        jPanel1.add(projectDeleteEdit2);

        jTabbedPane3.addTab("Edit/Delete Project", jPanel1);

        file.setText("File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitItem.setText("EXIT");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        file.add(exitItem);

        menuBar.add(file);

        edit.setText("Edit");
        menuBar.add(edit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            prj.save();
            JOptionPane.showMessageDialog(DonorChooseFrame.this, "" + "Changes Saved Successfully.", "Save Changes", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            System.err.println("Cannot serialize projects.");
            JOptionPane.showMessageDialog(DonorChooseFrame.this, "" + "An Error Occurred While Saving Changes.", "Save Changes", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        if (JOptionPane.showConfirmDialog(DonorChooseFrame.this, "Do you want to exit ?", "DonorChoose: Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitItemActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DonorChooseFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(DonorChooseFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(DonorChooseFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(DonorChooseFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                new DonorChooseFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DonorChooseGUI.AddProject addProject1;
    private DonorChooseGUI.DisplayProject displayProject1;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu file;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JMenuBar menuBar;
    private DonorChooseGUI.ProjectDeleteEdit projectDeleteEdit2;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables
}
