import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javax.swing.table.TableRowSorter;
import tablePackage.TableActionCellEditor;
import tablePackage.TableActionEvent;
import tablePackage.TableActionRender;




class recentDOWNLOAD extends javax.swing.JPanel {
    private JTextField txtLink;
    private Timer timer;
    
    public recentDOWNLOAD(JTextField txtLink) {
        this.txtLink = txtLink;
        initComponents();
        loadData();
        startAutoRefresh();
        autoSearch();
        
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                // Fetch the ID of the row to delete
                int id = getIdFromRow(row);

                if (id != -1) {
                    // Delete the record from the database
                    deleteDownloadRecord(id);
                    // After deletion, reload the table to reflect the changes
                 if (jTable1.isEditing()) {
                     jTable1.getCellEditor().stopCellEditing();
                 }
                 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                 model.removeRow(row);
                    loadData();
                }
            }
        };

        jTable1.getColumnModel().getColumn(2).setCellRenderer(new TableActionRender());
        jTable1.getColumnModel().getColumn(2).setCellEditor(new TableActionCellEditor(event));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
   
    }
    
    public void setTextField(JTextField txtLink) {
        this.txtLink = txtLink;
    }
    
    private TableActionEvent createTableActionEvent() {
        return new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                // Fetch the ID of the row to delete
                int id = getIdFromRow(row);

                if (id != -1) {
                    // Delete the record from the database
                    deleteDownloadRecord(id);
                    // After deletion, reload the table to reflect the changes
                    loadData();
                }
            }
        };
    }

    
    private void startAutoRefresh() {
        int delay = 5000;
        timer = new Timer(delay, e -> loadData());
        timer.start();
    }
    
    private void autoSearch() {
        txtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String searchText = txtSearch.getText();

                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
                jTable1.setRowSorter(sorter);

                if(searchText.trim().isEmpty()){
                    sorter.setRowFilter(null);
                }else{
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
                }
            }
        });
        
    }
    
    
    private void loadData() {
        // Database connection and loading data into the JTable
        String url = "jdbc:mysql://localhost/youtubedownloader";
        String user = "root";
        String password = "";
        
        try {
            // Establish the connection to the database
            Connection con = DriverManager.getConnection(url, user, password);
            String query = "SELECT title, link, date_time FROM linkinfo ORDER BY date_time DESC";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Create a model for the table
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            // Loop through the result set and add rows to the table
            while (rs.next()) {
                String title = rs.getString("title");
                String link = rs.getString("link");
                String dateTime = rs.getString("date_time");
                
              
                
                // Add data to the table model
                model.addRow(new Object[] {title, dateTime, link});
            }

            // Close the resources
            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(recentDOWNLOAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Method to add a new record to the database (you already have this code)
    public void addDownloadRecord(String title, String youtubeLink) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/youtubedownloader", "root", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO linkinfo(title, link, date_time) VALUES(?, ?, NOW())");
            ps.setString(1, title);
            ps.setString(2, youtubeLink);
            ps.executeUpdate();
            con.close();

            // After insertion, reload the table with updated data
            loadData();
        } catch (Exception ex) {
            Logger.getLogger(recentDOWNLOAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private int getIdFromRow(int row) {
        int id = -1; // Default value for invalid row

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/youtubedownloader", "root", "")) {
            String query = "SELECT id FROM linkinfo LIMIT ?, 1";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, row); // Use row index as a part of the query
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(recentDOWNLOAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    private void deleteDownloadRecord(int id) {
        // Show confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(
            this, // Use the current JPanel as the parent component
            "Are you sure you want to delete this file ?",
            "Confirm Deletion",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        // If user chooses "OK", proceed with deletion
        if (confirm == JOptionPane.OK_OPTION) {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/youtubedownloader", "root", "")) {
                String query = "DELETE FROM linkinfo WHERE id = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                ps.close();

                // Log or handle any post-deletion actions
                System.out.println("Deleted successfully.");
            } catch (SQLException ex) {
                Logger.getLogger(recentDOWNLOAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // User chose "Cancel," log or handle this if needed
            System.out.println("Deletion canceled by user.");
        }
    }

    
    


    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(17, 109, 110));

        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Date", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Clear Recent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String YTLink = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        txtLink.setText(YTLink);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(
            this, // Use the current JPanel as the parent component
            "All Download History will be deleted",
            "Confirm Deletion",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        // If user chooses "OK", proceed with deletion
        if (confirm == JOptionPane.OK_OPTION) {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/youtubedownloader", "root", "")) {
                String query = "DELETE FROM linkinfo";
                PreparedStatement ps = con.prepareStatement(query);
                ps.executeUpdate();
                ps.close();

                // Log or handle any post-deletion actions
                System.out.println("Cleared all History");
            } catch (SQLException ex) {
                Logger.getLogger(recentDOWNLOAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // User chose "Cancel," log or handle this if needed
            System.out.println("Clearing recent was canceled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
