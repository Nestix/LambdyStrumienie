import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Random losowa = new Random();
        Rectangle prostokat1 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat2 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat3 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat4 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat5 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat6 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat7 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat8 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat9 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);
        Rectangle prostokat10 = new Rectangle(losowa.nextInt(15)+1,losowa.nextInt(10)+1);


        // podpunkt a)

        List<Rectangle> prostokaty = Arrays.asList(prostokat1,prostokat2,prostokat3,prostokat4,prostokat5,prostokat6,prostokat7,prostokat8,prostokat9,prostokat10);
        String wiekszepole = prostokaty.stream()
                .filter(a -> a.getRadius() > a.getCircut())
                .collect(Collectors.toList())
                .toString();
        System.out.println(wiekszepole);

        // podpunkt b)

        String sortujobwody = prostokaty.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getCircut))
                .collect(Collectors.toList())
                .toString();
        System.out.println(sortujobwody);

        // podpunkt c)

        OptionalDouble sredniaobwodow = prostokaty.stream()
                .mapToDouble(Rectangle::getCircut)
                .average();
                System.out.println(sredniaobwodow);

        // podpunkt d)

        // przykłądu d nie miałem pomysłu jak zrobić i już zabrakło mi na to czasu
        // tyle mi się udało zrobić, ale nie działa i nie jest dokączone
        /*List<Rectangle> sortmniejszeodsredniej = prostokaty.stream()
                .filter(d -> d.getRadius() > ???)
                .sorted(Comparator.comparingDouble(Rectangle::getArea))
                .collect(Collectors.toList());
        System.out.println(sortmniejszeodsredniej);*/

        // podpunkt e)

        Double sumapol = prostokaty.stream()
                .mapToDouble(Rectangle::getRadius)
                .sum();
        System.out.println(sumapol);


    }
}