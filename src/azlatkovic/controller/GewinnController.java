package azlatkovic.controller;

import azlatkovic.model.GewinnModel;

public class GewinnController {
    private GewinnModel model;

    public GewinnController(){
        model = new GewinnModel();

    }

    public void spieleRunde(int spielerZahl){
        model.berechneComputerZahl();
        model.berechneRunde(spielerZahl);
    }




}
