package org.example;

public interface View {
    Model model = null;

    public void setModel(Model model);

    public void display();

    public void add(View view);

    public void remove(View view);

    public View download(int i);
}
