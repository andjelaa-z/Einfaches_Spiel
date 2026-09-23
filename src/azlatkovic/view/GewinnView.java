package azlatkovic.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GewinnView extends JFrame{
    private JLabel gesamtPunkte;
    private JLabel rundenergebnis;
    private JTextField spielerZahl;
    private JTextField computerZahl;

    private JLabel rundenueberschrift;
    private JLabel gesamtueberschrift;

    private JButton nochEinmal;

    public GewinnView(){
        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel(new GridLayout(1, 2));
        JPanel rundenPanel = new JPanel(new GridLayout(2, 1));
        JPanel gesamtPanel = new JPanel(new GridLayout(2, 1));
        northPanel.add(rundenPanel);
        northPanel.add(gesamtPanel);

        rundenueberschrift = new JLabel("Rundenergebnis: ");
        rundenPanel.add(rundenueberschrift);
        rundenueberschrift.setHorizontalAlignment(SwingConstants.CENTER);

        gesamtueberschrift = new JLabel("Gesamtpunkte: ");
        gesamtPanel.add(gesamtueberschrift);
        gesamtueberschrift.setHorizontalAlignment(SwingConstants.CENTER);

        rundenergebnis = new JLabel("Tippe eine Zahl von 1 bis 9");
        rundenergebnis.setOpaque(true);
        rundenergebnis.setBackground(Color.WHITE);
        rundenergebnis.setHorizontalAlignment(SwingConstants.CENTER);
        rundenPanel.add(rundenergebnis);

        gesamtPunkte = new JLabel("Gesamtpunkte: 30");
        gesamtPunkte.setOpaque(true);
        gesamtPunkte.setBackground(Color.WHITE);
        gesamtPunkte.setHorizontalAlignment(SwingConstants.CENTER);
        gesamtPanel.add(gesamtPunkte);

        add(northPanel, BorderLayout.NORTH);



        JPanel inputsPanel = new JPanel(new GridLayout(1, 2));

        JPanel spielerPanel = new JPanel((new GridLayout(2, 1)));
        JPanel computerPanel = new JPanel(new GridLayout(2, 1));

        JLabel spieler = new JLabel("Deine Zahl: ");
        JLabel computer = new JLabel("Computerzahl: ");
        spieler.setHorizontalAlignment(SwingConstants.CENTER);
        computer.setHorizontalAlignment(SwingConstants.CENTER);

        spielerZahl = new JTextField();
        computerZahl = new JTextField();
        computerZahl.setEditable(false);
        computerZahl.setBackground(Color.WHITE);


        spielerPanel.add(spieler);
        computerPanel.add(computer);
        spielerPanel.add(spielerZahl);
        computerPanel.add(computerZahl);

        inputsPanel.add(spielerPanel);
        inputsPanel.add(computerPanel);

        add(inputsPanel, BorderLayout.CENTER);


        nochEinmal = new JButton("Noch einmal!");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(nochEinmal);

        add(buttonPanel, BorderLayout.SOUTH);

    }
    public void addActionListener(ActionListener listener){
        spielerZahl.addActionListener(listener);
        nochEinmal.addActionListener(listener);
    }
    public static void main(String[] args) {
        GewinnView view = new GewinnView();
        view.setVisible(true);
    }
}
