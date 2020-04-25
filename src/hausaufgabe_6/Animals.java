package hausaufgabe_6;

public class Animals {
    String vid;
    int run;
    int swim;
    int jump;

    public Animals(String vid, int run, int swim, int jump) {
        this.vid = vid;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void running() {
        System.out.println(vid + "животное бежит");
    };

    public void swimming() {
        System.out.println(vid + "животное плывет");
    };

    public void jumping() {
        System.out.println(vid + "животное прыгает");
    };
}
