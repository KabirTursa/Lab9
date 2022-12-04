package org.example;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements MouseListener {

    ArrayList myStudents = new ArrayList();
    public MyWindow() {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MyWindow window = new MyWindow();
    }
//todo: add MouseListener methods (see outline below)


    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
        Student temp = new Student("temp", e.getX());
        myStudents.add(temp);
        System.out.println(temp);
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

}
