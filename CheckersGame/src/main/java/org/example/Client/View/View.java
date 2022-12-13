package org.example.Client.View;

import java.awt.event.ActionListener;
import org.example.Server.Model.Model;

public interface View {
    Model model = null;

    public void display();

    public void addComponent(View view);

    public void addAction(ActionListener listener);

    public void remove(View view);

    public View download(int i);
}
