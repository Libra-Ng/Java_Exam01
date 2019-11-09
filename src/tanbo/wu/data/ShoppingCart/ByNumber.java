package tanbo.wu.data.ShoppingCart;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现计量接口
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public interface ByNumber {
    int appleNumberPrice = 4; //苹果数量单价为4元/个
    int bananaNumberPrice = 2; //香蕉数量单价为2元/个

    /**
     * 计量价格
     * @return
     */
    double getPriceByNumber();
}
