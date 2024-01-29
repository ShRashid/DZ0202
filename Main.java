public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Сергей", 200, 2),
                new Cat("Рыжик", 150, 3),
                new Robot("РобоКоп", 300, 1)
        };

        Object[] obstacles = {
                new RunningTrack(100),
                new Wall(2),
                new RunningTrack(250),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Object obstacle : obstacles) {
                if (obstacle instanceof RunningTrack) {
                    RunningTrack track = (RunningTrack) obstacle;
                    track.overcome (participant);
                } else if (obstacle instanceof Wall) {
                    Wall wall = (Wall) obstacle;
                    wall.overcome(participant);
                }
            }
            System.out.println();
        }
    }
}