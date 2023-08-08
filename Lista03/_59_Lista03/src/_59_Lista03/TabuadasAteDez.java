package Lista03._59_Lista03.src._59_Lista03;

public class TabuadasAteDez {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n\nA TABUADA DO %d\n", i);

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (j * i));
            }
        }
    }
}