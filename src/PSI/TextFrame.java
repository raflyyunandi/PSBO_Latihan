/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author User
 */
public class TextFrame extends JFrame {
    private JTextField txtInput;
    private JTextField txtOutput;
    private JTextField txtKey;    
    private JLabel lblInput;
    private JPanel p;
    
    public TextFrame(){
        txtInput = new JTextField();
        txtOutput = new JTextField();
        txtKey = new JTextField();
        lblInput = new JLabel();
        p = new JPanel();
        
        lblInput.setText("Masukan Input");
        txtInput.setColumns(20);
        txtOutput.setColumns(20);
        txtKey.setColumns(20);
            
        txtOutput.setEnabled(false);
        txtKey.setEnabled(false);
        
        p.add(lblInput);
        p.add(txtInput);
        p.add(txtOutput);
        p.add(txtKey);
        
        getContentPane().add(p);
        
        pack();
        
        txtInput.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                txtOutput.setText(txtInput.getText());
            }
        });
        
        txtInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String charStr = Character.toString(e.getKeyChar());
                txtKey.setText(charStr);
            }
        });
        
   
    }
    
    public static void main(String[] args) {
        TextFrame frame = new TextFrame();
        frame.setVisible(true);
    }
}
