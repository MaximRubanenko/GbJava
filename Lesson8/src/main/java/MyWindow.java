import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.GRAY;

/**
 * Rubanenko Maxim
 * 10.10.2021
 */


public class MyWindow extends JFrame {
  public MyWindow() {
    setTitle("Чат");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(null);
    setBounds(1500, 500, 400, 700);
    JTextArea textAreaOutput = new JTextArea();
    textAreaOutput.setBounds(0, 0, 400, 410);
    textAreaOutput.setEditable(false);
    add(textAreaOutput);

    JTextArea textAreaInput = new JTextArea();
    textAreaInput.setBounds(0, 410, 400, 50);
    textAreaInput.setBorder(BorderFactory.createLineBorder(GRAY));
    add(textAreaInput);

    JButton buttonSend = new JButton("Отправить.");
    buttonSend.setBounds(0, 460, 400, 50);
    add(buttonSend);
    setVisible(true);

    buttonSend.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textAreaOutput.append("\n" + textAreaInput.getText());
        textAreaInput.setText("");
      }
    });
  }

  public static void main(String[] args) {
    new MyWindow();
  }
}
