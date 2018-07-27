/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Toolkit;

/**
 *
 * @author Leo Family
 */
public class Estadisticas_taquillas extends javax.swing.JFrame {

    Genera_taquillas gt = new Genera_taquillas();
    
    public Estadisticas_taquillas() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Estadisticas de las taquillas");
        
        
        
        Boletos_vendidos.setText(String.valueOf(gt.calcula_boletos()));
        Debito_p.setText(String.valueOf(gt.calcula_debito()));
        credito_p.setText(String.valueOf(gt.calcula_credito()));
        efectivo_p.setText(String.valueOf(gt.calcula_efectivo()));
        web_p.setText(String.valueOf(gt.calcula_web()));
        
        Conviasa_v.setText(String.valueOf(gt.conviasa_atendidos()));
        aeropostal_v.setText(String.valueOf(gt.aeropostal_atendidos()));
        aserca_v.setText(String.valueOf(gt.acerca_atendidos()));
        
        setIcon();
    }

    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Boletos_vendidos = new javax.swing.JLabel();
        Debito_p = new javax.swing.JLabel();
        credito_p = new javax.swing.JLabel();
        web_p = new javax.swing.JLabel();
        efectivo_p = new javax.swing.JLabel();
        Conviasa_v = new javax.swing.JLabel();
        aeropostal_v = new javax.swing.JLabel();
        aserca_v = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_main/estadisticas de taquillas.jpg"))); // NOI18N

        Boletos_vendidos.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Boletos_vendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boletos_vendidos.setText("0");

        Debito_p.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Debito_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Debito_p.setText("0");

        credito_p.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        credito_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        credito_p.setText("0");

        web_p.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        web_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        web_p.setText("0");

        efectivo_p.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        efectivo_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        efectivo_p.setText("0");

        Conviasa_v.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Conviasa_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Conviasa_v.setText("0");

        aeropostal_v.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aeropostal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aeropostal_v.setText("0");

        aserca_v.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aserca_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aserca_v.setText("0");

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(web_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Debito_p, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(efectivo_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credito_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Conviasa_v, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aserca_v, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jcMousePanel1Layout.createSequentialGroup()
                            .addComponent(aeropostal_v, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                            .addComponent(Boletos_vendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Boletos_vendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Debito_p, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credito_p, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(web_p, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efectivo_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addComponent(Conviasa_v, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aeropostal_v, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aserca_v, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Estadisticas_taquillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas_taquillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas_taquillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas_taquillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas_taquillas().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes_main/logo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boletos_vendidos;
    private javax.swing.JLabel Conviasa_v;
    private javax.swing.JLabel Debito_p;
    private javax.swing.JLabel aeropostal_v;
    private javax.swing.JLabel aserca_v;
    private javax.swing.JLabel credito_p;
    private javax.swing.JLabel efectivo_p;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel web_p;
    // End of variables declaration//GEN-END:variables
}
