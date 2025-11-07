public class Main3 {
    public static void main(String[] args) {
        int PlayerAttack = 15;
        int EnemyDifence = 5;

        int damage = ((PlayerAttack *2) - EnemyDifence) /3 ;

        System.out.println("与えるダメージ : " + damage);
    }
}
