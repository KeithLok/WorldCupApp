/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcupapp;

/**
 *
 * @author Nathan Ryan x13448212 Group 7
 */
public class GroupFixtures extends javax.swing.JFrame {

    /**
     * Creates new form GroupFixtures
     */
    public GroupFixtures() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        fixturesLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        taskbar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        groupBBtn = new javax.swing.JButton();
        groupCBtn = new javax.swing.JButton();
        groupABtn = new javax.swing.JButton();
        groupDBtn = new javax.swing.JButton();
        groupEBtn = new javax.swing.JButton();
        groupFBtn = new javax.swing.JButton();
        groupGBtn = new javax.swing.JButton();
        groupHBtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fixturesLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fixturesLbl.setForeground(new java.awt.Color(255, 255, 255));
        fixturesLbl.setText("Group Fixtures");
        jLayeredPane1.add(fixturesLbl);
        fixturesLbl.setBounds(110, 60, 160, 50);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/back.png"))); // NOI18N
        backBtn.setOpaque(false);
        backBtn.setOpaque(false);
        backBtn.setContentAreaFilled( false );
        backBtn.setBorder( null );
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(backBtn);
        backBtn.setBounds(10, 10, 80, 50);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/home.png"))); // NOI18N
        homeBtn.setOpaque(false);
        homeBtn.setOpaque(false);
        homeBtn.setContentAreaFilled( false );
        homeBtn.setBorder( null );
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(homeBtn);
        homeBtn.setBounds(270, 10, 70, 50);

        taskbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Taskbar.png"))); // NOI18N
        taskbar.setText("jLabel2");
        jLayeredPane1.add(taskbar);
        taskbar.setBounds(0, -10, 360, 140);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 850));

        groupBBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupB.png"))); // NOI18N
        groupBBtn.setOpaque(false);
        groupBBtn.setOpaque(false);
        groupBBtn.setContentAreaFilled( false );
        groupBBtn.setBorder( null );
        groupBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupBBtnActionPerformed(evt);
            }
        });

        groupCBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupC.png"))); // NOI18N
        groupCBtn.setOpaque(false);
        groupCBtn.setOpaque(false);
        groupCBtn.setContentAreaFilled( false );
        groupCBtn.setBorder( null );
        groupCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupCBtnActionPerformed(evt);
            }
        });

        groupABtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupA.png"))); // NOI18N
        groupABtn.setOpaque(false);
        groupABtn.setContentAreaFilled( false );
        groupABtn.setBorder( null );
        groupABtn.setOpaque(false);
        groupABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupABtnActionPerformed(evt);
            }
        });

        groupDBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupD.png"))); // NOI18N
        groupDBtn.setOpaque(false);
        groupDBtn.setOpaque(false);
        groupDBtn.setContentAreaFilled( false );
        groupDBtn.setBorder( null );
        groupDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupDBtnActionPerformed(evt);
            }
        });

        groupEBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupE.png"))); // NOI18N
        groupEBtn.setOpaque(false);
        groupEBtn.setOpaque(false);
        groupEBtn.setContentAreaFilled( false );
        groupEBtn.setBorder( null );
        groupEBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupEBtnActionPerformed(evt);
            }
        });

        groupFBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupF.png"))); // NOI18N
        groupFBtn.setOpaque(false);
        groupFBtn.setOpaque(false);
        groupFBtn.setContentAreaFilled( false );
        groupFBtn.setBorder( null );
        groupFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupFBtnActionPerformed(evt);
            }
        });

        groupGBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupG.png"))); // NOI18N
        groupGBtn.setOpaque(false);
        groupGBtn.setOpaque(false);
        groupGBtn.setContentAreaFilled( false );
        groupGBtn.setBorder( null );
        groupGBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupGBtnActionPerformed(evt);
            }
        });

        groupHBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixtures/Group buttons/Group buttons/GroupH.png"))); // NOI18N
        groupHBtn.setOpaque(false);
        groupHBtn.setOpaque(false);
        groupHBtn.setContentAreaFilled( false );
        groupHBtn.setBorder( null );
        groupHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupHBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(groupCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(groupABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupEBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(groupABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(groupBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupEBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 340, 530);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.png"))); // NOI18N
        jLayeredPane1.add(bg);
        bg.setBounds(0, 0, 360, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void groupFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupFBtnActionPerformed
        GroupF gF = new GroupF();
        gF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupFBtnActionPerformed

    private void groupABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupABtnActionPerformed
        GroupA gA = new GroupA();
        gA.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupABtnActionPerformed

    private void groupBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupBBtnActionPerformed
        GroupB gB = new GroupB();
        gB.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupBBtnActionPerformed

    private void groupCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupCBtnActionPerformed
        GroupC gC = new GroupC();
        gC.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupCBtnActionPerformed

    private void groupDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupDBtnActionPerformed
        GroupD gD = new GroupD();
        gD.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupDBtnActionPerformed

    private void groupEBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupEBtnActionPerformed
        GroupE gE = new GroupE();
        gE.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupEBtnActionPerformed

    private void groupGBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupGBtnActionPerformed
        GroupG gG = new GroupG();
        gG.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupGBtnActionPerformed

    private void groupHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupHBtnActionPerformed
        GroupH gH = new GroupH();
        gH.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_groupHBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Fixtures f = new Fixtures();
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomeScreen h = new HomeScreen();
        h.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GroupFixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupFixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupFixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupFixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupFixtures().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel fixturesLbl;
    private javax.swing.JButton groupABtn;
    private javax.swing.JButton groupBBtn;
    private javax.swing.JButton groupCBtn;
    private javax.swing.JButton groupDBtn;
    private javax.swing.JButton groupEBtn;
    private javax.swing.JButton groupFBtn;
    private javax.swing.JButton groupGBtn;
    private javax.swing.JButton groupHBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel taskbar;
    // End of variables declaration//GEN-END:variables
}
