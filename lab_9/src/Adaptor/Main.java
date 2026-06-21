package Adaptor;
import Adaptor.classes.Payment;
import Adaptor.classes.privat.PrivatAPI;
import Adaptor.classes.privat.PrivatAdaptor;
import Adaptor.classes.ukrsib.UkrsibAPI;
import Adaptor.classes.ukrsib.UkrsibAdaptor;

public class Main {
  public static void main(String[] args) {

    Payment privat = new PrivatAdaptor(new PrivatAPI());
    Payment ukrsib = new UkrsibAdaptor(new UkrsibAPI());

    privat.pay(1000);
    ukrsib.pay(2000);

  }
}
