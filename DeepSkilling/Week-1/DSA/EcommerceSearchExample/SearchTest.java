public class SearchTest {

    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mobile", "Electronics"),
                new Product(3, "Tablet", "Electronics")
        };

        Product result = linearSearch(products, "Mobile");

        if (result != null) {

            System.out.println("Product Found");
            System.out.println("ID: " + result.productId);
            System.out.println("Name: " + result.productName);
            System.out.println("Category: " + result.category);

        } else {

            System.out.println("Product Not Found");
        }
    }
}