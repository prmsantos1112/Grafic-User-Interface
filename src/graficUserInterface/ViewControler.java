package graficUserInterface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewControler {
	
	@FXML
	private Button btClick;
	
	@FXML
	public void onBtClickAction() {
		System.out.println("Clicked");
	}

}
