package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Apple类
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public class Apple extends Food implements ByNumber{
    private double appleNum;

    Apple(double amount, double weight, double appleNum) {
        super(amount, weight);
        this.appleNum = appleNum;
    }


    @Override
    public double getPriceByNumber() {
        return appleNum*appleNumberPrice;
    }
}
