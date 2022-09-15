package snow;

public class Fog extends Sleet {
    public void m1() {
        System.out.println("Fog 1");
    }

    public void m2(){
        System.out.println("Sleet 2");
        super.m2();
        this.m3(); //If "this" is Fog then how come "super" is Snow not Sleet??
    }

    public void m3() {
        System.out.println("Fog 3");
    }
}
