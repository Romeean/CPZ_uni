package Prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class HeroRegistry {
  private Map<String, Hero> templates = new HashMap<>();

  public HeroRegistry() {
    templates.put("warrior", new Hero("Шаблон", "Воїн", 100, 20));
    templates.put("mage",    new Hero("Шаблон", "Маг",  60,  40));
  }

  public Hero get(String type) {
    return (Hero) templates.get(type).clone();
  }
}