package DeepSkilling.DSA.Ecommerce;

public class SearchExample {
    public static Product LinearSearch(Product[] products , int id){
        for(Product p : products){
            if(p.productId==id){
                return p;
            }
        }
        return null;
    }
    public static Product BinarySearch(Product[] products, int id){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(products[mid].productId==id){
                return products[mid];
            }
            else if(products[mid].productId<id){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone ","Electronics"),
            new Product(103,"Shoes","Fashion"),
            new Product(104,"Watch","Accessories"),
            new Product(105,"Bag","Fashion")
        };
    System.out.print("Linear Search : ");
    Product result1= LinearSearch(products, 103);
    if(result1!=null){
        result1.display();
    }
    else{
        System.out.println("Product not found");
    }

    System.out.print("Binary Search : ");
    Product result2 = BinarySearch(products,103);
    if(result2!=null){
        result2.display();
    }
    else{
        System.out.println("Product not found");
    }
    }
}
