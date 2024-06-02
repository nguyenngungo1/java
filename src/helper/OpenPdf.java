/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import dao.Chtlutils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Pecision
 */
public class OpenPdf {
    public static void OpenById(String Id) {
    try {
        File file = new File(Chtlutils.billpath + Id + ".pdf");
        if (file.exists()) {
            Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + Chtlutils.billpath+""+Id+".pdf");
        } else {
            JOptionPane.showMessageDialog(null, "Hóa đơn không tồn tại");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
        
    
    
    
    

