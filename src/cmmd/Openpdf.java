/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmmd;

import Database.InventoryUtils;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Faith
 */

public class Openpdf {

    public static void OpenId(String id) {
        try {
            String filePath = InventoryUtils.billpath + File.separator + id + ".pdf";
            File pdfFile = new File(filePath);
            if (pdfFile.exists()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist: " + filePath);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
