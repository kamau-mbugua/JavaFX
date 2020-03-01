package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Creating a Path
        Path path = new Path();
        //Moving to Starting Point
        MoveTo moveTo = new MoveTo(108,71);
        //Creating Lines
        LineTo line1 = new LineTo(321, 161);
        LineTo line2 = new LineTo(126,232);
        LineTo line3= new LineTo(232,52);
        LineTo line4= new LineTo(269,250);
        LineTo line5= new LineTo(108,71);
        //Adding all the elements to the path
        path.getElements().add(moveTo);
        path.getElements().addAll(line1,line2,line3,line4,line5);
        //Creating a group element
        Group root = new Group(path);
        //Creating a scene object
        Scene scene = new Scene(root,600,300);

        //setting Title to the stange
        primaryStage.setTitle("Drawing an arc through a Path");
        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Displaying content of the stage
        primaryStage.show();
      /*  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
