package hausaufgabe_6;

public class Animals {
    String vid;
    int run;
    int swim;
    double jump;

    public Animals(String vid, int run, int swim, double jump) {
        this.vid = vid;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }


    public void running() {
        System.out.println("животное "+ vid  + " бежит " + run + " метров");
    };

    public void swimming() {
        System.out.println("животное "+vid +  " плывет " + swim+ " метров");
    };

    public void jumping() {
        System.out.println("животное "+vid + " прыгает "+ jump + " метров");
    };
}
