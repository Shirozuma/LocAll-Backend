package com.localapp.PayloadResponse;

import java.util.List;

import com.localapp.Model.BasketItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasketResponse {

    List<BasketItem> basketItems;
    double totalCost;

}