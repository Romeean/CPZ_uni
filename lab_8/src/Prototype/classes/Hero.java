package Prototype.classes;


import java.util.ArrayList;

public class Hero implements Prototype {
  private String name;
  private String heroClass;
  private int hp;
  private int level;
  private ArrayList<String> skills;

  public Hero(Hero other){
    this.name = other.name;
    this.heroClass = other.heroClass;

    this.hp = other.hp;
    this.skills = new ArrayList<>(other.skills);
  }

  private void loadSkillsFromDatabase() {
    skills.add("Удар");
    skills.add("Захист");
  }

  @Override
  public Prototype clone() {
    // Клонування персонажа, використовуючи конструктор копіювання
    return new Hero(this);
  }


  public Hero(String name, String heroClass, int hp, int level){
    this.name = name;
    this.heroClass = heroClass;
    this.hp = hp;
    this.level = level;
    this.skills = new ArrayList<>();
    loadSkillsFromDatabase();
  }


  public void addSkill(String skill) { skills.add(skill); }
  public void setName(String name) { this.name = name; }
  public void setHp(int hp) { this.hp = hp; }

  @Override
  public String toString() {
    return String.format("[%s | %s | HP:%d | Навички:%s]",
            name, heroClass, hp, skills);
  }
}
