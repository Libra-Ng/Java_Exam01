package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Cabbage类
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public class Cabbage extends Food implements ByWeight{
    private double cabbageWeight;

    Cabbage(double amount, double weight, double cabbageWeight) {
        super(amount, weight);
        this.cabbageWeight = cabbageWeight;
    }

    @Override
    public double getPriceByWeight() {
        return cabbageWeight*cabbageWeightPrice;
    }
}
