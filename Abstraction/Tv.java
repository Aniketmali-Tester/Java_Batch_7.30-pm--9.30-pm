package Abstraction;

public class Tv implements Switch{
    @Override
    public void SwitchOn() {

        System.out.println("TV Switched On");

    }

    @Override
    public void SwitchOff() {

        System.out.println("Tv Switched Off");

    }
}
