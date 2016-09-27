/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author amoreno15
 */
public class Helper {

    public static void HabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }

    }

    public static void DeshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }

    }

    public static String RecibirDatos(Components ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(aux);
        return aux;
    }

    public static void limpiarTabla(JTable tabla) {
        int nFilas, nColumnas;
        nFilas = tabla.getColumnCount();
        nColumnas = tabla.getRowCount();
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                
                tabla.setValueAt("", i, j);
                
            }
            
        }
    }
    
    public static void TablaPorDefecto(JTable tabla){
        
        DefaultTableModel tm1;
        
        tm = (DefaultTableModel) tabla.getModel();
        
        tm.setColumnCount;
        
    }
}
