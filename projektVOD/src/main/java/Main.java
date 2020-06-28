import api_okienkowe.VOD_okienko;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String args[])
    {
        JFrame jFrame =  new JFrame("VOD_okienko");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setContentPane(new VOD_okienko().panel1);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setMinimumSize(screenSize);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
