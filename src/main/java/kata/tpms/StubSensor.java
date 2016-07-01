package kata.tpms;

/**
 * Created by switch on 16/7/1.
 */
public class StubSensor implements Transducer {
    private double nextPressurePsiValue;

    public void arrangeNextPressurePsiValue(double nextPressurePsiValue) {
        this.nextPressurePsiValue = nextPressurePsiValue;
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.nextPressurePsiValue;
    }
}
