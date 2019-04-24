import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 
public class Principal extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }
 
    @Override
    public void start(Stage stage)
    {
        // Create the Text
        Label textNombre = new Label("Introduce tu nombre:");
        TextField nombre = new TextField();
        Label textEdad = new Label("Introduce tu nombre:");
        TextField edad = new TextField();
        Button b1 = new Button("_Crear");

        
        VBox root = new VBox(textNombre,nombre,textEdad,edad,b1);
        b1.setOnAction(e -> {
      Person p = new Person();
      p.setName(nombre.getText());
      p.setAge(Integer.parseInt(edad.getText()));
		});
        Scene scene = new Scene(root);
         
       
        stage.setX(100);
        stage.setY(200);
        stage.setMinHeight(300);
        stage.setMinWidth(400);
 
        stage.setScene(scene);

        stage.show();
    }
 
}
