import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ComboBoxCustomRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        if (value instanceof String) {
            JLabel label = new JLabel(value.toString());
            Font f = label.getFont();
            label.setFont(f.deriveFont(f.getStyle()
                    | Font.BOLD | Font.ITALIC));
            return label;
        }else {
            super.getListCellRendererComponent(list, ((Map<String, Object>) value).get("NAME"), index, isSelected, cellHasFocus);
            return this;
        }
    }
}
