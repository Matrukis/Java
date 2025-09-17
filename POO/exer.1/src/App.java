public class App {
    public static void main(String[] args) throws Exception {
        Personagem Crusader1 = new Personagem();
        Crusader1.nome = "Jotaro Kujo";
        Crusader1.idade = 17;
        Crusader1.tamanho = 1.95f;
        Crusader1.stand = "Star Platinum";

        Personagem Crusader2 = new Personagem();
        Crusader2.nome = "Noriaki Kakyoin";
        Crusader2.idade = 17;
        Crusader2.tamanho = 1.78f;
        Crusader2.stand = "Hierophant Green";

        Personagem Crusader3 = new Personagem();
        Crusader3.nome = "Joseph Joestar";
        Crusader3.idade = 68;
        Crusader3.tamanho = 1.95f;
        Crusader3.stand = "Hermit Purple";

        Personagem Crusader4 = new Personagem();
        Crusader4.nome = "Jean Pierre Polnareff";
        Crusader4.idade = 22;
        Crusader4.tamanho = 1.85f;
        Crusader4.stand = "Silver Chariot";
        
        Personagem Crusader5 = new Personagem();
        Crusader5.nome = "Muhammad Avdol";
        Crusader5.idade = 20;
        Crusader5.tamanho = 1.88f;
        Crusader5.stand = "Magician's Red";

        Personagem Crusader6 = new Personagem();
        Crusader6.nome = "Iggy";
        Crusader6.idade = 4;
        Crusader6.tamanho = 33.3f;
        Crusader6.stand = "The Fool";

        System.out.format("Personagem: %s com idade %d com tamanho %.2fm com stand %s\n", Crusader1.nome, Crusader1.idade, Crusader1.tamanho, Crusader1.stand);
        System.out.format("Personagem: %s com idade %d com tamanho %.2fm com stand %s\n", Crusader2.nome, Crusader2.idade, Crusader2.tamanho, Crusader2.stand);
        System.out.format("Personagem: %s com idade %d com tamanho %.2fm com stand %s\n", Crusader3.nome, Crusader3.idade, Crusader3.tamanho, Crusader3.stand);
        System.out.format("Personagem: %s com idade %d com tamanho %.2fm com stand %s\n", Crusader4.nome, Crusader4.idade, Crusader4.tamanho, Crusader4.stand);
        System.out.format("Personagem: %s com idade %d com tamanho %.2fm com stand %s\n", Crusader5.nome, Crusader5.idade, Crusader5.tamanho, Crusader5.stand);
        System.out.format("Personagem: %s com idade %d com tamanho %.1fcm com stand %s", Crusader6.nome, Crusader6.idade, Crusader6.tamanho, Crusader6.stand);
    }
}