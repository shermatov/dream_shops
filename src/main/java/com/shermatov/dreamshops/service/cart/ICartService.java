package com.shermatov.dreamshops.service.cart;

import com.shermatov.dreamshops.model.Cart;
import com.shermatov.dreamshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long cartId);
    void clearCart(Long cartId);
    BigDecimal getTotalPrice(Long cartId);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
