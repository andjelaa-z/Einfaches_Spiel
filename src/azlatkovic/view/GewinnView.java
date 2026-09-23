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







    }
}
