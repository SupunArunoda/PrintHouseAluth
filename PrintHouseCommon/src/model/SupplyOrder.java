/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author neo
 */
public class SupplyOrder implements Serializable{
    private int supplyOrderId;
    private String description;
    private String date;
    private int supplierId;
    private ArrayList<SupplyOrderDetail> supplyOrderList;

    public SupplyOrder() {
    }

    public SupplyOrder(int supplyOrderId, String description, String date, int supplierId, ArrayList<SupplyOrderDetail> supplyOrderList) {
        this.supplyOrderId = supplyOrderId;
        this.description = description;
        this.date = date;
        this.supplierId = supplierId;
        this.supplyOrderList = supplyOrderList;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
     * @return the supplyOrderList
     */
    public ArrayList<SupplyOrderDetail> getSupplyOrderList() {
        return supplyOrderList;
    }

    /**
     * @param supplyOrderList the supplyOrderList to set
     */
    public void setSupplyOrderList(ArrayList<SupplyOrderDetail> supplyOrderList) {
        this.supplyOrderList = supplyOrderList;
    }
    
    
    
    
    
    
    
    
}
