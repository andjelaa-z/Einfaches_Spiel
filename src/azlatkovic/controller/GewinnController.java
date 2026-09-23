package azlatkovic.controller;

import azlatkovic.model.GewinnModel;
import azlatkovic.view.GewinnView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GewinnController implements ActionListener {
    private GewinnModel model;
    private GewinnView view;

    public GewinnController(){
        model = new GewinnModel();
        view = new GewinnView();

        view.addActionListener(this);
        view.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getSpielerZahlField()){
            try{
                int spielerZahl = Integer.parseInt(view.getSpielerZahl());

                if(spielerZahl < 1 || spielerZahl > 9){
                    return;
                }

                model.berechneComputerZahl();
                model.berechneRunde(spielerZahl);

                view.setComputerZahl(model.getComputerZahl());
                view.setRundenergebnis(model.getRundenErgebnis(), model.hatGewonnen(), model.hatVerloren());
                view.setGesamtPunkte(model.getGesamtPunkte());

                view.setFarben(model.getRundenErgebnis(), model.hatGewonnen(), model.hatVerloren());

                if(model.hatGewonnen() || model.hatVerloren()){
                    view.spielerZahlDisabled();
                    view.setButtonEnabled(false);

                }else{
                    view.spielerZahlDisabled();
                    view.setButtonEnabled(true);
                }

            }catch(NumberFormatException ex){

            }

        }
        if(e.getSource() == view.getButton()){
            view.rundeloeschen();
        }
    }
    public static void main(String[] args) {
        new GewinnController();
    }
}
