package tanbo.wu.data.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现使用这些类的程序
 * @Date: 2019/10/29
 * @Modified By:2017110342_吴谭波
 */
public class CalculateTest {
    private static int foodCount = 0;
    private static List<Food> FoodList = new ArrayList<>();
    public static void main(String[] args) {
        AskMenu();
        do {
            BuyFood();
        } while (foodCount < 10);
        System.out.println("购物车中已经添加10次，不可再添加!");
        CheckOut();
    }
    /**
     * 询问菜单
     */
    private static void AskMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("请问你需要:1.购买食物 2.结算价格 3.退出:");
        int option = input.nextInt();
        switch (option){
            case 1:
                BuyFood();
                break;
            case 2:
                CheckOut();
                break;
            case 3:
                System.out.println("谢谢使用，再见!");
                CheckOut();
            default:
                System.out.println("输入错误！请重新输入:");
                AskMenu();
        }
    }

    /**
     * 购买食物菜单
     */
    private static void BuyFood(){
        Scanner input = new Scanner(System.in);
        System.out.println("你需要购买什么?");
        System.out.println("1.苹果 2.香蕉 3.胡萝卜 4.卷心菜");
        int option = input.nextInt();
        switch (option) {
            case 1:
                AppleMenu();
                break;
            case 2:
                BananaMenu();
                break;
            case 3:
                CarrotMenu();
                break;
            case 4:
                CabbageMenu();
                break;
            default:
                System.out.println("输入错误!");
                BuyFood();
        }
    }

    /**
     * 苹果菜单
     */
    private static void AppleMenu(){
        Scanner input = new Scanner(System.in);
        foodCount++;
        System.out.println("请输入需要购买的苹果的数量:");
        int appleNum = input.nextInt();
        Apple apple = new Apple(0,0,appleNum);
        FoodList.add(apple);
        AskMenu();
    }

    /**
     * 香蕉菜单
     */
    private static void BananaMenu(){
        Scanner input = new Scanner(System.in);
        foodCount++;
        System.out.println("请输入需要购买的香蕉的数量:");
        int bananaNum = input.nextInt();
        Banana banana = new Banana(0,0,bananaNum);
        FoodList.add(banana);
        AskMenu();
    }

    /**
     * 胡萝卜菜单
     */
    private static void CarrotMenu(){
        Scanner input = new Scanner(System.in);
        foodCount++;
        System.out.println("请输入需要购买的胡萝卜的重量:");
        double carrotWeight = input.nextDouble();
        Carrot carrot = new Carrot(0,0,carrotWeight);
        FoodList.add(carrot);
        AskMenu();
    }

    /**
     * 卷心菜菜单
     */
    private static void CabbageMenu(){
        Scanner input = new Scanner(System.in);
        foodCount++;
        System.out.println("请输入需要购买的卷心菜的重量:");
        double cabbageWeight = input.nextDouble();
        Cabbage cabbage = new Cabbage(0,0,cabbageWeight);
        FoodList.add(cabbage);
        AskMenu();
    }

    /**
     * 结算菜单
     */
    private static void CheckOut(){
        ShoppingCart shoppingCart = new ShoppingCart();
        double totalCost = 0.0;
        for (Food item:FoodList){
                totalCost = shoppingCart.checkout(item);
            }
        System.out.printf("所有食物总价格为:%.1f",totalCost);
        }
    }
