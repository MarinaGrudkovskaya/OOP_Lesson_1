package OOP.Lessen1;

public class HotDrink extends Product{
    private int temperature;
    private  int volume;

    public HotDrink(String name, Integer price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
