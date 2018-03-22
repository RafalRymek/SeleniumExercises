package javaRob;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static java.awt.event.KeyEvent.VK_1;

public class Program {

    private Robot robot;
    private AutoClick autoClick;
    private Runtime runtime;

    public void chooseCalc() {

        int xSet = 960;
        int ySet = 540;
        int x =960;
        int y =620;

        runtime = Runtime.getRuntime();

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        try {
            runtime.exec("calc.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        robot.delay(1000);
        robot.mouseMove(xSet, ySet);
        autoClick.doubleleftClick(robot);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);



            robot.mouseMove(x, y);
            autoClick.doubleleftClick(robot);
            robot.delay(5);
            robot.mouseMove(xSet, (y+150));
            robot.delay(1000);
            autoClick.doubleleftClick(robot);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.mouseMove(xSet, (y+110));
            robot.delay(1000);
            autoClick.leftClick(robot);
















    }




}
