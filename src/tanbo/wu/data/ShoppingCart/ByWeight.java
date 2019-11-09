package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现计重接口
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public interface ByWeight {
    int carrotWeightPrice = 4; //胡萝卜重量单价为4元/千克
    int cabbageWeightPrice = 3; //卷心菜重量单价为3元/千克

    /**
     * 计重价格
     * @return
     */
    double getPriceByWeight();
}
