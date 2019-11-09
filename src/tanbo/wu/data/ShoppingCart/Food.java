package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Food类
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
abstract class Food {
    private double amount;
    private double weight;

    Food(double amount, double weight) {
        this.amount = amount;
        this.weight = weight;
    }
}
