/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablePackage;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Human
 */
public class TableActionRender extends DefaultTableCellRenderer {
    private JButton button;
    
    public TableActionRender() {
        button = new JButton("Delete");
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean bln1, 
            int i, int il) {
        
        Component com = super.getTableCellRendererComponent(jtable, o, isSelected, bln1, i, il);
        panelAction action = new panelAction();
        if (isSelected == false && i % 2==0){
            action.setBackground(Color.WHITE);
        } else {
            action.setBackground(com.getBackground());
        }
        return action;
    }
    
}
