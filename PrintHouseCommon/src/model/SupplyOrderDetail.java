/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author neo
 */
public class SupplyOrderDetail implements Serializable{
    private int supplyOrderId;
    private double quantity;
    private double price;
    private int supplierId;
    private int itemId;

    public SupplyOrderDetail() {
    }

    public SupplyOrderDetail(int supplyOrderId, double quantity, double price, int supplierId, int itemId) {
        this.supplyOrderId = supplyOrderId;
        this.quantity = quantity;
        this.price = price;
        this.supplierId = supplierId;
        this.itemId = itemId;
    }

    /**
     * @return the supplyOrderId
     */
    public int getSupplyOrderId() {
        return supplyOrderId;
    }

    /**
     * @param supplyOrderId the supplyOrderId to set
     */
    public void setSupplyOrderId(int supplyOrderId) {
        this.supplyOrderId = supplyOrderId;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the itemId
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

   
    
    
    
}
