package DonorChooseGUI;

import static DonorChooseGUI.DonorChooseFrame.prj;
import Project.Project;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ikhlasse & Nouhaila
 */
public class ProjectDeleteEdit extends javax.swing.JPanel {

    static DefaultListModel<Project> model;

    public ProjectDeleteEdit() {
        model = new DefaultListModel<>();
        initComponents();
        projectList.setModel(model);
        try {
            prj.load();
            ListIterator<Project> iter = prj.getProjects();
         while (iter.hasNext()) {
            Project prjt = iter.next();
            model.addElement(prjt);
        } 
        } catch (Exception ex) {
            if (ex instanceof FileNotFoundException) {
                JOptionPane.showMessageDialog(this,
                        "Unable to load the data",
                        "Loding the data",
                        JOptionPane.ERROR_MESSAGE);
            } 
    
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList<>();
        storyLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        storyTxt = new javax.swing.JTextField();
        gradeTxt = new javax.swing.JTextField();
        categoryTxt = new javax.swing.JTextField();
        typeTxt = new javax.swing.JTextField();
        goalLabel = new javax.swing.JLabel();
        goalTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 243, 243));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 600));

        projectList.setBackground(new java.awt.Color(227, 227, 254));
        projectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectListMouseClicked(evt);
            }
        });
        projectList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                projectListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(projectList);

        storyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        storyLabel.setText("Story:");

        gradeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gradeLabel.setText("Grade:");

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryLabel.setText("Category:");

        typeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typeLabel.setText("Type:");

        storyTxt.setEditable(false);
        storyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyTxtActionPerformed(evt);
            }
        });

        gradeTxt.setEditable(false);

        categoryTxt.setEditable(false);
        categoryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTxtActionPerformed(evt);
            }
        });

        typeTxt.setEditable(false);

        goalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        goalLabel.setText("Goal:");

        deleteBtn.setBackground(new java.awt.Color(255, 204, 204));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLabel.setText("Title:");

        titleTxt.setEditable(false);
        titleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("EDIT/DELETE PROJECTS");
        jLabel1.setToolTipText("You can edit or delete projects here");

        EditBtn.setBackground(new java.awt.Color(255, 204, 204));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gradeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleLabel))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(storyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(storyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditBtn)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(EditBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLabel)
                            .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goalLabel)
                            .addComponent(goalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradeLabel)
                            .addComponent(gradeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryLabel)
                            .addComponent(categoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeLabel)
                            .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storyLabel)
                            .addComponent(storyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void storyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storyTxtActionPerformed

    private void categoryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTxtActionPerformed

    private void projectListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_projectListValueChanged

        Project proj = projectList.getSelectedValue();
        if (proj == null) {
            return;
        }

        titleTxt.setText(proj.getTitle());
        storyTxt.setText(proj.getStory());
        gradeTxt.setText(proj.getGrade());
        categoryTxt.setText(proj.getCategory().name());
        categoryTxt.setText(proj.getCategory().name());
        typeTxt.setText(proj.getProject_type().name());
        goalTxt.setText(String.valueOf(proj.getGoal()));

        // TODO add your handling code here:
    }//GEN-LAST:event_projectListValueChanged

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        Project selected = projectList.getSelectedValue();

        prj.removeProject(selected);
        model.removeElement(selected);
        titleTxt.setText("");
        goalTxt.setText("");
        gradeTxt.setText("");
        storyTxt.setText("");
        categoryTxt.setText("");
        typeTxt.setText("");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void titleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTxtActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

        String goal = goalTxt.getText();
        Project selected = projectList.getSelectedValue();
        Project proj = selected;
        proj.setGoal(Double.parseDouble(goal));
        if (goal.isEmpty()) {
            JOptionPane.showMessageDialog(ProjectDeleteEdit.this, "" + "Please provide a valid Title.", "Add Title", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (prj.modifyGoal(selected, proj)) {
            JOptionPane.showMessageDialog(ProjectDeleteEdit.this, "" + "Goal modified successfully..", "Adding projects", JOptionPane.INFORMATION_MESSAGE);
            model.removeElement(selected);
            model.addElement(proj);
            projectList.setSelectedValue(proj, true);
        } else {
            JOptionPane.showMessageDialog(ProjectDeleteEdit.this, "" + "Failed to modify the Goal.", "Adding projects", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void projectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectListMouseClicked

    }//GEN-LAST:event_projectListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel goalLabel;
    private javax.swing.JTextField goalTxt;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JTextField gradeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    static javax.swing.JList<Project> projectList;
    private javax.swing.JLabel storyLabel;
    private javax.swing.JTextField storyTxt;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables
}
