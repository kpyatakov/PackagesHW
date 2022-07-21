import ru.netology.sqr.packages.services.SqrService;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();
        System.out.println("Количество квадратов входящих в диапазон равно " + service.calcSqr(100, 1000));
    }
}
