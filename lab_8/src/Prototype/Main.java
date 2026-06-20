package Prototype;

import Prototype.classes.Hero;
import Prototype.classes.HeroRegistry;

public class Main {
  public static void main(String[] args) {
    HeroRegistry registry = new HeroRegistry();

    Hero h1 = registry.get("warrior");
    h1.setName("Роман");
    h1.addSkill("Стрілець");

    Hero h2 = registry.get("warrior");
    h2.setName("Трал");
    h2.setHp(150);

    Hero mage = registry.get("mage");
    mage.setName("Джайна");

    System.out.println(h1);
    System.out.println(h2);
    System.out.println(mage);

  }
}