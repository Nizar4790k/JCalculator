import javax.swing.*;
import java.awt.*;

public class FrameCalculator extends JFrame
{

    private  JPanel mainPanel;
    private  JPanel centerPanel;
    private  JPanel eastPanel;
    private BorderLayout borderLayout;
    private JTextField txtResult;
    private JButton [] jButtonArray ={
            new JButton("9"),
            new JButton("8"),
            new JButton("7"),
            new JButton("6"),
            new JButton("5"),
            new JButton("4"),
            new JButton("3"),
            new JButton("2"),
            new JButton("1"),
            new JButton(""),
            new JButton("0"),
            new JButton(""),
            new JButton("-"),
            new JButton("*"),
            new JButton("/"),
            new JButton("+"),
            new JButton("=")



    };;

    public FrameCalculator(){
        initComponents();
        setBounds(100,200,640,480);
        setVisible(true);
        setDefaultCloseOperation(FrameCalculator.EXIT_ON_CLOSE);
        add(mainPanel);
        setTitle("JCalculator");
        jButtonArray[9].setVisible(false);
        jButtonArray[11].setVisible(false);


    }


    public void initComponents(){
        mainPanel = new JPanel();
        borderLayout= new BorderLayout();
        txtResult=new JTextField();
        centerPanel= new JPanel();
        eastPanel = new JPanel();



        txtResult.setEditable(false);
        txtResult.setText("0");

        mainPanel.setLayout(borderLayout);
        mainPanel.add(txtResult,BorderLayout.NORTH);
        mainPanel.add(eastPanel,BorderLayout.EAST);
        mainPanel.add(centerPanel,BorderLayout.CENTER);

        eastPanel.setLayout(new GridLayout(5,1));
        for(int i=12;i<jButtonArray.length;i++){
            eastPanel.add(jButtonArray[i]);
        }

        centerPanel.setLayout(new GridLayout(4,3));

        for(int i=0;i<12;i++){
            centerPanel.add(jButtonArray[i]);
        }



    }


}
