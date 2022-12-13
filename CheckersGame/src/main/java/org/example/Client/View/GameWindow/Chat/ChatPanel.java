package org.example.Client.View.GameWindow.Chat;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import org.example.Client.View.View;

public class ChatPanel extends JPanel implements View {
  public ChatPanel(){
    setBackground(Color.green);
  }
  @Override
  public void display() {

  }

  @Override
  public void addComponent(View view) {

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
