package Adaptor.classes.privat;

import Adaptor.classes.Payment;

public class PrivatAdaptor implements Payment {
  private PrivatAPI privatAPI;

  public PrivatAdaptor(PrivatAPI privatAPI) {
    this.privatAPI = privatAPI;
  }

  @Override
  public void pay(double amount) {
    privatAPI.sendPayment(amount);
  }
}

