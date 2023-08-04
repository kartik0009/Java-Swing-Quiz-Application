
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.GREEN);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+ name + " to Quiz Time");
        heading.setBounds(50,50,700,30);
        heading.setFont(new Font("Viner HAND ITC", Font.BOLD,28 ));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16 ));
        rules.setForeground(Color.BLACK);
        rules.setText(
                
        "<html>"+
        "1. Single Choice Only: There's only one option per question. Choose wisely." + "<br><br>" +
        "2. Final Answers: Your first choice is your last choice. Choose confidently." + "<br><br>" +
        "3. No Second Guessing: Once selected, your answer stands. No changing allowed." + "<br><br>" +
        "4. Confidence Matters: Trust your instincts. Your intuition might surprise you." + "<br><br>" +
        "5. No Room for Doubt: Embrace the simplicity. No overthinking required." + "<br><br>" +
        "6. Quick Decisions: Think fast, answer faster. Speed is your ally." + "<br><br>" +
        "7. Precision is Key: A single option, but precision matters. Aim for perfection." + "<br><br>" +
        "8. One and Done: One answer, one chance. Make it count!" + "<br><br>" +
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
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
}
