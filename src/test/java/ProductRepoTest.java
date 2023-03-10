import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void getProductbyId() {
        //Given
        Product expected = new Product("hose", 12);
        Product p2 = new Product("Socken", 123);

        ArrayList<Product> myProducts = new ArrayList<>(Arrays.asList(expected, p2));
        ProductRepo productRepo = new ProductRepo(myProducts);

        //When
        Product actual = productRepo.getProductbyId(12);

        //Then
        assertEquals (expected, actual);
    }
    @Test
    void getProductbyId_IdDoesntExist_ThrowException() {
        //Given
        Product p1 = new Product("hose", 12);
        Product p2 = new Product("Socken", 123);

        ArrayList<Product> myProducts = new ArrayList<>(Arrays.asList(p1, p2));
        ProductRepo productRepo = new ProductRepo(myProducts);

        //When
        try{
            Product actual = productRepo.getProductbyId(132);
        fail();
        }
        catch (NoSuchElementException e){
            // Test OK
        }
        //Then
    }

    @Test
    void listProducts() {
    }
}