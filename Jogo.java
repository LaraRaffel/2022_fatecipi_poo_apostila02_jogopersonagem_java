public class Jogo {
    public static void main(String[] args) throws Exception{
        Personagem p = new Personagem("Lucas", 5, 5, 5);
        Personagem p2 = new Personagem ("Lara", 10, 0, 0);

    while (true){
        p.cacar();
        p.comer();
        p.dormir();
        p.cacar();
        p.cacar();
        p.cacar();
        System.out.println("=============================");
        Thread.sleep(5000);
        }
    }
}