import javax.swing.*;


public class ApplicationStart {

    public static void main(String[] args) {
        //Creating Window containing application
        JFrame frame = new JFrame("TestComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 120);

        //Creating Panel containing other elements
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        //Creating TextArea which will show our information about selected location
        JTextArea infoText = new JTextArea();
        infoText.setEditable(false);

        /* Set focusable to false if we don't want select text and looks slightly better
         * but for kept true for selecting and copy data.
         */
        //infoText.setFocusable(false);

        //Creating ComboBox containing locations
        JComboBox areaSelection = new JComboBox();
        areaSelection.setRenderer(new ComboBoxCustomRenderer());

        //Sort data by GROUP that can be used as delimiter
//        Map<String, Object>[] comboBoxData = TestComboBox.getDbData();
//        List<Map<String, Object>> sortedComboBoxData= Arrays.stream(comboBoxData).sorted((o1, o2) -> o1.get("GROUP").toString().
//                        compareTo(o2.get("GROUP").toString())).
//                toList();

        //Filling ComboBox with our locations data
        Object delimiter = "";
        for (var row : TestComboBox.getDbData()) {
            if (!delimiter.equals(row.get("GROUP"))) {
                delimiter = row.get("GROUP");
                areaSelection.addItem(row.get("GROUP"));
            }
            areaSelection.addItem(row);
        }

        //Adding listener to ComboBox which will display information about selected location in TextArea
        areaSelection.addActionListener(e -> infoText.setText(areaSelection.getSelectedItem().toString()));

        mainPanel.add(infoText);
        mainPanel.add(areaSelection);
        frame.add(mainPanel);

        frame.setVisible(true);
    }
}