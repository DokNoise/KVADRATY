
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Квадраты при игре в крестики-нолики занумерованы,
        как показано на рисунке. Заданы номера трех квадратов: N1, N2, N3. Проверить, лежат ли квадраты:
        На одной диагонали
        На одной вертикали
        На одной горизонтали */
        System.out.println("Задайте номера квадратов (От 1 до 9)");
        int N1 = in.nextInt();
        int N2 = in.nextInt();
        int N3 = in.nextInt();
        if ((N1 >= 1 && N1 <= 9) && (N2 >= 1 && N2 <= 9) && (N3 >= 1 && N3 <= 9)) {
            boolean Gorizontal1 = ((N1 + 1 == N2) || (N1 + 1 == N3)) && ((N2 + 1 == N3) || (N3 + 1 == N2));
            boolean Gorizontal2 = ((N2 + 1 == N1) || (N2 + 1 == N3)) && ((N1 + 1 == N3) || (N3 + 1 == N1));
            boolean Gorizontal3 = ((N3 + 1 == N1) || (N3 + 1 == N2)) && ((N2 + 1 == N1) || (N1 + 1 == N2));
            boolean Vertical1 = ((N1 + 3 == N2) || (N1 + 3 == N3)) && ((N2 + 3 == N3) || (N3 + 3 == N2));
            boolean Vertical2 = ((N2 + 3 == N1) || (N2 + 3 == N3)) && ((N1 + 3 == N3) || (N3 + 3 == N1));
            boolean Vertical3 = ((N3 + 3 == N2) || (N3 + 3 == N1)) && ((N2 + 3 == N1) || (N1 + 3 == N2));
            if (N1 == 5 || N2 == 5 || N3 == 5) { //Проверка отрезков (горизонталей, вертикалей, диагоналей) содержащих клетку под номером 5
                if (N1 < N2 && N1 < N3) {
                    if (((N1 + 4 == N2) || (N1 + 4 == N3)) && ((N2 + 4 == N3) || (N3 + 4 == N2)))
                        System.out.println("Квадраты находятся на одной диагонали");
                    else if (((N1 + 2 == N2) || (N1 + 2 == N3)) && ((N2 + 2 == N3) || (N3 + 2 == N2)))
                        System.out.println("Квадраты находятся на одной диагонали");
                    else if (Gorizontal1)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical1)
                        System.out.println("Квадраты находятся на одной вертикали");
                } else if (N2 < N1 && N2 < N3) {
                    if (((N2 + 4 == N1) || (N2 + 4 == N3)) && ((N1 + 4 == N3) || (N3 + 4 == N1)))
                        System.out.println("Квадраты находятся на одной диагонали");
                    else if (((N2 + 2 == N1) || (N2 + 2 == N3)) && ((N1 + 2 == N3) || (N3 + 2 == N1)))
                        System.out.println("Квадраты находятся на одной диагонали");
                    else if (Gorizontal2)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical2)
                        System.out.println("Квадраты находятся на одной вертикали");
                } else if (N3 < N1 && N3 < N2) {
                    if (((N3 + 4 == N1) || (N3 + 4 == N2)) && ((N1 + 4 == N2) || (N2 + 4 == N1)))
                        System.out.println("Квадраты находятся на одной диагонали");
                    else if (((N3 + 2 == N1) || (N3 + 2 == N2)) && ((N1 + 2 == N2) || (N2 + 2 == N1)))
                        System.out.println("Квадраты находятся на одной диагонали");
                    else if (Gorizontal3)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical3)
                        System.out.println("Квадраты находятся на одной вертикали");
                }
            }
            if (N1 == 1 || N2 == 1 || N3 == 1) { //Проверка отрезков (горизонталей, вертикалей) содержащих клетку под номером 1
                if (N1 < N2 && N1 < N3) {
                    if (Gorizontal1)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical1)
                        System.out.println("Квадраты находятся на одной вертикали");
                } else if (N2 < N1 && N2 < N3) {
                    if (Gorizontal2)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical2)
                        System.out.println("Квадраты находятся на одной вертикали");
                } else if (N3 < N1 && N3 < N2) {
                    if (Gorizontal3)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical3)
                        System.out.println("Квадраты находятся на одной вертикали");
                }
            }
            if (N1 == 9 || N2 == 9 || N3 == 9) { //Проверка отрезков (горизонталей, вертикалей) содержащих клетку под номером 9
                if (N1 < N2 && N1 < N3) {
                    if (Gorizontal1)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical1)
                        System.out.println("Квадраты находятся на одной вертикали");
                } else if (N2 < N1 && N2 < N3) {
                    if (Gorizontal2)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical2)
                        System.out.println("Квадраты находятся на одной вертикали");
                } else if (N3 < N1 && N3 < N2) {
                    if (Gorizontal3)
                        System.out.println("Квадраты находятся на одной горизонтали");
                    else if (Vertical3)
                        System.out.println("Квадраты находятся на одной вертикали");
                }
            }
        }
    }
}
