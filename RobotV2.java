class RobotV2 {
    public static void main(String[] args) {
        RobotV2 robot = new RobotV2();
        robot.greeting("Hello");
        robot.greeting("Bye");
    }

    void greeting(String msg) {
        System.out.println(msg);
    }
}
