package application;
	
import controller.PaddleController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GameFrame.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			PaddleController controller = loader.getController();
			
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
				
				@Override
				public void handle(KeyEvent event) {
					
					switch(event.getCode()) {
					case W:
					case UP:
						controller.up();
						break;
					case D:
					case DOWN:
						controller.down();
						break;
					default:
						break;
					}
				}
				
			});
			
			Image logo = new Image("logo.png");
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(logo);
			primaryStage.setTitle("Java Pong");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}   
