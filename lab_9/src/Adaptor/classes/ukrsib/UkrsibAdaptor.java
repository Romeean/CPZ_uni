package Adaptor.classes.ukrsib;

import Adaptor.classes.Payment;

public class UkrsibAdaptor implements Payment {
  private UkrsibAPI ukrsibAPI;

  public UkrsibAdaptor(UkrsibAPI ukrsibAPI){
    this.ukrsibAPI = ukrsibAPI;
  }

  @Override
  public void pay(double amount){
    ukrsibAPI.remitPayment(amount);
  }
}
