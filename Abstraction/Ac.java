package Abstraction;

public class Ac implements Switch{
    @Override
    public void SwitchOn() {
        System.out.println("Ac Switched On");
    }

    @Override
    public void SwitchOff() {
          System.out.println("Ac Switched Off");
    }
}
