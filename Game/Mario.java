public class Mario implements Game{

    @Override
    public String up(String up) {
       return up;
    }

    @Override
    public String down(String down) {
        return down;
    }

    @Override
    public void run() {
        System.out.println(up("Hey Guys"));
        System.out.println(down("Hello Guys"));
    }

}
