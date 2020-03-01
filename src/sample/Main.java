package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       //Creating a Path
        Path path = new Path(); Sphere sphere= new Sphere();
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

        sphere.setRadius(50.0);

        sphere.setTranslateX(100);
        sphere.setTranslateY(150);

        sphere.setCullFace(CullFace.FRONT);

        Sphere sphere1 = new Sphere();

        sphere1.setRadius(50.0);

        sphere1.setTranslateY(300);
        sphere1.setTranslateX(150);

        sphere1.setCullFace(CullFace.BACK);

        Sphere sphere2 = new Sphere();
        sphere2.setRadius(50.0);

        sphere2.setTranslateX(500);
        sphere2.setTranslateY(150);

        sphere2.setCullFace(CullFace.NONE);
        //Creating a group element
        Group root = new Group(path, sphere,sphere1,sphere2);
//        Group root1= new Group(sphere)
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

       /*Sphere sphere= new Sphere();
        sphere.setRadius(50.0);

        sphere.setTranslateX(100);
        sphere.setTranslateY(150);

        sphere.setCullFace(CullFace.FRONT);

        Sphere sphere1 = new Sphere();

        sphere1.setRadius(50.0);

        sphere1.setTranslateY(300);
        sphere1.setTranslateX(150);

        sphere1.setCullFace(CullFace.BACK);

        Sphere sphere2 = new Sphere();
         sphere2.setRadius(50.0);

         sphere2.setTranslateX(500);
         sphere2.setTranslateY(150);

         sphere2.setCullFace(CullFace.NONE);

        Group root1 = new Group(sphere,sphere1,sphere2);

        Scene scene1 = new Scene(root1,600,300);

        primaryStage.setScene(scene1);

        primaryStage.show();
*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
