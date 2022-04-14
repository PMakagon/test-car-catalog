package constants;

import ru.embedika.testcarcatalog.domain.Car;

import java.util.List;

public class CarConstants {
    public static final Car CORRECT_CAR_1 = new Car("TEST-NUMBER","Toyota","Blue",2010);
    public static final Car CAR_WITH_SAME_STATE_NUMBER = new Car("TEST-NUMBER","test","test",1111);
    public static final Car CORRECT_CAR_2 = new Car("statenumber2","Nissan","Black",3001);
    public static final Car NULL_CAR = null;

    public static final List<Car> CAR_LIST = List.of(
            CORRECT_CAR_1,
            CORRECT_CAR_2
    );

}
