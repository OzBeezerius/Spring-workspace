package Producto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {

	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(
				new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		// Implementación
		BigDecimal cost = shoppingCart.stream()
				.map(product -> product.price
						.add(product.price.multiply(new BigDecimal(product.tax.percent).divide(new BigDecimal(100)))))
				.reduce(BigDecimal.ZERO, (x, y) -> x.add(y));

		System.out.println("Coste total: " + cost + " €");

		// Implementación
		String resultado = shoppingCart.stream().filter(product -> product.name.startsWith("C"))
				.map(product -> product.name).collect(Collectors.joining(", ", "", "."));

		System.out.println("Productos que empiezan por C: " + resultado);
	}

}
