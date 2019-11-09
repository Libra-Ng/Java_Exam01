package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现购物车类
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public class ShoppingCart {
    public static String [] foodName = new String[10];
    /**
     * 计算并返回所有商品的价格
     * @return
     */
    public double checkout(Food food){
        double cost = 0.0;
        if (food instanceof Apple){
            cost = ((Apple) food).getPriceByNumber();
        }
        else if (food instanceof Banana){
            cost =((Banana) food).getPriceByNumber();
        }
        else if (food instanceof Carrot){
            cost = ((Carrot) food).getPriceByWeight();
        }
        else if(food instanceof Cabbage){
            cost = ((Cabbage) food).getPriceByWeight();
        }
        return cost;
    }
}
