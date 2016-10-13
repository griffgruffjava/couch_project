import org.lightcouch.Response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class ProjectDriver {



    public static void main(String args[]) {

        Herd herd = new Herd("Pat Griffin", "H9823201", "Ballinasare", "Tralee", "Kerry");

        Herd buyer = new Herd("Tom Flynn", "H7281222", "Ardfert", "Ardfert", "Kerry");

        Bovine bovine = new Bovine(herd, "IE 4342343546", "HEX", LocalDate.now());

        Vet vet = new Vet("E56", "Lawlers Vet");

        TbTest tbTest = new TbTest(LocalDate.now().minusMonths(4), vet);

        TbTest tbTest2 = new TbTest(LocalDate.now(), vet);

        Mart mart = new Mart("R567", "Castleray", "Tralee", "0667384");

        MartRegistration martRegistration = new MartRegistration(mart, herd, 701, 1);

        MartSale martSale = new MartSale(martRegistration, buyer, LocalDate.now(), 787, 787.00, 957.00);

        PrivateSale privateSale = new PrivateSale(buyer, herd, LocalDate.now());

        List<Movement> movements = new ArrayList<>();
        movements.add(martSale);
        movements.add(privateSale);
//        bovine.setMovements(movements);

        List<TbTest> tests = new ArrayList<>();
        tests.add(tbTest);
        tests.add(tbTest2);
        bovine.setTbTests(tests);

        Response response = CouchCRUD.postToCouch(bovine);

//        System.out.println(response.toString());

//        System.out.println(CouchCRUD.getById(response));


        CouchCRUD.getById(response);



    }

}
