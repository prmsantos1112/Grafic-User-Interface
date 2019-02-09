package graficUserInterface;

import graficUserInterface.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewControler {
	
	@FXML
	private Button btClick;
	
	@FXML
	public void onBtClickAction() {
		Alerts.showAlert("Alert Title", "Alert Header", "Hello", AlertType.ERROR);
	}

}
