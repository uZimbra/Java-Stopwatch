package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


/**
 *
 * @author Rodrigo
 */
public class app extends javax.swing.JFrame implements Runnable {
    Timer t;
    int hCont = 0, mCont = 0, sCont = 0, msCont = 0;
    String str = "", timerStr = "", msStr = "", lapStr = "";
    int cont = 0;
    
    public app() {
        initComponents();
        t = new Timer(1, acciones);
        reset();
        secondLayer.setVisible(false);
        thirdLayer.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelContador = new javax.swing.JPanel();
        timer = new javax.swing.JLabel();
        milisegundo = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        firstLayer = new javax.swing.JLayeredPane();
        startButton = new javax.swing.JButton();
        secondLayer = new javax.swing.JLayeredPane();
        pauseButton = new javax.swing.JButton();
        lapButton = new javax.swing.JButton();
        thirdLayer = new javax.swing.JLayeredPane();
        continueButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelLap = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timer.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        timer.setText("00:00:00");

        milisegundo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        milisegundo.setText("00");

        javax.swing.GroupLayout painelContadorLayout = new javax.swing.GroupLayout(painelContador);
        painelContador.setLayout(painelContadorLayout);
        painelContadorLayout.setHorizontalGroup(
            painelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContadorLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(timer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(milisegundo)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        painelContadorLayout.setVerticalGroup(
            painelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContadorLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(painelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timer)
                    .addComponent(milisegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getContentPane().add(painelContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 240));

        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        firstLayer.setLayer(startButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout firstLayerLayout = new javax.swing.GroupLayout(firstLayer);
        firstLayer.setLayout(firstLayerLayout);
        firstLayerLayout.setHorizontalGroup(
            firstLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstLayerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(startButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        firstLayerLayout.setVerticalGroup(
            firstLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        secondLayer.setEnabled(false);

        pauseButton.setText("Pause");
        pauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseButtonMouseClicked(evt);
            }
        });

        lapButton.setText("Lap");
        lapButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapButtonMouseClicked(evt);
            }
        });

        secondLayer.setLayer(pauseButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        secondLayer.setLayer(lapButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout secondLayerLayout = new javax.swing.GroupLayout(secondLayer);
        secondLayer.setLayout(secondLayerLayout);
        secondLayerLayout.setHorizontalGroup(
            secondLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondLayerLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lapButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseButton)
                .addGap(14, 14, 14))
        );
        secondLayerLayout.setVerticalGroup(
            secondLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondLayerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(secondLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(pauseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        thirdLayer.setEnabled(false);

        continueButton.setText("Continue");
        continueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueButtonMouseClicked(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        thirdLayer.setLayer(continueButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        thirdLayer.setLayer(resetButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout thirdLayerLayout = new javax.swing.GroupLayout(thirdLayer);
        thirdLayer.setLayout(thirdLayerLayout);
        thirdLayerLayout.setHorizontalGroup(
            thirdLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addContainerGap())
        );
        thirdLayerLayout.setVerticalGroup(
            thirdLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdLayerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(thirdLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelBotoesLayout.createSequentialGroup()
                    .addGap(0, 75, Short.MAX_VALUE)
                    .addComponent(firstLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 75, Short.MAX_VALUE)))
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelBotoesLayout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(secondLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 53, Short.MAX_VALUE)))
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelBotoesLayout.createSequentialGroup()
                    .addGap(0, 44, Short.MAX_VALUE)
                    .addComponent(thirdLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelBotoesLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(firstLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelBotoesLayout.createSequentialGroup()
                    .addGap(0, 22, Short.MAX_VALUE)
                    .addComponent(secondLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelBotoesLayout.createSequentialGroup()
                    .addGap(0, 22, Short.MAX_VALUE)
                    .addComponent(thirdLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
        );

        firstLayer.getAccessibleContext().setAccessibleName("");
        firstLayer.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(painelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 250, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFocusable(false);

        painelLap.setEditable(false);
        painelLap.setColumns(20);
        painelLap.setRows(5);
        painelLap.setAutoscrolls(false);
        painelLap.setBorder(null);
        jScrollPane1.setViewportView(painelLap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 210, 130));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reset() {
        hCont = 0; mCont = 0; sCont = 0; msCont = 0;
        timerStr = "00:00:00"; msStr = "00"; lapStr = "";
        cont = 0;
        painelLap.removeAll();
        painelLap.setText("");
        t.restart();
        t.stop();
        
        display();
    }
    
    private void display() {
        timer.setText(timerStr);
        milisegundo.setText(msStr);
    }
    
    public void setTimerCounter() {
        timerStr = "0";
        
        if (hCont < 10) {
            timerStr = "0" + hCont;
        } else {
            timerStr = "" + hCont;
        }
        
        if (mCont < 10) {
            timerStr += ":0" + mCont;
        } else {
            timerStr += ":" + mCont;
        }
        
        if (sCont < 10) {
            timerStr += ":0" + sCont;
        } else {
            timerStr += ":" + sCont;
        }
    }
    
    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            msCont++; 
            if(msCont > 99) {
                msCont = 0;
                sCont++;
            }
            if(sCont > 59) {
                sCont = 0;
                mCont++;
            }
            if(mCont > 59)
            {
                mCont = 0;
                hCont++;
            }
            setTimerCounter();
            setMsCounter();
            display();
        }
        
    };
    
    public void setMsCounter() {
        msStr = "";
        
        if (msCont < 10) {
            msStr = "0" + msCont;
        } else {
            msStr = "" + msCont;
        }
    }
    
    private void printLap() {
        cont++;
        
        lapStr += "\n" + cont + ") " + timer.getText() + "." + milisegundo.getText() + "\n";
        painelLap.setText(lapStr);
        System.out.println(painelLap.getText());
       
    }
    

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        // TODO add your handling code here:
        firstLayer.setVisible(false);
        secondLayer.setVisible(true);
        t.start();

    }//GEN-LAST:event_startButtonMouseClicked

    private void pauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseButtonMouseClicked
        // TODO add your handling code here:
        secondLayer.setVisible(false);
        thirdLayer.setVisible(true);
        t.stop();
        
    }//GEN-LAST:event_pauseButtonMouseClicked

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        // TODO add your handling code here:
        thirdLayer.setVisible(false);
        firstLayer.setVisible(true);
        reset();
        
    }//GEN-LAST:event_resetButtonMouseClicked

    private void continueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButtonMouseClicked
        // TODO add your handling code here:
        thirdLayer.setVisible(false);
        secondLayer.setVisible(true);
        t.start();
    }//GEN-LAST:event_continueButtonMouseClicked

    private void lapButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapButtonMouseClicked
        printLap();

    }//GEN-LAST:event_lapButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JLayeredPane firstLayer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lapButton;
    private javax.swing.JLabel milisegundo;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelContador;
    private javax.swing.JTextArea painelLap;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLayeredPane secondLayer;
    private javax.swing.JButton startButton;
    private javax.swing.JLayeredPane thirdLayer;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
