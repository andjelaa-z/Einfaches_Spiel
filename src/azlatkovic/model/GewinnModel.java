package azlatkovic.model;

import java.util.Random;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel(){
        gesamtPunkte = 30;
    }
    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl(){
        Random random = new Random();
        this.computerZahl = random.nextInt(9)+1;
    }
    public void berechneRunde(int spielerZahl){
        if(spielerZahl < 1 || spielerZahl > 9){
            return;
        }
        this.spielerZahl = spielerZahl;
        if(spielerZahl == this.computerZahl ){
            this.rundenErgebnis = 20;
            this.gesamtPunkte = this.gesamtPunkte + 20;
        }
        else if((spielerZahl-computerZahl == 1) || (computerZahl-spielerZahl == 1)){
            this.rundenErgebnis = 5;
            this.gesamtPunkte = this.gesamtPunkte + 5;
        }
        else{
            this.rundenErgebnis = -10;
            this.gesamtPunkte = this.gesamtPunkte - 10;
        }
    }
    public boolean hatGewonnen(){
        if(this.gesamtPunkte >= 100){
            return true;
        }
        return false;
    }
    public boolean hatVerloren(){
        if(this.gesamtPunkte <= 0){
            return true;
        }
        return false;
    }

}
