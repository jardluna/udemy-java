import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
/*
 * Leia a hora inicial e a hora final de um jogo. A seguir
 * calcule a duração do jogo, sabendo que o mesmo pode começar em um
 * dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que horas o jogo começou? ");
		int horaInicial = sc.nextInt();
		System.out.print("Que horas o jogo terminou? ");
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + " hora(s)!");
		
		sc.close();
	}

}
