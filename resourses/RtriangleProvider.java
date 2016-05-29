import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class RtriangleProvider implements Rtriangle {

    public int getApexX1() { return 2; }
    public int getApexY1() { return 3; }
    public int getApexX2() { return 5; }
    public int getApexY2() { return 6; }
    public int getApexX3() { return 9; }
    public int getApexY3() { return 2; }


    public static Rtriangle getRtriangle () {
        return new Rtriangle(){
            public int getApexX1() { return 2; }
            public int getApexY1() { return 3; }
            public int getApexX2() { return 5; }
            public int getApexY2() { return 6; }
            public int getApexX3() { return 9; }
            public int getApexY3() { return 2; }

        };

    }
}
