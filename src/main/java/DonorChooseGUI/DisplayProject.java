package DonorChooseGUI;

import Project.Category;
import Project.Project;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static DonorChooseGUI.DonorChooseFrame.prj;
import Project.ProjectCollection;

/**
 *
 * @author Ikhlasse & Nouhaila
 */
public class DisplayProject extends javax.swing.JPanel {

    private ProjectCollection projects;

    DefaultTableModel model_1;
    private static final String[] colNames = {"Title", "Story", "Grade", "Category", "Goal", "Type"};

    public DisplayProject() {
        model_1 = new DefaultTableModel();
        model_1.setColumnIdentifiers(colNames);
        initComponents();
        resultsTable.setModel(model_1);
        resultsTable.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 243, 243));
        setBorder(new javax.swing.border.MatteBorder(null));
        setForeground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(800, 300));
        setMinimumSize(new java.awt.Dimension(635, 300));
        setPreferredSize(new java.awt.Dimension(700, 600));

        categoryCombo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Category.values()));
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });

        resultsTable.setModel(model_1);
        resultsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(resultsTable);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dubai", 2, 16)); // NOI18N
        jTextField2.setText("Search results here:");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 153, 153));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(searchBtn)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(searchBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_categoryComboActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
//     
        Category categ = (Category) categoryCombo.getSelectedItem();

        List<Project> results = prj.findProjectWithCategory(categ);
        if (!results.isEmpty()) {
            Object[][] data = new Object[results.size()][colNames.length];
            int row = 0;
            for (row = 0; row < results.size(); row++) {

                Project proj = results.get(row);
                data[row][0] = proj.getTitle();
                data[row][1] = proj.getStory();
                data[row][2] = proj.getGrade();
                data[row][3] = proj.getCategory().name();
                data[row][4] = proj.getGoal();

                data[row][5] = proj.getProject_type().name();
            }
            model_1.setDataVector(data, colNames);
        } else {
            model_1.setDataVector(null, colNames);
            JOptionPane.showMessageDialog(DisplayProject.this,
                    "No search results, try again", "Search",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Category> categoryCombo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable resultsTable;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
