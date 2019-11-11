/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class UTSFrame extends JFrame{
    private JLabel lblNama;
    private JTextField txtNama;
    private JLabel lblKelamin;
    private JRadioButton radioBtnLaki;
    private JRadioButton radioBtnPerempuan;
    private JLabel lblAngkatan;
    private JComboBox cmbAngkatan;
    private JLabel lblHobi;
    private JCheckBox chkhobia;
    private JCheckBox chkhobib;
    private JCheckBox chkhobic;

    private JButton btnSubmit;
    
    private JPanel p;
    private ButtonGroup btnGrup;
    
    public UTSFrame(){
        lblNama = new JLabel();
        txtNama = new JTextField();
        lblKelamin = new JLabel();
        radioBtnLaki = new JRadioButton();
        radioBtnPerempuan = new JRadioButton();
        lblAngkatan = new JLabel();
        cmbAngkatan = new JComboBox();
        lblHobi = new JLabel();
        chkhobia = new JCheckBox();
        chkhobib = new JCheckBox();
        chkhobic = new JCheckBox();
        btnSubmit = new JButton();
        
        p = new JPanel();
        btnGrup = new ButtonGroup();
        
        this.setTitle("Aplikasi Mahasiswa");
        
        lblNama.setText("Nama");
        txtNama.setColumns(20);
        lblKelamin.setText("Kelamin");
        radioBtnLaki.setText("Laki-Laki");
        radioBtnPerempuan.setText("Perempuan");
        lblAngkatan.setText("Angkatan");
        cmbAngkatan.addItem("TL");
        cmbAngkatan.addItem("IF");
        cmbAngkatan.addItem("TP");
        lblHobi.setText("Hobi");
        chkhobia.setText("Berenang");
        chkhobib.setText("Belajar");
        chkhobic.setText("Berdaya");
        btnSubmit.setText("Submit");
        
        btnGrup.add(radioBtnLaki);
        btnGrup.add(radioBtnPerempuan);
        
        p.add(lblNama);
        p.add(txtNama);
        p.add(lblKelamin);
        p.add(radioBtnLaki);
        p.add(radioBtnPerempuan);
        p.add(lblAngkatan);
        p.add(cmbAngkatan);
        p.add(lblHobi);
        p.add(chkhobia);
        p.add(chkhobib);
        p.add(chkhobic);
        p.add(btnSubmit);
        
        getContentPane().add(p);
        pack();
        
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidasi()){
                    showItem();
                } else{
                    JOptionPane.showMessageDialog(null, "Data tidak lengkap");
                }
            }
        });

    }
    
    public boolean isValidasi(){
        if(!txtNama.getText().isEmpty()){
            if (radioBtnLaki.isSelected() || radioBtnPerempuan.isSelected()){
               if(cmbAngkatan.getSelectedItem().equals("TL") || cmbAngkatan.getSelectedItem().equals("IF") || cmbAngkatan.getSelectedItem().equals("TP")){
                    if(chkhobia.isSelected()|| chkhobib.isSelected() || chkhobic.isSelected()){
                        return true;
                    }
                }
            }
        }
       return false;
    }
    
    public void showItem(){
       String nama = txtNama.getText();
       String kelamin = "";
       if (radioBtnLaki.isSelected()) {
             kelamin = radioBtnLaki.getText();
       } else {
             kelamin = radioBtnPerempuan.getText();
       }
       String angkatan = "";
       angkatan = (String) cmbAngkatan.getSelectedItem();
       
       String hobia = "";
       String hobib = "";
       String hobic = "";
       
       if(chkhobia.isSelected()){
          hobia = chkhobia.getText();
       } else {
          hobia = "";
       }
       
       if(chkhobib.isSelected()){
          hobib = chkhobib.getText();
       } else {
          hobib = "";  
       }
       
       if(chkhobic.isSelected()){
          hobic = chkhobic.getText();
       } else {
          hobic = "";
       }
 
       JOptionPane.showMessageDialog(null, "Nama : " + nama + "\nKelamin : " + kelamin + "\nAngkatan : " + angkatan + "\nHobi : " + hobia + "" + hobib + "" +hobic);
    }
    
    
    public static void main(String[] args) {
        new UTSFrame().setVisible(true);
    }
}
