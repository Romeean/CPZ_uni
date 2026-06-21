package Facade;

import Facade.actions.Delivery;
import Facade.actions.Kitchen;
import Facade.actions.Payment;

public class PizzeriaFacade {
  private Kitchen kitchen = new Kitchen();
  private Delivery delivery = new Delivery();
  private Payment payment = new Payment();

  public void order() {
    payment.processPayment();
    kitchen.cookPizza();
    delivery.deliver();
  }
}