import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.JFileChooser;  
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.lang.Process;
import java.lang.ProcessBuilder;
import java.util.concurrent.TimeUnit;



public class Main extends javax.swing.JFrame {
   

    private DrawerController drawer;
    public Main() {
        initComponents();
        
        boxMusic320.setSelected(true);
        audioQuality = "0";
        
        reso720p.setSelected(true);
        video_resolution = "bestvideo[height=720]+bestaudio/best[height=720]";
        
        JLabel headerLabel = new JLabel("Recent Downloads");
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        drawer=Drawer.newDrawer(this)
                .header(new drawer_styles.drawerHEADER())
                .addChild(new recentDOWNLOAD(txtLink))
                .drawerWidth(450)
                .drawerBackground(new Color(17, 109, 110))
                .build();
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup = new javax.swing.ButtonGroup();
        background = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txtLink = new javax.swing.JTextField();
        btnPaste = new javax.swing.JButton();
        music_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxMusic320 = new javax.swing.JCheckBox();
        boxMusic256 = new javax.swing.JCheckBox();
        boxMusic192 = new javax.swing.JCheckBox();
        boxMusic128 = new javax.swing.JCheckBox();
        boxMusic64 = new javax.swing.JCheckBox();
        btnMusicDL = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reso1080p = new javax.swing.JCheckBox();
        reso720p = new javax.swing.JCheckBox();
        reso480p = new javax.swing.JCheckBox();
        reso360p = new javax.swing.JCheckBox();
        reso240p = new javax.swing.JCheckBox();
        reso144p = new javax.swing.JCheckBox();
        btnVideoDL = new javax.swing.JButton();
        btnRecent = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        file_location = new javax.swing.JMenuItem();
        exe_files = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(17, 109, 110));
        background.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUTUBE DOWNLOADER");

        txtLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkActionPerformed(evt);
            }
        });

        btnPaste.setText("Paste");
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });

        music_panel.setBackground(new java.awt.Color(17, 109, 110));
        music_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(78, 54, 54), new java.awt.Color(50, 30, 30), null, null), "Download Music", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        music_panel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("High Quality");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Low Quality");

        buttonGroup.add(boxMusic320);
        boxMusic320.setText("320 kbps");
        boxMusic320.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMusic320ActionPerformed(evt);
            }
        });

        buttonGroup.add(boxMusic256);
        boxMusic256.setText("256 kbps");
        boxMusic256.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMusic256ActionPerformed(evt);
            }
        });

        buttonGroup.add(boxMusic192);
        boxMusic192.setText("192 kbps");
        boxMusic192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMusic192ActionPerformed(evt);
            }
        });

        buttonGroup.add(boxMusic128);
        boxMusic128.setText("128 kbps");
        boxMusic128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMusic128ActionPerformed(evt);
            }
        });

        buttonGroup.add(boxMusic64);
        boxMusic64.setText("64 kbps");
        boxMusic64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMusic64ActionPerformed(evt);
            }
        });

        btnMusicDL.setText("Download");
        btnMusicDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicDLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout music_panelLayout = new javax.swing.GroupLayout(music_panel);
        music_panel.setLayout(music_panelLayout);
        music_panelLayout.setHorizontalGroup(
            music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(music_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(boxMusic128, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, music_panelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxMusic256, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxMusic320, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxMusic192, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(boxMusic64, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, music_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMusicDL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        music_panelLayout.setVerticalGroup(
            music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(music_panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMusic320)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMusic256)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMusic192)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMusic128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMusic64)
                .addGap(53, 53, 53)
                .addComponent(btnMusicDL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(17, 109, 110));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(78, 54, 54), new java.awt.Color(50, 30, 30), null, null), "Download Video", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("High Quality");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Low Quality");

        buttonGroup.add(reso1080p);
        reso1080p.setText("1080p (Full HD)");
        reso1080p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reso1080pActionPerformed(evt);
            }
        });

        buttonGroup.add(reso720p);
        reso720p.setText("720p (HD)");
        reso720p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reso720pActionPerformed(evt);
            }
        });

        buttonGroup.add(reso480p);
        reso480p.setText("480p (SD)");
        reso480p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reso480pActionPerformed(evt);
            }
        });

        buttonGroup.add(reso360p);
        reso360p.setText("360p");
        reso360p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reso360pActionPerformed(evt);
            }
        });

        buttonGroup.add(reso240p);
        reso240p.setText("240p");
        reso240p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reso240pActionPerformed(evt);
            }
        });

        buttonGroup.add(reso144p);
        reso144p.setText("144p");
        reso144p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reso144pActionPerformed(evt);
            }
        });

        btnVideoDL.setText("Download");
        btnVideoDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoDLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reso720p, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reso480p, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reso1080p, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reso240p, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reso360p, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reso144p, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVideoDL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reso1080p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reso720p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reso480p)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reso360p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reso240p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reso144p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVideoDL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        btnRecent.setText("Recent");
        btnRecent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecentActionPerformed(evt);
            }
        });

        background.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(txtLink, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(btnPaste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(music_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(btnRecent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133)
                        .addComponent(btnRecent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(music_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecent))
                .addGap(31, 31, 31)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(music_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        jMenu1.setText("Menu");

        file_location.setText("Download Location");
        file_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_locationActionPerformed(evt);
            }
        });
        jMenu1.add(file_location);

        exe_files.setText(".exe Files");
        exe_files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exe_filesActionPerformed(evt);
            }
        });
        jMenu1.add(exe_files);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void file_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_locationActionPerformed
        // TODO add your handling code here:
        // Create a JFileChooser instance for folder selection
        JFileChooser fileChooser = new JFileChooser();

        // Set the file selection mode to directories only
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Optionally, set a default directory to open (for example, your Documents folder)
        fileChooser.setCurrentDirectory(new java.io.File(System.getProperty("user.home")));

        // Show the "Choose Folder" dialog
        int result = fileChooser.showOpenDialog(this);

        // Check if the user selected a directory (not canceled)
        if (result == JFileChooser.APPROVE_OPTION) {
            // Get the selected directory
            File selectedFolder = fileChooser.getSelectedFile();

            // Save the folder path as a string
            folderLOCATION = selectedFolder.getAbsolutePath();
            
            updateFolderLocationInDatabase(folderLOCATION);
        } else {
            
        }
        
    }//GEN-LAST:event_file_locationActionPerformed

    private void exe_filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exe_filesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exe_filesActionPerformed

    private void btnMusicDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicDLActionPerformed
        try {
            // TODO add your handling code here:
            String youtubeLink = txtLink.getText();
            if (!youtubeLink.isEmpty()) {
                //progressBar.setValue(0);  // Reset progress bar
                DownloadTask task = new DownloadTask(youtubeLink);
                
                // Insert the video information into the database
                String ytLINK = youtubeLink;
                String title = getVideoTitle(youtubeLink);
                String ytTITLE = title;

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/youtubedownloader", "root", "");
                PreparedStatement ps = con.prepareStatement("INSERT INTO linkinfo(title, link, date_time) VALUES (?, ?, NOW())");
                ps.setString(1, ytTITLE);
                ps.setString(2, ytLINK);
                ps.executeUpdate();
                task.execute();  // Start the download task
                
            } else {
                System.out.println("Please Enter a valid YOutube Link");
            }
  
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnMusicDLActionPerformed

    private void boxMusic256ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMusic256ActionPerformed
        // TODO add your handling code here:
        if (boxMusic256.isSelected()) {
            audioQuality = "1";
        } else {
            audioQuality = "";
        }
    }//GEN-LAST:event_boxMusic256ActionPerformed

    private void boxMusic320ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMusic320ActionPerformed
        // TODO add your handling code here:
        if (boxMusic320.isSelected()) {
            audioQuality = "0";
        } else {
            audioQuality = "";
        }
        
    }//GEN-LAST:event_boxMusic320ActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        // TODO add your handling code here:
        try {
            // Get the system clipboard
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

            // Get the clipboard contents as a Transferable object
            Transferable clipData = clipboard.getContents(null);

            // Check if the clipboard contains text
            if (clipData != null && clipData.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                // Retrieve the text from the clipboard
                String clipboardText = (String) clipData.getTransferData(DataFlavor.stringFlavor);
                
                txtLink.setText("");
                // Paste the clipboard text wherever needed
                txtLink.setText(clipboardText);
            } else {
                System.out.println("Clipboard does not contain text data.");
                JOptionPane.showMessageDialog(null, "Clipboard does not contain text data.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error accessing clipboard data: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnPasteActionPerformed

    private void txtLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkActionPerformed

    private void btnRecentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecentActionPerformed
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btnRecentActionPerformed

    private void boxMusic64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMusic64ActionPerformed
        // TODO add your handling code here:
        if (boxMusic64.isSelected()) {
            audioQuality = "9";
        } else {
            audioQuality = "";
        }
    }//GEN-LAST:event_boxMusic64ActionPerformed

    private void boxMusic192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMusic192ActionPerformed
        // TODO add your handling code here:
        if (boxMusic192.isSelected()) {
            audioQuality = "2";
        } else {
            audioQuality = "";
        }
    }//GEN-LAST:event_boxMusic192ActionPerformed

    private void boxMusic128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMusic128ActionPerformed
        // TODO add your handling code here:
        if (boxMusic128.isSelected()) {
            audioQuality = "5";
        } else {
            audioQuality = "";
        }
    }//GEN-LAST:event_boxMusic128ActionPerformed

    
    private void btnVideoDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoDLActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            String youtubeLink = txtLink.getText();
            if (!youtubeLink.isEmpty()) {
                
                //progressBar.setValue(0);  // Reset progress bar
                VideoDownloadTask task = new VideoDownloadTask(youtubeLink);
                task.execute();  // Start the download task

            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a valid YOutube Link");
                
            }
            
            String ytLINK = txtLink.getText();
            
            String title = getVideoTitle(youtubeLink);
            String ytTITLE= title;
            
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into linkinfo(title,link,date_time)values(?,?,NOW())");
            ps.setString(1,ytTITLE);
            ps.setString(2,ytLINK);
            
            ps.executeUpdate();

        }catch (Exception ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVideoDLActionPerformed

    private void reso1080pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reso1080pActionPerformed
        // TODO add your handling code here:
        if (reso1080p.isSelected()) {
            video_resolution = "bestvideo[height=1080]+bestaudio/best[height=1080]";
        } else {
            video_resolution = "";
        }
        
    }//GEN-LAST:event_reso1080pActionPerformed

    private void reso720pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reso720pActionPerformed
        // TODO add your handling code here:
        if (reso720p.isSelected()) {
            video_resolution = "bestvideo[height=720]+bestaudio/best[height=720]";
        } else {
            video_resolution = "";
        }
    }//GEN-LAST:event_reso720pActionPerformed

    private void reso480pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reso480pActionPerformed
        // TODO add your handling code here:
        if (reso480p.isSelected()) {
            video_resolution = "bestvideo[height=480]+bestaudio/best[height=480]";
        } else {
            video_resolution = "";
        }
    }//GEN-LAST:event_reso480pActionPerformed

    private void reso360pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reso360pActionPerformed
        // TODO add your handling code here:
        if (reso360p.isSelected()) {
            video_resolution = "bestvideo[height=360]+bestaudio/best[height=360]";
        } else {
            video_resolution = "";
        }
        
    }//GEN-LAST:event_reso360pActionPerformed

    private void reso240pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reso240pActionPerformed
        // TODO add your handling code here:
        if (reso240p.isSelected()) {
            video_resolution = "bestvideo[height=240]+bestaudio/best[height=240]";
        } else {
            video_resolution = "";
        }
    }//GEN-LAST:event_reso240pActionPerformed

    private void reso144pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reso144pActionPerformed
        // TODO add your handling code here:
        if (reso144p.isSelected()) {
            video_resolution = "bestvideo[height=144]+bestaudio/best[height=144]";
        } else {
            video_resolution = "";
        }
    }//GEN-LAST:event_reso144pActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    
    public class DatabaseConnection {
    
        private static final String URL = "jdbc:mysql://localhost/youtubedownloader";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static Connection getConnection() throws Exception {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }
    
    //Video_Download
    // SwingWorker to handle background download and progress updates
    private class VideoDownloadTask extends SwingWorker<Void, Integer> {
        private String youtubeLink;
        private DownloadProgressDialog progressDialog;
        FolderLocationReader folderReader = new FolderLocationReader();
        String newfolderLocation = folderReader.getUpdatedFolderLocation();
        

        public VideoDownloadTask(String youtubeLink) {
            this.youtubeLink = youtubeLink;
            this.progressDialog = new DownloadProgressDialog(Main.this, "Downloading Video");
            this.progressDialog.setTask(this);
            
            

        }

        @Override
        protected Void doInBackground() throws Exception {
            try {
                SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));
                
                // Command to download and convert the YouTube video to MP3
                String command = "yt-dlp -f " + video_resolution + " "
                + "--ffmpeg-location \"C:\\Program Files\\ffmpeg\\ffmpeg.exe\" "
                + "--merge-output-format mp4 "
                + "-o \"" + newfolderLocation + "\\%(title)s.%(ext)s\" "
                + "\"" + youtubeLink + "\"";
                 
                System.out.println("Command: " + command);
                System.out.println("Folder Location: " + newfolderLocation);



                // Set up ProcessBuilder to start in the specified directory
                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
                builder.directory(new File("C:\\Users\\Human\\Downloads\\Programs"));  // Set working directory
                builder.redirectErrorStream(true);  // Redirect error stream to output stream

                Process process = builder.start();
                progressDialog.setProcess(process); // Set the process in dialog
                progressDialog.setVideoLink(youtubeLink); // Set video link for cleanup

                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                Pattern pattern = Pattern.compile("\\[download\\]\\s+(\\d+\\.\\d+)%");
                String line;

                while ((line = reader.readLine()) != null && !progressDialog.isCancelled()) {
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        String percentStr = matcher.group(1);
                        int progress = (int) Float.parseFloat(percentStr);
                        publish(progress);
                    }
                }
                
                if (progressDialog.isCancelled()) {
                    process.destroyForcibly(); // Force kill the process
                    return null;
                }

                if (!progressDialog.isCancelled()) {
                    process.waitFor();
                    String title = getVideoTitle(youtubeLink);
                    SwingUtilities.invokeLater(() -> {
                        progressDialog.dispose();
                        JOptionPane.showMessageDialog(null, "Download Successfully:\n" + 
                            (title != null ? title : "Unknown Title"));
                    });
                }
            } catch (Exception ex) {
                SwingUtilities.invokeLater(() -> {
                    progressDialog.dispose();
                    JOptionPane.showMessageDialog(null, "Error during download: " + ex.getMessage());
                });
            }
            return null;
        }

        @Override
        protected void process(List<Integer> chunks) {
            
            // Get the latest progress from the chunks and update the progress bar
            int latestProgress = chunks.get(chunks.size() - 1);
            progressDialog.setProgress(latestProgress);
            //progressBar.setValue(latestProgress);  // Update progress bar
            // Print the progress to the terminal
            System.out.println("Download Progress: " + latestProgress + "%");
        }

        @Override
        protected void done() {
            //progressBar.setValue(100);
            progressDialog.dispose();// Set progress bar to 100% when done
        }
    }
    
    //Music_Download
    // SwingWorker to handle background download and progress updates
    private class DownloadTask extends SwingWorker<Void, Integer> {
        private String youtubeLink;
        private DownloadProgressDialog progressDialog;
        FolderLocationReader folderReader = new FolderLocationReader();
        String newfolderLocation = folderReader.getUpdatedFolderLocation();
        

        public DownloadTask(String youtubeLink) {
            this.youtubeLink = youtubeLink;
            this.progressDialog = new DownloadProgressDialog(Main.this, "Downloading Audio");
            this.progressDialog.setTask(this);

        }

        @Override
        protected Void doInBackground() throws Exception {
            try {
                
                SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));
                // Command to download and convert the YouTube video to MP3
                 String command = "yt-dlp -x --audio-format mp3 --audio-quality " + audioQuality 
                + " --ffmpeg-location \"C:\\Program Files\\ffmpeg\\ffmpeg.exe\" "
                + "-o \"" + newfolderLocation + "\\%(title)s.%(ext)s\" "
                + "\"" + youtubeLink + "\"";
                 
                
                System.out.println("Command: " + command);
                System.out.println("Folder Location: " + newfolderLocation);



                // Set up ProcessBuilder to start in the specified directory
                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
                builder.directory(new File("C:\\Users\\Human\\Downloads\\Programs"));  // Set working directory
                builder.redirectErrorStream(true);  // Redirect error stream to output stream

                Process process = builder.start();
                progressDialog.setProcess(process);
                progressDialog.setVideoLink(youtubeLink);
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                Pattern pattern = Pattern.compile("\\[download\\]\\s+(\\d+\\.\\d+)%");
                String line;
                
                while ((line = reader.readLine()) != null && !progressDialog.isCancelled()) {
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        String percentStr = matcher.group(1);
                        int progress = (int) Float.parseFloat(percentStr);
                        publish(progress);
                    }
                }

                if (!progressDialog.isCancelled()) {
                    process.waitFor();
                    String title = getVideoTitle(youtubeLink);
                    SwingUtilities.invokeLater(() -> {
                        progressDialog.dispose();
                        JOptionPane.showMessageDialog(null, "Download Successfully:\n" + 
                            (title != null ? title : "Unknown Title"));
                    });
                }
            } catch (Exception ex) {
                SwingUtilities.invokeLater(() -> {
                    progressDialog.dispose();
                    JOptionPane.showMessageDialog(null, "Error during download: " + ex.getMessage());
                });
            }
            return null;
        }

        @Override
        protected void process(List<Integer> chunks) {
            int latestProgress = chunks.get(chunks.size() - 1);
            progressDialog.setProgress(latestProgress);
            //progressBar.setValue(latestProgress);
        }

        @Override
        protected void done() {
            //progressBar.setValue(100);
            progressDialog.dispose();
        }
    }
    
    // Get Video Title
    private static String getVideoTitle(String youtubeLink) {
        String title = null;
        try {
            // Command to get the video title
            String command = "yt-dlp --get-title --ffmpeg-location \"C:\\Program Files\\ffmpeg\\ffmpeg.exe\" \"" + youtubeLink + "\""; 

            // Execute the command
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
            builder.directory(new File("C:\\Users\\Human\\Downloads\\Programs"));  // Set working directory
            builder.redirectErrorStream(true); // Combine error stream with output
            Process process = builder.start();
            

            // Read the title from the command output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            title = reader.readLine(); // The title should be on the first line of output

            process.waitFor();
        } catch (Exception e) {
            System.out.println("Error fetching video title: " + e.getMessage());
        }
        return title;
    }
    
    // Select Folder then save to database
    private void updateFolderLocationInDatabase(String newLocation) {
        try {
            // Establish database connection
            Connection con = DatabaseConnection.getConnection();

            // Prepare the SQL UPDATE statement to modify the location
            String updateQuery = "UPDATE download_info SET download_location = ? WHERE id = 1";
            // Prepare the statement
            PreparedStatement ps = con.prepareStatement(updateQuery);
            ps.setString(1, newLocation);

            // Execute the update query
            int rowsUpdated = ps.executeUpdate();

            // Notify if the update was successful
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Folder location updated successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "No folder selected.");
            }

            // Close the resources
            ps.close();
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error updating the folder location: " + ex.getMessage());
        }
    }
    
    public class FolderLocationReader {

        private String updated_folder_location;

        public FolderLocationReader() {
            // Attempt to fetch the folder location when the class is instantiated
            fetchFolderLocation();
        }

        private void fetchFolderLocation() {
            try {
                // Establish database connection
                Connection con = DatabaseConnection.getConnection();

                // Prepare the SQL SELECT statement to fetch the folder location
                String selectQuery = "SELECT download_location FROM download_info WHERE id = 1";
                PreparedStatement ps = con.prepareStatement(selectQuery);
                ResultSet rs = ps.executeQuery();

                // Retrieve the value if present
                if (rs.next()) {
                    updated_folder_location = rs.getString("download_location");
                } else {
                    // Handle case where no matching record is found
                    updated_folder_location = null;
                    Logger.getLogger(FolderLocationReader.class.getName()).log(Level.WARNING, "No folder location found for ID 1.");
                }

                // Close resources
                rs.close();
                ps.close();
                con.close();

            } catch (Exception ex) {
                Logger.getLogger(FolderLocationReader.class.getName()).log(Level.SEVERE, null, ex);
                updated_folder_location = null;
            }
        }

        // Getter for the folder location
        public String getUpdatedFolderLocation() {
            return updated_folder_location;
        }
    }

    public class DownloadProgressDialog extends JDialog {
        private String currentVideoLink;
        private JProgressBar progressBar;
        private JLabel percentageLabel;
        private JButton cancelButton;
        private volatile boolean isCancelled = false;
        private SwingWorker currentTask;
        private Process currentProcess;

        public void setVideoLink(String link) {
            this.currentVideoLink = link;
        }
        
        public void setProcess(Process process) {
            this.currentProcess = process;
        }
        
        private void cleanupPartialDownload(String folderLocation, String videoTitle) {
            try {
                if (videoTitle != null) {
                    File folder = new File(folderLocation);
                    File[] files = folder.listFiles((dir, name) -> 
                        name.startsWith(videoTitle) && 
                        (name.endsWith(".part") || name.endsWith(".mp4") || name.endsWith(".mp3"))
                    );

                    if (files != null) {
                        for (File file : files) {
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public DownloadProgressDialog(JFrame parent, String title) {
            super(parent, title, true);
            initComponents();
            setupDialog();
            addWindowListener();
        }

        private void initComponents() {
            // Create components
            progressBar = new JProgressBar(0, 100);
            percentageLabel = new JLabel("0%");
            cancelButton = new JButton("Cancel");

            // Configure progress bar
            progressBar.setStringPainted(true);
            progressBar.setPreferredSize(new Dimension(300, 20));

            // Configure percentage label
            percentageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            percentageLabel.setPreferredSize(new Dimension(50, 20));

            // Configure cancel button
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleCancel();
                }
            });

            // Layout setup
            setLayout(new BorderLayout(10, 10));

            // Progress panel (progress bar + percentage)
            JPanel progressPanel = new JPanel(new BorderLayout(5, 0));
            progressPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
            progressPanel.add(progressBar, BorderLayout.CENTER);
            progressPanel.add(percentageLabel, BorderLayout.EAST);

            // Button panel
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
            buttonPanel.add(cancelButton);

            // Add panels to dialog
            add(progressPanel, BorderLayout.CENTER);
            add(buttonPanel, BorderLayout.SOUTH);
        }

        private void setupDialog() {
            setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            setResizable(false);
            pack();
            setLocationRelativeTo(getParent());
        }

        private void addWindowListener() {
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    handleCancel();
                }
            });
        }

        public void setProgress(int progress) {
            progressBar.setValue(progress);
            percentageLabel.setText(progress + "%");
        }

        public void setTask(SwingWorker task) {
            this.currentTask = task;
        }

        private void handleCancel() {
            int result = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to cancel the download?",
                "Cancel Download",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if (result == JOptionPane.YES_OPTION) {
                try {
                    isCancelled = true;

                    if (currentProcess != null) {
                        // Get process ID
                        long pid = currentProcess.pid();

                        // Kill yt-dlp and ffmpeg processes
                        String[] killCmd = {
                            "cmd.exe",
                            "/c",
                            "taskkill /F /IM yt-dlp.exe /T & " +
                            "taskkill /F /IM ffmpeg.exe /T"
                        };

                        Process killProcess = Runtime.getRuntime().exec(killCmd);
                        killProcess.waitFor();

                        // Ensure our main process is terminated
                        currentProcess.destroyForcibly();

                        // Wait briefly
                        Thread.sleep(500);

                        // Clean up partial downloads
                        FolderLocationReader folderReader = new FolderLocationReader();
                        String folderLocation = folderReader.getUpdatedFolderLocation();
                        if (folderLocation != null) {
                            String[] cleanCmd = {
                                "cmd.exe",
                                "/c",
                                "del /F /Q \"" + folderLocation + "\\*.part\" & " +
                                "del /F /Q \"" + folderLocation + "\\*.temp\" & " +
                                "del /F /Q \"" + folderLocation + "\\*.tmp\" & " +
                                "del /F /Q \"" + folderLocation + "\\*.webm\" & " +
                                "del /F /Q \"" + folderLocation + "\\*.ytdl\""
                            };
                            Runtime.getRuntime().exec(cleanCmd);
                        }

                        if (currentTask != null) {
                            currentTask.cancel(true);
                        }

                        dispose();
                        
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(
                        Level.SEVERE, 
                        "Error cancelling download", 
                        ex
                    );
                    JOptionPane.showMessageDialog(
                        this,
                        "Error cancelling download: " + ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }

        public boolean isCancelled() {
            return isCancelled;
        }
    }
    

    private String folderLOCATION; // Declare a variable to store the folder location
    private String audioQuality;
    private String video_resolution;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    private javax.swing.JCheckBox boxMusic128;
    private javax.swing.JCheckBox boxMusic192;
    private javax.swing.JCheckBox boxMusic256;
    private javax.swing.JCheckBox boxMusic320;
    private javax.swing.JCheckBox boxMusic64;
    public javax.swing.JButton btnMusicDL;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnRecent;
    private javax.swing.JButton btnVideoDL;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JMenuItem exe_files;
    private javax.swing.JMenuItem file_location;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel music_panel;
    private javax.swing.JCheckBox reso1080p;
    private javax.swing.JCheckBox reso144p;
    private javax.swing.JCheckBox reso240p;
    private javax.swing.JCheckBox reso360p;
    private javax.swing.JCheckBox reso480p;
    private javax.swing.JCheckBox reso720p;
    public javax.swing.JTextField txtLink;
    // End of variables declaration//GEN-END:variables
}
