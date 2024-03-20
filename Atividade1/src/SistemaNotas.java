import java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Notas");
        System.out.println("Informe as notas do aluno:");
        
        
        System.out.print("Matematica: ");
        int matematica = scanner.nextInt();
        
        System.out.print("Portugues: ");
        int portugues = scanner.nextInt();
        
        System.out.print("Biologia: ");
        int biologia = scanner.nextInt();
        
        System.out.print("Física: ");
        int fisica = scanner.nextInt();
        
        System.out.print("Química: ");
        int quimica = scanner.nextInt();
        
        System.out.print("História: ");
        int historia = scanner.nextInt();
        
        System.out.print("Geografia: ");
        int geografia = scanner.nextInt();

        System.out.print("Inglês: ");
        int ingles = scanner.nextInt();

        System.out.print("Filosofia: ");
        int filosofia = scanner.nextInt();
        
        System.out.print("Sociologia: ");
        int sociologia = scanner.nextInt();

        
        int media = (matematica + portugues + biologia + fisica + quimica + historia + geografia + filosofia + sociologia) / 9;

        
        if (media >= 6) {
            System.out.println("Parabéns! O aluno está aprovado com média: " + media);
        } else {
            System.out.println("Infelizmente, o aluno não está aprovado. Média: " + media);
        }
    }
}
