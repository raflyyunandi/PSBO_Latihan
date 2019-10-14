/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class RadioButtonFrame extends JFrame{
    private JRadioButton rbL;
    private JRadioButton rbP;
    private JPanel p;
    
    private ButtonGroup btnGrup;
    
    public RadioButtonFrame(){
        rbL = new JRadioButton();
        rbP = new JRadioButton();
        p = new JPanel();
        
        btnGrup = new ButtonGroup();
        
        rbL.setText("Laki-Laki");
        rbP.setText("Perempuan");
        
        btnGrup.add(rbL);
        btnGrup.add(rbP);
        
        p.add(rbL);
        p.add(rbP);
        
        getContentPane().add(p);
        
        pack();
        
        rbL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Laki-Laki");
            }
        });
        
        rbP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Perempuan");
            }
        });
    }
    
    public static void main(String[] args) {
    RadioButtonFrame frame = new RadioButtonFrame();
    frame.setVisible(true);
    }
}
