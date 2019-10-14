/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author User
 */
public class AngkatanFrame extends JFrame {
    private JLabel lblAngkatan;
    private JButton btnAngkatan;
    private JComboBox cmbAngkatan;
    private JPanel p;
    
    public AngkatanFrame(){
        lblAngkatan = new JLabel();
        btnAngkatan = new JButton();
        cmbAngkatan = new JComboBox();
        p = new JPanel();
        
        lblAngkatan.setText("Angkatan");
        cmbAngkatan.addItem(2012);
        cmbAngkatan.addItem(2013);
        cmbAngkatan.addItem(2014);
        cmbAngkatan.addItem(2015);
        
        btnAngkatan.setText("Hasil");
        
        p.add(lblAngkatan);
        p.add(cmbAngkatan);
        p.add(btnAngkatan);
        
        getContentPane().add(p);
        
        btnAngkatan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, cmbAngkatan.getSelectedItem());
            }
        });
        
        cmbAngkatan.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JOptionPane.showMessageDialog(null, cmbAngkatan.getSelectedItem());
            }
        });
    }
    
    public static void main(String[] args) {
        AngkatanFrame frame = new AngkatanFrame();
        
        frame.pack();
        frame.show();
    }
    
}


