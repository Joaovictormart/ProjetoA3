package com.mycompany.projetoa3;

import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
//        desativaBotoes();
    }
    
    //Objetos
    ControleJogo controler = new ControleJogo();
    client cliente = new client();
    
    //Variáveis de controle
    private String marcadorClient = controler.getMarcadorClient();
    private String marcadorServer = controler.getMarcadorServer();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Out = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputIP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputPort = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        inputNick = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jogador 1  Simbolo: X");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de Vitorias: 0");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jogador 2  Simbolo: 0");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de Vitorias: 0");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total de Empates: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        Out.setText("Sair da Partida");
        Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IP");

        inputIP.setName(""); // NOI18N
        inputIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIPActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Porta");

        btnConectar.setText("Conectar");
        btnConectar.setToolTipText("");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        Atualizar.setText("Atualizar");
        Atualizar.setName(""); // NOI18N
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Nick");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(inputIP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputPort, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputNick, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Out, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConectar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPort, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNick, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnConectar)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atualizar)
                    .addComponent(Out))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Paineis de jogo
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        char btn= 7;
        if(controler.AtualizaString(cliente.getCharJogo(),btn) == true){
            btn7.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn7ActionPerformed
  
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        char btn= 2;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn2.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        char btn= 4;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn4.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        char btn= 1;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn1.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        char btn= 3;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn3.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        char btn= 6;
        if(controler.AtualizaString(cliente.getCharJogo() ,btn) == true){
            btn6.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        char btn= 5;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn5.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        char btn= 9;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn9.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        char btn= 8;
        if(controler.AtualizaString(cliente.getCharJogo(), btn) == true){
            btn8.setText(marcadorClient);
            desativaBotoes();
            Jogadas();
        }else{
            JOptionPane.showMessageDialog(null,"Este campo já está preenchido");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    
    private void OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutActionPerformed
        
    }//GEN-LAST:event_OutActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        ativaBotoes();

        //Atualiza o painel do jogador 
        //Atualiza apenas um de cada vez
        char[] charJogo = cliente.getCharJogo();
        
        if(charJogo[1]=='C'){btn1.setText(marcadorClient);}
        else if(charJogo[1]=='S'){btn1.setText(marcadorServer);}
        else if(charJogo[2]=='C'){btn2.setText(marcadorClient);}
        else if(charJogo[2]=='S'){btn2.setText(marcadorServer);}
        else if(charJogo[3]=='C'){btn3.setText(marcadorClient);}
        else if(charJogo[3]=='S'){btn3.setText(marcadorServer);}
        else if(charJogo[4]=='C'){btn4.setText(marcadorClient);}
        else if(charJogo[4]=='S'){btn4.setText(marcadorServer);}
        else if(charJogo[5]=='C'){btn5.setText(marcadorClient);}
        else if(charJogo[5]=='S'){btn5.setText(marcadorServer);}
        else if(charJogo[6]=='C'){btn6.setText(marcadorClient);}
        else if(charJogo[6]=='S'){btn6.setText(marcadorServer);}
        else if(charJogo[7]=='C'){btn7.setText(marcadorClient);}
        else if(charJogo[7]=='S'){btn7.setText(marcadorServer);}
        else if(charJogo[8]=='C'){btn8.setText(marcadorClient);}
        else if(charJogo[8]=='S'){btn8.setText(marcadorServer);}
        else if(charJogo[9]=='C'){btn9.setText(marcadorClient);}
        else if(charJogo[9]=='S'){btn9.setText(marcadorServer);}
    }//GEN-LAST:event_AtualizarActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        Conectar();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void inputIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIPActionPerformed

    }//GEN-LAST:event_inputIPActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Out;
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnConectar;
    private javax.swing.JTextField inputIP;
    private javax.swing.JTextField inputNick;
    private javax.swing.JTextField inputPort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
    private void Conectar() {      
        try {
            cliente.primeiraConexao(inputNick.getText(), marcadorClient, inputIP.getText(), inputPort.getText());
        } catch(Exception e){
            e.printStackTrace();
        }
    } 
    private void Jogadas() {      
        try {
            cliente.jogada(controler.getCharJogo());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    private void desativaBotoes() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    private void ativaBotoes() {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }

}
