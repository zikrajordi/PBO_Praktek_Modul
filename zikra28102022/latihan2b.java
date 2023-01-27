/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra28102022;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class latihan2b {
     public static void main(String[] args) {
         final int jumData=10;
            int [] arrData = new int [jumData];
            for (int x=0;x<jumData;x++){arrData[x]=Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai"+(x+1)));
            }
            int terbesar=arrData[0];
            for (int x=1;x<jumData;x++){
                if(arrData[x]>terbesar){
                terbesar=arrData[x];
                }
            }
            JOptionPane.showMessageDialog(null,"Nilai terbesar adalah" +terbesar);
    }
}
