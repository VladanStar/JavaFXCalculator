package sample;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorStage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // postavljamo VBox layout i postavljamo verikalno rastojanje izmedju cvorova unutar njega
        VBox root = new VBox();
        root.setSpacing(20);
        String[] signArr = new String[]{"7", "8", "9",
                "4", "5", "6",
                "3", "2", "1",
                ".", "0", "="};
        String[] opArr = new String[]{
                "+", "-", "x", "/"
        };
        // kreiramo textField i postavljamo mu visinu i poravnanje
        TextField display = new TextField();
        display.setMinHeight(40);
        display.setMaxHeight(40);
        display.setAlignment(Pos.CENTER);
        // kreiramo gridPane container
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(8);
        grid.setVgap(8);
        int signInd = 0;

        // dodavanje dugmica kroz for petlju
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                CalcButton bTmp = new CalcButton(signArr[signInd]);
                grid.add(bTmp, j, i);
                signInd++;
            }
        }
        for (int i = 0; i < opArr.length; i++) {
            Button bTmp = new Button(opArr[i]);
            bTmp.setMinSize(65, 25);
            bTmp.setMaxSize(65, 25);
            grid.add(bTmp, 4, i);
        }

        // stavljanje textField-a u root container
        root.getChildren().add(display);
        // stavljanje grid container unutar root-a
        root.getChildren().add(grid);
        // podesavamo scenu tako sto joj prosledjujemo koreni container i dimenzije
        Scene scene = new Scene(root, 320, 250);

        // podasavanje glavnog stage-a
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
