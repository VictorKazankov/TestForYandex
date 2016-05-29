import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;


public class TestsForTriangle  {


    private BigDecimal squareFirstSideTriangle;
    private BigDecimal squareSecondSideTriangle;
    private BigDecimal squareHupoTriangle;

    Rtriangle result = RtriangleProvider.getRtriangle();
    int x1 = result.getApexX1();
    int y1 = result.getApexY1();
    int x2 = result.getApexX2();
    int y2 = result.getApexY2();
    int x3 = result.getApexX3();
    int y3 = result.getApexY3();

    @Before
    public void setUp() throws Exception{
        // вычисляем значения квадратов для каждой стороны
        squareFirstSideTriangle = new BigDecimal(x1 - x2).pow(2).add(new BigDecimal(y1 - y2).pow(2));

        squareSecondSideTriangle = new BigDecimal(x2 - x3).pow(2).add(new BigDecimal(y2 - y3).pow(2));

        squareHupoTriangle = new BigDecimal(x3 - x1).pow(2).add(new BigDecimal(y3 - y1).pow(2));

    }

    @Test //проверяем что у нас треугольник а не просто точки на одной линии
    public void testVerifyIsTrangle() throws Exception{
        Assert.assertTrue(((x1 - x2) != 0) & ((x2 - x3) !=0));
        Assert.assertTrue(((y1 - y2) != 0) & ((y2 - y3) !=0));
    }

    @Test() // проверка что треугольник является прямоугольным по методу Пифагора
    public void testVerifyRectangularOfTriangle() throws Exception{
        Assert.assertTrue(squareHupoTriangle.compareTo(squareFirstSideTriangle.add(squareSecondSideTriangle)) == 0);
        System.out.println("Right triangle");
    }


}
