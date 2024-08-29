package OOP.Lessen1;

public interface VendingMachine {
    Product getProduct(String name);// интерфейс возвращает метод GetProduct по имени продукта Product getProduct(String name,int volume, int temperature);

//    public VendingMachine(List<Product> productList) {
//        this.productList = initProducts();
//        this.money = 0;
//    }
//    private List<Product> productList;
//    private Integer money;
//
//
//    private List<Product> initProducts() {
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("cofe", 120));
//        products.add(new Product("tea", 100));
//        products.add(new Product("чипсы", 220));
//        return products;
//    }
//
//    public  Product getProduct(String name) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                money += product.price;
//                return product;
//            }
//        }
//        return null;
//    }
}