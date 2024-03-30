package com.example;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login to Pills on Wheels");

        // Create UI elements
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // Center the grid
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.setStyle("-fx-background-color: #FAEAE0;");

        //BURKAYY LOGOMUZU YÜKLEYELİM!
        
        Image logo = new Image("file:C:\\Users\\burka\\Desktop\\logo.png");
        ImageView logoo = new ImageView(logo); 
        logoo.setFitWidth(200);
        logoo.setFitHeight(600);
        logoo.setPreserveRatio(true);
        /* Label logoo = new Label("STYLESHEET_CASPIAN");
        logoo.setFont(Font.font("Arial", FontWeight.BOLD, 12));
         */
        GridPane.setConstraints(logoo, 0, 0);
        Label usernameLabel = new Label("Username:");
        usernameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        GridPane.setConstraints(usernameLabel, 0, 1);
        TextField usernameInput = new TextField();
        GridPane.setConstraints(usernameInput, 1, 1);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        GridPane.setConstraints(passwordLabel, 0, 2);
        PasswordField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 2);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: orange;"); 
        GridPane.setConstraints(loginButton, 1, 3);

        // Add UI elements to the grid
        grid.getChildren().addAll(logoo, usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton);

        // Add event handler for login button
        loginButton.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            // Add your login logic here
            if (isValid(username, password)) {
                System.out.println("Login successful");
                // Navigate to the next screen or perform other actions
            } else {
                System.out.println("Invalid username or password");
                // Display error message to the user
            }
        });
        // ... mevcut kodunuz ...

// Logo için GridPane konumlandırmasını ayarlama
GridPane.setConstraints(logoo, 0, 0, 2, 1); // columnSpan ve rowSpan değerleri ekleniyor
GridPane.setHalignment(logoo, HPos.CENTER); // Yatay merkezleme
GridPane.setValignment(logoo, VPos.CENTER); // Dikey merkezleme

// ... mevcut kodunuz ...


        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Dummy method to simulate login validation
    private boolean isValid(String username, String password) {
        // Add your actual login validation logic here
        return username.equals("admin") && password.equals("password");
    }

    public static void main(String[] args) {
        launch(args);
    }
}