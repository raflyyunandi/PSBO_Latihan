/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class CounterBean {
    
//    private void count(){
//         int number = Integer.valueOf(txtInput.getText()) + 1;
//       
//    }
    public int count(JTextField txtInput){
        return Integer.valueOf(txtInput.getText().trim()) + 1;
    }
}
