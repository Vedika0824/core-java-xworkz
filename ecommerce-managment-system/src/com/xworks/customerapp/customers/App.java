package com.xworks.customerapp.customers;


import com.xworks.customerapp.constant.Address;
import com.xworks.customerapp.constant.Website;
public class App {

    public AppDto app[];

    public App(int size) {
        app = new AppDto[size];
    }

    int index;
    int id;

    public boolean searchApp(AppDto app) {
        boolean isAdded = false;
        if (app != null) {
            app.setCoustmerId(++id);
            this.app[index++] = app;
            isAdded = true;

        } else {
            System.out.println("app details are not provided");
        }
        return isAdded;
    }

    public void getApp() {
        System.out.println("Available App are:");
        for (int appIndex = 0; appIndex < app.length; appIndex++) {
            System.out.println(app[appIndex]);
        }
    }

    public String getCustomerNameByCustomerId(int customerId) {
        String customerName = null;
        for (int index = 0; index < app.length; index++) {
            if (app[index].getCoustmerId() == customerId) {
                customerName = app[index].getCoustmerName();
            }
        }
        return customerName;
    }

// public address getCustomerAddressByCustomerName(String CustomerName){
//    }
}




