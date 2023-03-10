import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ProductRepo {
    private List<Product> products;  // Eigenschaft der Klasse ProductRepo: Liste mit Produkten

    public ProductRepo() {    //leerer Konstruktor
    }

    public ProductRepo(List<Product> products) { //Konstruktor
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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

    public Product getProductbyId (int id) {
        for (Product p : products){
            if (id == p.getId()){
                return p;
            }
        }
        throw new NoSuchElementException("Produkt existiert nicht");
    }

    public List <Product> listProducts (){
        for (Product p : products){
            System.out.println(p);
        }
        return products;
    }

}
