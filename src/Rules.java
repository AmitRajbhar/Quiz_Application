import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start,back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+ name + " to Indian Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        heading.setForeground(new Color(30, 144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rules.setText(
                "<html>"+
                        "1. Answer within the time limit: Players must provide their answers within a specified time." + "<br><br>" +
                        "2. One answer per question: Each question should have only one correct answer." + "<br><br>" +
                        "3. Points for correct answers: Players earn points for each correct answer they provide, and their score." + "<br><br>" +
                        "4. Limited hints or lifelines: Players may have access to a limited number of hints or lifelines." + "<br><br>" +
                        "5. Difficulty progression: The questions should gradually increase in difficulty as the game progresses" + "<br><br>" +
                        "6. Limited retries: Players may be allowed a certain number of retries or attempts to answer a question correctly." + "<br><br>" +
                        "7. Leaderboards and high scores: The game can maintain a leaderboard or track high scores." + "<br><br>" +
                        "8. Multiple game modes or categories: Offering different game modes or categories, Good Luck." + "<br><br>" +
                        "<html>"
        );
        add(rules);



        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start){
            setVisible(false);
            new Quiz(name);

        } else {
                setVisible(false);
                new Login();
        }
    }

    public static void main (String[] args){
        new Rules("User");
    }
}