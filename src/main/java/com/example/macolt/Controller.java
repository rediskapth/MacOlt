package com.example.macolt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button actionButton;

    @FXML
    private TextField inMac;

    @FXML
    private TextField outMac;

    @FXML
    void initialize() {

        actionButton.setOnAction(event -> {
//            String inTxt = inMac.getText().strip();
            String inTxt = inMac.getText().trim();
            String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
            if(inTxt.matches(regex)) {
                if(inTxt.charAt(2) == ':') {
                    String[] inps = inTxt.split(":");
                    String result = inps[0] + "" + inps[1] + "." +
                            inps[2] + "" + inps[3] + "." +
                            inps[4] + "" + inps[5];
                    outMac.setText(result);
                }
                if(inTxt.charAt(2) == '-') {
                    String[] inps = inTxt.split("-");
                    String result = inps[0] + "" + inps[1] + "." +
                            inps[2] + "" + inps[3] + "." +
                            inps[4] + "" + inps[5];
                    outMac.setText(result);
                }
            }
        });
    }

}
