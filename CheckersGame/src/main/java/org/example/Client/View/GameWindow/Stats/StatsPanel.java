package org.example.Client.View.GameWindow.Stats;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.example.Client.View.View;

public class StatsPanel extends JPanel implements View {
public JTextArea portInfo;
  public StatsPanel(){
    setBackground(Color.red);
    setLayout(new GridLayout(3,1));
    add(new JPanel());
    add(portInfo = new JTextArea("Numer portu: 0000"));
    add(new JPanel());
  }

  public void changeText(int port){
    portInfo.setText("Numer portu: "+port);
  }
  @Override
  public void display() {

  }

  @Override
  public void addComponent(View view) {
    this.add((Component)view);
  }

  @Override
  public void addAction(ActionListener listener) {

  }

  @Override
  public void remove(View view) {

  }

  @Override
  public View download(int i) {
    return null;
  }
}
