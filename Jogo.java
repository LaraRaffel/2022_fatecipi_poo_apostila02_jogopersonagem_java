public class Jogo {
    public static void main(String[] args) throws Exception{
        Personagem p1 = new Personagem("Lucas", 5, 5, 5);
        Personagem p2 = new Personagem ("Lara", 10, 0, 0);
        Personagem p3 = new Personagem ("Yasmin", 1, 4, 3);

    while (true){
        p1.cacar();
        p1.comer();
        p3.dormir();
        p3.comer();
        p2.comer();
        p3.cacar();
        p3.cacar();
        p3.dormir();
        p2.cacar();
        p2.cacar();
        p2.dormir();
        p1.dormir();
        p1.cacar();
        p1.cacar();
        p1.cacar();
        System.out.println("=============================");
        Thread.sleep(5000);
        }
    }
}