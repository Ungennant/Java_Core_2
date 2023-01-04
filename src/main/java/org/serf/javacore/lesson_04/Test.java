package org.serf.javacore.lesson_04;

public class Test {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCooker.work();

        Robot[] robots = new Robot[4];
        robots[0] = robot;
        robots[1] = coffeRobot;
        robots[2] = robotDancer;
        robots[3] = robotCooker;

        for (Robot robot1 : robots) {
            robot1.work();
        }

    }
}
