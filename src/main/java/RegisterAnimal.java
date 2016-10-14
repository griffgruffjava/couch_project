import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00175569 on 14/10/2016.
 */
public class RegisterAnimal extends JFrame{
    private JPanel westPanel;
    private JPanel eastPanel;
    private JPanel southPanel;
    private JPanel westLabels;
    private JTextField sellNametextField;
    private JTextField sellHerdTextField;
    private JTextField sellTLandTextField;
    private JTextField sellTownTextField;
    private JLabel sellerName;
    private JLabel sellerHerdNum;
    private JLabel sellerTownland;
    private JLabel sellerTown;
    private JLabel sellerCounty;
    private JPanel town;
    private JPanel townloand;
    private JPanel name;
    private JPanel county;
    private JPanel herdNum;
    private JTextField buyerNameTextField1;
    private JLabel buyerName;
    private JLabel buyerTownLand;
    private JLabel buyerTown;
    private JLabel buyerCounty;
    private JLabel buyerHerd;
    private JTextField buyerTLandtextField1;
    private JTextField buyerTowntextField2;
    private JTextField buyerCountytextField3;
    private JTextField buyerHerdtextField4;
    private JButton submitbutton1;
    private JLabel tag;
    private JTextField tagTextField1;
    private JTextField textField1;
    private JPanel bigPanel;
    private final static List<Herd> data = new ArrayList<>();

    public RegisterAnimal(){
        super("Register Animal Panel");

        submitbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.add(new Herd(sellNametextField.getText(),
                        sellHerdTextField.getText(),
                        sellTLandTextField.getText(),
                        sellTownTextField.getText(),
                        textField1.getText()));
                data.add(new Herd(buyerNameTextField1.getText(),
                        buyerHerdtextField4.getText(),
                        buyerTLandtextField1.getText(),
                        buyerTowntextField2.getText(),
                        buyerCountytextField3.getText()));


                PrivateSale sale = new PrivateSale(data.get(1), data.get(0), LocalDate.now());
                CouchCRUD.putSaleToBovine(tagTextField1.getText(),sale );

            }
        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("RegisterAnimal");
//        frame.setContentPane(new RegisterAnimal().bigPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
}
