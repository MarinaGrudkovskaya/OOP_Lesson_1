package OOP.Lessen1;

import java.util.List;
// implements - коротко, это расширяет
public class BottelOfWaterVendingMashine implements VendingMachine{
    private final List<Product> productList;
    private  int money;

    public BottelOfWaterVendingMashine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public  Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }
    public BottleOfWater getProduct(String name, int volume){
        for (Product product: productList){
            if (product instanceof BottleOfWater){  //тут проверяем является ли продукт бутылкой воды
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product; //тут кастуем продукт
                }
            }
        }
        return null;
    }
}
