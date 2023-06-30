import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {

        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for playing Indian Quiz");
        heading.setBounds(45, 30,700, 30);
        heading.setFont(new Font("Tahoma",Font.PLAIN, 26));
        add(heading);

        JLabel Tscore = new JLabel("Your score is " + score);
        Tscore.setBounds(350, 200,300, 30);
        Tscore.setFont(new Font("Tahoma",Font.PLAIN, 26));
        add(Tscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
      //  submit.setFont(new Font("Tahoma",Font.PLAIN, 22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new Login();
    }

    public static void main(String[] args){
        new Score("User",0);
    }

}
