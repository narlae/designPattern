package ObserverPattern.SwingObserver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(event ->
                System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event ->
                System.out.println("그냥 저질러 버렷!!!"));

//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());

    }

//    class AngelListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("하지 마! 아마 후회할 걸?");
//        }
//    }
//
//    class DevilListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("그냥 저질러 버렷!!!");
//        }
//    }

}
