package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    // Можно и в ручную создать и отрисовать, форму и компонент (кастомный)
        JFrame jFrame = getFrame();
        FaceBean faceBean = new FaceBean();
        faceBean.setMouthWidth(50);
        faceBean.frown();
        jFrame.add(faceBean);
    }

    // что бы не делать портянку вынесли JFrame
    static JFrame getFrame(){
        // сама форма
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // размеры
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500,500);

        return jFrame;
    }
}
