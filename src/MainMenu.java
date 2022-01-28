
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */ 
public class MainMenu extends javax.swing.JFrame {
    AudioInputStream ais ;
    Clip clip ;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        startgame = new javax.swing.JButton();
        scoreboard = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        exitgame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startgame.setBackground(new java.awt.Color(255, 255, 255));
        startgame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        startgame.setIcon(new javax.swing.ImageIcon("C:\\Users\\sarra\\Documents\\NetBeansProjects\\game\\src\\assets\\start_1.png")); // NOI18N
        startgame.setText("START GAME");
        startgame.setBorder(null);
        startgame.setBorderPainted(false);
        startgame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startgame.setDefaultCapable(false);
        startgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startgameActionPerformed(evt);
            }
        });
        getContentPane().add(startgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 170, 374, 60));

        scoreboard.setBackground(new java.awt.Color(255, 255, 255));
        scoreboard.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        scoreboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\sarra\\Documents\\NetBeansProjects\\game\\src\\assets\\scoreboard_1.png")); // NOI18N
        scoreboard.setText("SCOREBOARD");
        scoreboard.setBorder(null);
        scoreboard.setBorderPainted(false);
        scoreboard.setDefaultCapable(false);
        scoreboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreboardActionPerformed(evt);
            }
        });
        getContentPane().add(scoreboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 250, 374, 60));

        settings.setBackground(new java.awt.Color(255, 255, 255));
        settings.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        settings.setIcon(new javax.swing.ImageIcon("C:\\Users\\sarra\\Documents\\NetBeansProjects\\game\\src\\assets\\settings_1.png")); // NOI18N
        settings.setText("SETTINGS");
        settings.setBorder(null);
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 330, 374, 60));

        exitgame.setBackground(new java.awt.Color(255, 255, 255));
        exitgame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitgame.setIcon(new javax.swing.ImageIcon("C:\\Users\\sarra\\Documents\\NetBeansProjects\\game\\src\\assets\\exit_1.png")); // NOI18N
        exitgame.setText("EXIT GAME");
        exitgame.setBorder(null);
        exitgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitgameActionPerformed(evt);
            }
        });
        getContentPane().add(exitgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 410, 374, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sarra\\Desktop\\game\\Biomes\\Assets\\menuBG.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startgameActionPerformed

        //Download the button sound and play it 
        File file = new File("src\\\\wav\\\\button.wav");
        try {
            ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //create an entername frame
        EnterName frame = null;
        try {
            frame = new EnterName();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException | FontFormatException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.setLocationRelativeTo(null); /* to start"" in the middle instead of the left corner */       
        frame.setResizable(false);
        frame.setVisible(true);       
        frame.setTitle("Enter a username");        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }//GEN-LAST:event_startgameActionPerformed

    private void scoreboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreboardActionPerformed
      
        //button sound 
        File file = new File("src\\\\wav\\\\button.wav");
        try {
            ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //show the scoreboard
        Scoreboard sb;
        try {
            sb = new Scoreboard();
             sb.show();
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_scoreboardActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed

        //button sound 
        File file = new File("src\\\\wav\\\\button.wav");
        try {
            ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_settingsActionPerformed

    private void exitgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitgameActionPerformed
            //button sound 
        File file = new File("src\\\\wav\\\\button.wav");
        try {
            ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
                
// TODO add your handling code here:
        System.out.println("\n Thank you for playing");
        System.exit(0);
    }//GEN-LAST:event_exitgameActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitgame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton scoreboard;
    private javax.swing.JButton settings;
    private javax.swing.JButton startgame;
    // End of variables declaration//GEN-END:variables
}
