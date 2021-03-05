public class Kata {
  public static String declareWinner(Fighter f1, Fighter f2, String fa) {

    if (fa.equals(f1.name)) {
      while (f1.health > 0 && f2.health > 0) {
        f2.health -= f1.damagePerAttack;
        if (f2.health <= 0) return f1.name;
        f1.health -= f2.damagePerAttack;
        if (f1.health <= 0) return f2.name;
      }
    } else {
      while (f1.health > 0 && f2.health > 0) {
        f1.health -= f2.damagePerAttack;
        if (f1.health <= 0) return f2.name;
        f2.health -= f1.damagePerAttack;
        if (f2.health <= 0) return f1.name;
      }
    }
    return null;
  }
}