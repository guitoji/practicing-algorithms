import java.util.Arrays;

void main() {

    Scanner scanner =  new Scanner(System.in);

    System.out.print("Digite o tamanho da arr: ");
    int size = scanner.nextInt();

    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
        System.out.printf("Digite o %d numero: ", (i + 1));
        arr[i] = scanner.nextInt();
    }

    System.out.print("\nDigite o numero que deseja procurar: ");
    int item = scanner.nextInt(); //declarando item procurado


    System.out.print("\nEste item se encontra na posição: " + binarySearch(arr, item));

    scanner.close();
}

public static Integer binarySearch(int[] arr, int item) {
    Arrays.sort(arr); //Busca binária sempre deve receber uma estrutura de dados ordenada!

    int baixo = 0; //declarando inicio do arr
    int alto = arr.length - 1; //declarando final do arr

    while (baixo <= alto) {
        int meio = (baixo + alto) / 2;
        int chute = arr[meio];

        if (chute == item) {
            return meio; //retorna a posição caso o valor exista.
        }

        if (chute < item) {
            baixo = meio + 1; //atualiza o ponteiro baixo para uma posição após o meio.
        } else alto = meio - 1; //atualiza o ponteiro alto para uma posição antes do meio.

    }
    return null; //retorna nulo caso o valor seja inexiste.
}




