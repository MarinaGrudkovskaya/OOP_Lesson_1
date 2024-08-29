package OOP.Lessen1;
//tod
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

//Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
//сделанного в предыдущем задании.

//Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
//сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
//ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

//Переопределите метод toString для Товара, запустите программу, после этого переопределите для
//наследника этот метод, после запуска обратите внимание на изменение поведения.
//� Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
//входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
//возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)

//todo Домашнее задание
//� Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
//� Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//соответствующий имени, объему и температуре
//� В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//воспроизвести логику заложенную в программе
//� Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product product1 = new Product("Чипсы", 150);
        Product product2 = new BottleOfWater("Кола", 100, 1);
        Product product3 = new HotDrink("Кофе", 50, 90,200);

        productList.add(product1);
        productList.add(product2);
        productList.add(product2);

        System.out.println("------------------------------");

        System.out.println(productList.toString());

        BottelOfWaterVendingMashine bottelOfWaterVendingMashine = new BottelOfWaterVendingMashine(productList);
        System.out.println("------------------------------");
        System.out.println(bottelOfWaterVendingMashine.getProduct("Кола"));
        HotDrinkVendingMashine hotDrinkVendingMashine = new HotDrinkVendingMashine(productList);
        System.out.println("------------------------------");
        System.out.println(hotDrinkVendingMashine.getProduct("Кофе", 200, 90));

    }
}
