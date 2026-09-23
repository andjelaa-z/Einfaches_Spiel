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

        rundenergebnis = new JLabel("");
        rundenergebnis.setOpaque(true);
        rundenergebnis.setBackground(Color.WHITE);
        rundenPanel.add(rundenergebnis);

        gesamtPunkte = new JLabel("");
        gesamtPunkte.setOpaque(true);
        gesamtPunkte.setBackground(Color.WHITE);
        gesamtPanel.add(gesamtPunkte);

        add(northPanel, BorderLayout.NORTH);

        JPanel inputsPanel = new JPanel(new GridLayout(2, 2));

        JLabel spieler = new JLabel("Deine Zahl: ");
        JLabel computer = new JLabel("Computerzahl: ");
        spieler.setHorizontalAlignment(SwingConstants.CENTER);
        computer.setHorizontalAlignment(SwingConstants.CENTER);

        spielerZahl = new JTextField();
        computerZahl = new JTextField();
        computerZahl.setEditable(false);

        inputsPanel.add(spieler);
        inputsPanel.add(computer);
        inputsPanel.add(spielerZahl);
        inputsPanel.add(computerZahl);

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
}
