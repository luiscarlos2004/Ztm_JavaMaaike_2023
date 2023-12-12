import Inventory.inventory;
import Inventory.product;
import Inventory.warehouse;
public class main{
    public static void main(String[] args){
        product product = new product();
        product.producttld = 23;
        product.productName = "Computer";
        product.price = 1000;

        inventory inventory = new inventory();
        inventory.products = product;
        inventory.quantity = 20;
        
        warehouse warehouse = new warehouse();
        warehouse.warehouseld = 1;
        warehouse.warehouseName = "Apple";
        warehouse.inventories = "cell phone";

        
        System.out.println("Producttld" + product.producttld);
        System.out.println("Product Name" + product.productName);
        System.out.println("Price" + product.price);
        System.out.println("products" + inventory.products);
        System.out.println("Quantity" + inventory.quantity);
        System.out.println("Warehouseld" + warehouse.warehouseld);
        System.out.println("WarehouseName" + warehouse.warehouseName);
        System.out.println("Inventories" + warehouse.inventories);
    }
}