import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
@FXML Button getResult;
@FXML ImageView i1;
@FXML ImageView i2;
@FXML Label resultLabel;
public void handleButtonAction(ActionEvent event){
	int num1 = (int) Math.rint(Math.random() * 2);
	int num2 = (int) Math.rint(Math.random() * 2);//0石头，1剪刀，2布
	int result = 0;//0为平局，1为num1赢，2为num2赢
	if(num1==0){
		Image stone = new Image("image/stone.jpg");
		i1.setImage(stone);
		i1.setVisible(true);
	}
	if(num1==1){
		Image scissor = new Image("image/scissor.jpg");
		i1.setImage(scissor);
		i1.setVisible(true);
	}
	if(num1==2){
		Image close = new Image("image/cloth.jpg");
		i1.setImage(close);
		i1.setVisible(true);
	}
	if(num2==0){
		Image stone = new Image("image/stone.jpg");
		i2.setImage(stone);
		i2.setVisible(true);
	}
	if(num2==1){
		Image scissor = new Image("image/scissor.jpg");
		i2.setImage(scissor);
		i2.setVisible(true);
	}
	if(num2==2){
		Image close = new Image("image/cloth.jpg");
		i2.setImage(close);
		i2.setVisible(true);
	}
	if(num1==num2){
		result = 0;
	}
	if(num1==0&&num2==1){
		result = 1;
	}
	if(num1==0&&num2==2){
		result = 2;
	}
	if(num1==1&&num2==0){
		result = 2;
	}
	if(num1==1&&num2==2){
		result = 1;
	}
	if(num1==2&&num2==0){
		result = 1;
	}
	if(num1==2&&num2==1){
		result = 2;
	}
	if(result==0){
		resultLabel.setText("  Even!");
	}
	if(result==1){
		resultLabel.setText("  Catty Win!");
	}
	if(result==2){
		resultLabel.setText("  Susan Win!");
	}
}
}
