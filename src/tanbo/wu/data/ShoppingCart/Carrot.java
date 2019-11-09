package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Carrot类
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public class Carrot extends Food implements ByWeight{
    private double carrotWeight;

    Carrot(double amount, double weight, double carrotWeight) {
        super(amount, weight);
        this.carrotWeight = carrotWeight;
    }


    @Override
    public double getPriceByWeight() {
        return carrotWeight*carrotWeightPrice;
    }
}
