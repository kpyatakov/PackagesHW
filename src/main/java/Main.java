import ru.netology.sqr.packages.services.SqrService;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();
        int x = service.calcSqr(100);
        int y = service.calcSqr1(5000);
        System.out.println("Количество квадратов входящих в диапазон равно " + (y - x));
    }
}
