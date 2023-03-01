package pidev.afarshop.Service.Product;

import pidev.afarshop.Entity.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

public interface IProductServices {
    List<Product> retrieveAllProducts();

    Product addAndUpdateProduct(MultipartFile image,Product product) throws IOException;


    Product retrieveProduct (Long productId);

    void deleteProduct(Long productId);
    Product findStoreByName(String productName);
}