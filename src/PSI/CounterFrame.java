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
public class CounterFrame extends JFrame{
    private JTextField txtInput;
    private JTextField txtHasil;
    private JButton btnHasil;
    private JPanel p;
    
    private int number;
    
    public CounterFrame(){
        txtInput = new JTextField();
        txtHasil = new JTextField();
        btnHasil = new JButton();
        p = new JPanel();
        
        
        txtInput.setColumns(20);
        txtHasil.setColumns(20);
        btnHasil.setText("Hasil ++");
        
        p.add(txtInput);
        p.add(btnHasil);
        p.add(txtHasil);
        
        getContentPane().add(p);
        pack();
        
        btnHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                if(isValidasi()){
                    number = new CounterBean().count(txtInput);
                    showCount();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Empty");
                }
            }
        });
    
    }
    
    
    private void showCount(){
          txtHasil.setText(Integer.toString(number));
    }
    
    
    private boolean isValidasi(){
        if (!txtInput.getText().isEmpty()){
            return true;
        }
        return false;
    }
}
