package adventskalender1;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Index extends javax.swing.JFrame {
    private static Index instance;

    /**
     * Creates new form Index
     */
    private Index() {
        initComponents();
        this.setResizable(false);
    }

    public static Index getInstance() {
        if (instance == null) {
            synchronized (Index.class) {
                if (instance == null) {
                    instance = new Index();
                }
            }
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lucka3 = new javax.swing.JButton();
        Lucka4 = new javax.swing.JButton();
        Lucka5 = new javax.swing.JButton();
        Lucka1 = new javax.swing.JButton();
        Lucka6 = new javax.swing.JButton();
        Lucka2 = new javax.swing.JButton();
        Lucka9 = new javax.swing.JButton();
        Lucka10 = new javax.swing.JButton();
        Lucka11 = new javax.swing.JButton();
        Lucka7 = new javax.swing.JButton();
        Lucka12 = new javax.swing.JButton();
        Lucka8 = new javax.swing.JButton();
        Lucka15 = new javax.swing.JButton();
        Lucka16 = new javax.swing.JButton();
        Lucka17 = new javax.swing.JButton();
        Lucka13 = new javax.swing.JButton();
        Lucka18 = new javax.swing.JButton();
        Lucka14 = new javax.swing.JButton();
        Lucka21 = new javax.swing.JButton();
        Lucka22 = new javax.swing.JButton();
        Lucka23 = new javax.swing.JButton();
        Lucka19 = new javax.swing.JButton();
        Lucka24 = new javax.swing.JButton();
        Lucka20 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lucka3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka3.setForeground(new java.awt.Color(255, 255, 255));
        Lucka3.setText("3");
        Lucka3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka3.setContentAreaFilled(false);
        Lucka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka3ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 75, 90, 70));

        Lucka4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka4.setForeground(new java.awt.Color(255, 255, 255));
        Lucka4.setText("4");
        Lucka4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka4.setContentAreaFilled(false);
        Lucka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka4ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 75, 90, 70));

        Lucka5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka5.setForeground(new java.awt.Color(255, 255, 255));
        Lucka5.setText("5");
        Lucka5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka5.setContentAreaFilled(false);
        Lucka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka5ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka5, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 75, 90, 70));

        Lucka1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka1.setForeground(new java.awt.Color(255, 255, 255));
        Lucka1.setText("1");
        Lucka1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka1.setContentAreaFilled(false);
        Lucka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka1ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 75, 90, 70));

        Lucka6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka6.setForeground(new java.awt.Color(255, 255, 255));
        Lucka6.setText("6");
        Lucka6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka6.setContentAreaFilled(false);
        Lucka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka6ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka6, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 75, 90, 70));

        Lucka2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka2.setForeground(new java.awt.Color(255, 255, 255));
        Lucka2.setText("2");
        Lucka2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka2.setContentAreaFilled(false);
        Lucka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka2ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 75, 90, 70));

        Lucka9.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka9.setForeground(new java.awt.Color(255, 255, 255));
        Lucka9.setText("9");
        Lucka9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka9.setContentAreaFilled(false);
        Lucka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka9ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka9, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 185, 90, 70));

        Lucka10.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka10.setForeground(new java.awt.Color(255, 255, 255));
        Lucka10.setText("10");
        Lucka10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka10.setContentAreaFilled(false);
        Lucka10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka10ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka10, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 185, 90, 70));

        Lucka11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka11.setForeground(new java.awt.Color(255, 255, 255));
        Lucka11.setText("11");
        Lucka11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka11.setContentAreaFilled(false);
        Lucka11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka11ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka11, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 185, 90, 70));

        Lucka7.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka7.setForeground(new java.awt.Color(255, 255, 255));
        Lucka7.setText("7");
        Lucka7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka7.setContentAreaFilled(false);
        Lucka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka7ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 185, 90, 70));

        Lucka12.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka12.setForeground(new java.awt.Color(255, 255, 255));
        Lucka12.setText("12");
        Lucka12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka12.setContentAreaFilled(false);
        Lucka12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka12ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka12, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 185, 90, 70));

        Lucka8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka8.setForeground(new java.awt.Color(255, 255, 255));
        Lucka8.setText("8");
        Lucka8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka8.setContentAreaFilled(false);
        Lucka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka8ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka8, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 185, 90, 70));

        Lucka15.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka15.setForeground(new java.awt.Color(255, 255, 255));
        Lucka15.setText("15");
        Lucka15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka15.setContentAreaFilled(false);
        Lucka15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka15ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka15, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 295, 90, 70));

        Lucka16.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka16.setForeground(new java.awt.Color(255, 255, 255));
        Lucka16.setText("16");
        Lucka16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka16.setContentAreaFilled(false);
        Lucka16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka16ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka16, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 295, 90, 70));

        Lucka17.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka17.setForeground(new java.awt.Color(255, 255, 255));
        Lucka17.setText("17");
        Lucka17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka17.setContentAreaFilled(false);
        Lucka17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka17ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka17, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 295, 90, 70));

        Lucka13.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka13.setForeground(new java.awt.Color(255, 255, 255));
        Lucka13.setText("13");
        Lucka13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka13.setContentAreaFilled(false);
        Lucka13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka13ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka13, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 295, 90, 70));

        Lucka18.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka18.setForeground(new java.awt.Color(255, 255, 255));
        Lucka18.setText("18");
        Lucka18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka18.setContentAreaFilled(false);
        Lucka18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka18ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka18, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 295, 90, 70));

        Lucka14.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka14.setForeground(new java.awt.Color(255, 255, 255));
        Lucka14.setText("14");
        Lucka14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka14.setContentAreaFilled(false);
        Lucka14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka14ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka14, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 295, 90, 70));

        Lucka21.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka21.setForeground(new java.awt.Color(255, 255, 255));
        Lucka21.setText("21");
        Lucka21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka21.setContentAreaFilled(false);
        Lucka21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka21ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka21, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 405, 90, 70));

        Lucka22.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka22.setForeground(new java.awt.Color(255, 255, 255));
        Lucka22.setText("22");
        Lucka22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka22.setContentAreaFilled(false);
        Lucka22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka22ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka22, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 405, 90, 70));

        Lucka23.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka23.setForeground(new java.awt.Color(255, 255, 255));
        Lucka23.setText("23");
        Lucka23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka23.setContentAreaFilled(false);
        Lucka23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka23ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka23, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 405, 90, 70));

        Lucka19.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka19.setForeground(new java.awt.Color(255, 255, 255));
        Lucka19.setText("19");
        Lucka19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka19.setContentAreaFilled(false);
        Lucka19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka19ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka19, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 405, 90, 70));

        Lucka24.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka24.setForeground(new java.awt.Color(255, 255, 255));
        Lucka24.setText("24");
        Lucka24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka24.setContentAreaFilled(false);
        Lucka24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka24ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka24, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 405, 90, 70));

        Lucka20.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Lucka20.setForeground(new java.awt.Color(255, 255, 255));
        Lucka20.setText("20");
        Lucka20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lucka20.setContentAreaFilled(false);
        Lucka20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucka20ActionPerformed(evt);
            }
        });
        getContentPane().add(Lucka20, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 405, 90, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventskalender1/j23.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 551));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lucka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka1ActionPerformed
        Dag1.Lucka1();
    }//GEN-LAST:event_Lucka1ActionPerformed

    private void Lucka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka3ActionPerformed
        Dag3.Lucka3();
    }//GEN-LAST:event_Lucka3ActionPerformed
                                         
    private void Lucka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka5ActionPerformed
        Dag5.Lucka5();
    }//GEN-LAST:event_Lucka5ActionPerformed

    private void Lucka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka2ActionPerformed
        Dag2.Lucka2();
    }//GEN-LAST:event_Lucka2ActionPerformed

    private void Lucka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka9ActionPerformed
        Dag9.Lucka9();
    }//GEN-LAST:event_Lucka9ActionPerformed

    private void Lucka11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka11ActionPerformed
        Dag11.Lucka11();
    }//GEN-LAST:event_Lucka11ActionPerformed

    private void Lucka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka7ActionPerformed
        Dag7.Lucka7();
    }//GEN-LAST:event_Lucka7ActionPerformed

    private void Lucka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka8ActionPerformed
        Dag8.Lucka8();
    }//GEN-LAST:event_Lucka8ActionPerformed

    private void Lucka15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka15ActionPerformed
        Dag15.Lucka15();
    }//GEN-LAST:event_Lucka15ActionPerformed

    private void Lucka17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka17ActionPerformed
        Dag17.Lucka17();
    }//GEN-LAST:event_Lucka17ActionPerformed

    private void Lucka13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka13ActionPerformed
        Dag13.Lucka13();
    }//GEN-LAST:event_Lucka13ActionPerformed

    private void Lucka14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka14ActionPerformed
        Dag14.Lucka14();
    }//GEN-LAST:event_Lucka14ActionPerformed

    private void Lucka21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka21ActionPerformed
        Dag21.Lucka21();
    }//GEN-LAST:event_Lucka21ActionPerformed

    private void Lucka23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka23ActionPerformed
        Dag23.Lucka23();
    }//GEN-LAST:event_Lucka23ActionPerformed

    private void Lucka19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka19ActionPerformed
        Dag19.Lucka19();
    }//GEN-LAST:event_Lucka19ActionPerformed

    private void Lucka20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka20ActionPerformed
        Dag20.Lucka20();
    }//GEN-LAST:event_Lucka20ActionPerformed

    private void Lucka24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka24ActionPerformed
        try {
            Dag24.Lucka24();
        } catch (MalformedURLException | InterruptedException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Lucka24ActionPerformed

    private void Lucka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka4ActionPerformed
        Dag4.Lucka4();
    }//GEN-LAST:event_Lucka4ActionPerformed

    private void Lucka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka6ActionPerformed
        Dag6.Lucka6();
    }//GEN-LAST:event_Lucka6ActionPerformed

    private void Lucka10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka10ActionPerformed
        Dag10.Lucka10();
    }//GEN-LAST:event_Lucka10ActionPerformed

    private void Lucka16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka16ActionPerformed
        Dag16.Lucka16();
    }//GEN-LAST:event_Lucka16ActionPerformed

    private void Lucka12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka12ActionPerformed
        Dag12.Lucka12();
    }//GEN-LAST:event_Lucka12ActionPerformed

    private void Lucka18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka18ActionPerformed
        Dag18.Lucka18();
    }//GEN-LAST:event_Lucka18ActionPerformed

    private void Lucka22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucka22ActionPerformed
        Dag22.Lucka22();
    }//GEN-LAST:event_Lucka22ActionPerformed
    
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getInstance().setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lucka1;
    private javax.swing.JButton Lucka10;
    private javax.swing.JButton Lucka11;
    private javax.swing.JButton Lucka12;
    private javax.swing.JButton Lucka13;
    private javax.swing.JButton Lucka14;
    private javax.swing.JButton Lucka15;
    private javax.swing.JButton Lucka16;
    private javax.swing.JButton Lucka17;
    private javax.swing.JButton Lucka18;
    private javax.swing.JButton Lucka19;
    private javax.swing.JButton Lucka2;
    private javax.swing.JButton Lucka20;
    private javax.swing.JButton Lucka21;
    private javax.swing.JButton Lucka22;
    private javax.swing.JButton Lucka23;
    private javax.swing.JButton Lucka24;
    private javax.swing.JButton Lucka3;
    private javax.swing.JButton Lucka4;
    private javax.swing.JButton Lucka5;
    private javax.swing.JButton Lucka6;
    private javax.swing.JButton Lucka7;
    private javax.swing.JButton Lucka8;
    private javax.swing.JButton Lucka9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}