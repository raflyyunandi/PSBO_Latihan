/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class CounterFrame_Old2 extends JFrame{
    private JTextField txtInput;
    private JTextField txtHasil;
    private JButton btnHasil;
    private JPanel p;
    
    public CounterFrame_Old2(){
        txtInput = new JTextField();
        txtHasil = new JTextField();
        btnHasil = new JButton();
        p = new JPanel();
        
        txtInput.setColumns(20);
        txtHasil.setColumns(20);
        btnHasil.setText("Hasil ++");
        
        p.add(txtInput);
        p.add(txtHasil);
        p.add(btnHasil);
        
        getContentPane().add(p);
        pack();
        
        btnHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                if(isValidasi()){
                    count();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Empty");
                }
            }
        });
    
    }
    
    private void count(){
         int number = Integer.valueOf(txtInput.getText()) + 1;
         txtHasil.setText(Integer.toString(number));
    }
    
    private boolean isValidasi(){
        if (!txtInput.getText().isEmpty()){
            return false;
        }
        return true;
    }
}
