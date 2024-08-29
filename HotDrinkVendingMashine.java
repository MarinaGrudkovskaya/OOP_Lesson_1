package OOP.Lessen1;

import java.util.List;

public class HotDrinkVendingMashine implements VendingMachine{
    private final List<Product> productList;
    private int money;

    public HotDrinkVendingMashine(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
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


    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product: productList){
            if (product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name)
                        &&((HotDrink)product).getVolume() == volume
                        && ((HotDrink)product).getTemperature() == temperature)
                    return (HotDrink) product;
            }
        }
        return null;
    }
}
