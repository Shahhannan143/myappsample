package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	@Autowired
	private CartRepository cartRepository;

	@GetMapping("/cart")
	public List<Cart> getAllCart() {
		return cartRepository.findAll();
	}

	@PostMapping("/cart")
	public String addCart(@RequestBody Cart cart) {
		cartRepository.save(cart);
		return "Record Saved";
	}

	@PutMapping("/cart")
	public String updateCart(@RequestBody Cart cart) {
		cartRepository.save(cart);
		return "Record Updated";
	}

	@DeleteMapping("/cart")
	public String deleteCart(@RequestBody Cart cart) {
		cartRepository.delete(cart);
		return "Record Deleted";
	}

	@DeleteMapping("/cart/{id}")
	public String deleteByidCart(@RequestParam Long id) {
		Optional<Cart> cart = cartRepository.findById(id);
		cartRepository.delete(cart.get());
		return "Record Deleted";
	}
}
