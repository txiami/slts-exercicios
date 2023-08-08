package heranca;

public class ProgramaVeterinario {

    public static void main(String[] args) {
        
        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Rex", 3);
        Cavalo cavalo = new Cavalo("Pé de Pano", 8);
        Preguica preguica = new Preguica("Pregui", 2);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
