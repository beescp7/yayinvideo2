package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller implements Initializable {

	@FXML private CheckBox zeytin;
	@FXML private CheckBox kasar;
	@FXML private CheckBox mantar;
	@FXML private CheckBox sosis;
	@FXML private CheckBox salam;
	@FXML private CheckBox sucuk;
	@FXML private RadioButton nakit;
	@FXML private RadioButton kredikart;
	@FXML private Label siparislbl;
	@FXML
    private ToggleGroup odemetip;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		siparislbl.setText("berkan ");
		
	}
	 
	@FXML
   public void sver(ActionEvent event) {
      String siparis="siparisiniz :";
      String Soncýktý;
      int toplam=0;
       if(zeytin.isSelected())
       {
    	   siparis+="\nzeytin";
    	   toplam+=3;
       }
       if(kasar.isSelected())
       {
    	   siparis+="\nkasar";
    	   toplam+=2;
       }
       if(mantar.isSelected())
       {
    	   siparis+="\nmantar";
    	   toplam+=4;
       }
       if(sosis.isSelected())
       {
    	   siparis+="\nsosis";
    	   toplam+=6;
       }
       if(salam.isSelected())
       {
    	   siparis+="\nsalam";
    	   toplam+=1;
       }
       if(sucuk.isSelected())
       {
    	   siparis+="\nsucuk";
    	   toplam+=2;
       }
       if(nakit.isSelected())
    	   siparis+="\nOdeme Tipiniz Nakit ";
       if(kredikart.isSelected())
    	   siparis+="\nOdeme Tipiniz Kredi Karti";
       Soncýktý=siparis+Integer.toString(toplam);
       
       this.siparislbl.setText(Soncýktý);
    }

}
