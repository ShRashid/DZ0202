class Cat implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал дистанцию " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать дистанцию " + distance + " метров");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул высоту " + height + " метров");
        } else {
            System.out.println(name + " не смог перепрыгнуть высоту " + height + " метров");
        }
    }
}