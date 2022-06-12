package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.DataAccess.abstracts.ProductDao;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor

@Service
public class ProductManager implements ProductService {

    
    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao=productDao;
    }
    @Override
    public List<Product> getAll() {
        
        return this.productDao.findAll();
    }
    
}
