package springapp.service;

import java.io.Serializable;
import java.util.List;

import springapp.domain.Product;

public interface ProductManager extends Serializable {
	public void IncreasePrice(int percentage);
	public List<Product> getProducts();

}
