package HomeWork8;

import javax.swing.*;
import java.awt.*;

public class GameResult extends JFrame {
    static final int WINDOW_X = GameWindow.WINDOW_X + 100;
    static final int WINDOW_Y = GameWindow.WINDOW_Y + 150;
    static final int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH - 205;
    static final int WINDOW_HEIGHT = 200;

    private GameWindow gameWindow;


    public GameResult (GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Result Game");

        setLayout(new BorderLayout());

        JButton butOk = new JButton("Ok");
        add(butOk,BorderLayout.SOUTH);
        if (Logic.winUserThisGame == 1){
            add(new Label("Вы выйграли"),BorderLayout.NORTH);
        } else if (Logic.winUserThisGame == 2){
            add(new Label("Выйграл компьютер"),BorderLayout.NORTH);
        } else if (Logic.winUserThisGame == 3){
            add(new Label("Ничья"),BorderLayout.NORTH);
        }


        butOk.addActionListener(e -> {
            setVisible(false);
        });
    }
}
