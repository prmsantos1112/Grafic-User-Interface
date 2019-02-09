package graficUserInterface;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewControlerPerson implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson;

	@FXML
	private Button brAll;

	private ObservableList<Person> observList;

	@FXML
	public void onBtAllAction() {

		for (Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
	}

	@FXML
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		List<Person> list = new ArrayList<>();

		list.add(new Person(1, "Paulo Ricardo", "prmsantosster@gmail.com"));
		list.add(new Person(2, "Octaviano Costa", "octaviano@gmail.com"));
		list.add(new Person(3, "Catharine Zetta", "catharine@gmail.com"));
		list.add(new Person(4, "Sula Miranda", "miranda@gmail.com"));
		list.add(new Person(5, "Sergio Reis", "sergioreis@gmail.com"));
		list.add(new Person(6, "Paulo Eduardo", "eduardo@gmail.com"));
		list.add(new Person(7, "Ricardo Augusto", "ricardo@gmail.com"));
		list.add(new Person(8, "Breno Eduardo", "brenoedu@gmail.com"));
		list.add(new Person(9, "Tom Hanks", "tom@gmail.com"));
		list.add(new Person(10, "Camila Mortagua", "mortagua@gmail.com"));


		observList = FXCollections.observableArrayList(list);
		comboBoxPerson.setItems(observList);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {

			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};

		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));

	}

}
