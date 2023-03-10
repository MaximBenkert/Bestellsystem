import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> products;  // Eigenschaft der Klasse ProductRepo: Liste mit Produkten

    public ProductRepo() {    //leerer Konstruktor
    }

    public ProductRepo(List<Product> ourProducts) { //Konstruktor
        this.products = ourProducts;
    }
/*

    public Product getProduct (ProductRepo myRepo, int index) {
        for (int i : myRepo){

        }
    }
*/

    public List<Product> getOurProducts() {
        return products;
    }

    public void setOurProducts(List<Product> ourProducts) {
        this.products = ourProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
