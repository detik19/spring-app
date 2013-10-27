package springapp.service;

import java.util.List;

import springapp.domain.Product;

public class SimpleProductManager implements ProductManager {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5408634997382648516L;
	private List<Product> products;

	@Override
	public void IncreasePrice(int percentage) {
		if(products!=null){
			for(Product product:products){
				double newPrice = product.getPrice().doubleValue()*(100+percentage)/100;
				product.setPrice(newPrice);
			}
		}

	}

	@Override
	public List<Product> getProducts() {
		
		return products ;
	}
	
	public void setProducts(List<Product> products){
		this.products=products;
	}

}
