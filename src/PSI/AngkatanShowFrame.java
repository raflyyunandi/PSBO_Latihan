/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class AngkatanShowFrame extends JFrame{
    private JLabel lblAngkatan;
    private JButton btnAngkatan;
    private JComboBox<Integer> cmbAngkatan;
    private JPanel p;
    
    public AngkatanShowFrame(){
    lblAngkatan = new JLabel();
    btnAngkatan = new JButton();
    cmbAngkatan = new JComboBox();
    p = new JPanel();
    
    lblAngkatan.setText("Angkatan");
    cmbAngkatan.addItem(2012);
    cmbAngkatan.addItem(2013);
    cmbAngkatan.addItem(2014);
    cmbAngkatan.addItem(2015);
    btnAngkatan.setText("Submit");
    
    
    getContentPane().add(p);
    
        pack();
    
        p.add(lblAngkatan);
        p.add(cmbAngkatan);
        p.add(btnAngkatan);
    
    btnAngkatan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, cmbAngkatan.getSelectedItem());
        }
    });
    
    cmbAngkatan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox cmbSelected = (JComboBox) e.getSource();
            String itemSelected = cmbSelected.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, itemSelected);
        }
    });
    
    }
    
    public static void main(String[] args) {
        AngkatanShowFrame frame = new AngkatanShowFrame();
        
        frame.setVisible(true);
    }
    
}
