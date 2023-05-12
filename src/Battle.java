import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battle extends JFrame implements ActionListener{
    private Player players[];
    private JFrame battle;
    private JPanel panel1;
    private JButton fightButton;
    private JButton bagButton;
    private JButton GTFOButton;
    private JButton pokemonButton;
    private JTextArea textArea1;
    private ImageIcon battleScreen;
    private JLabel pictureLabel;


    Battle(){
        setContentPane(panel1);
        setTitle("Basic GUI");
        setSize(600,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ImageIcon bg = new ImageIcon(getClass().getResource("/resources/pokemon.jpg"));
        pictureLabel = new JLabel(bg);
        pictureLabel.setBounds(-225,-10,1000,500);
        //pictureLabel.setVisible(true);

        fightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.squirtle.getHp()>0) {
                    System.out.println("Charmander Used Ember:");
                    Main.ember.attack(Main.charmander, Main.squirtle);

                    System.out.println("Squirtle HP: " + Main.squirtle.getHp());
                }else{
                    System.out.println("Squirtle Has Fainted");
                }
            }
        });

        pokemonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("pokemon");
            }
        });

        bagButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("bagButton");
            }
        });

        GTFOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        getContentPane().add(pictureLabel);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
