package kata.tpms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AlarmTest {
    @Test
    public void a_trivial_test() {
        assertEquals(5, 2 + 3);
    }

    // TODO-user-intent-test-working-on: a normal pressure value should not raise the alarm
    @Test
    public void a_normal_pressure_value_should_not_raise_the_alarm() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
        Alarm alarm = new Alarm(stubSensor);

        // Act
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }


    // TODO-user-intent-test: a pressure value out the range should raise the alarm


    // TODO-user-intent-test: a normal pressure value after a value outside the range should not stop the alarm

    // TODO-new-feature: a normal pressure value after a value outside the range should stop the alarm
}
