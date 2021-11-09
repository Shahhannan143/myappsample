package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")

public class ItemsController {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;
	private String productName;

	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = true)
	private Cart cart;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cart, itemId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemsController other = (ItemsController) obj;
		return Objects.equals(cart, other.cart) && Objects.equals(itemId, other.itemId)
				&& Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", productName=" + productName + ", cart=" + cart + "]";
	}

}
