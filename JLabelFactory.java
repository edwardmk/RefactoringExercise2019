import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JLabelFactory {
	public void JLabelMaker(JPanel panelName, String name, JTextField nameOfField, String dimensions) {
		panelName.add(new JLabel(name), "growx, pushx");
		panelName.add(nameOfField = new JTextField(20), dimensions);
	}
}
