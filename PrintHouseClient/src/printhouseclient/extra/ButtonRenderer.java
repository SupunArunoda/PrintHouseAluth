/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseclient.extra;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Buddhi
 */
public class ButtonRenderer implements TableCellRenderer {

    JButton jButton;

    public ButtonRenderer(JButton button) {
        jButton = button;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        jButton.setVisible(true);
        return jButton;
    }

}
