package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Banana类
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public class Banana extends Food implements ByNumber{
    private double bananaNum;

    Banana(double amount, double weight, double bananaNum) {
        super(amount, weight);
        this.bananaNum = bananaNum;
    }


    @Override
    public double getPriceByNumber() {
        return bananaNum*bananaNumberPrice;
    }
}
