import com.google.gson.JsonObject;
import org.lightcouch.Response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class ProjectDriver {



    public static void main(String args[]) {

        String tag = "IE 4342343546";

        Herd herd = new Herd("Pat Griffin", "H9823201", "Ballinasare", "Tralee", "Kerry");

        Herd buyer = new Herd("Tom Flynn", "H7281222", "Ardfert", "Ardfert", "Kerry");

        Bovine bovine = new Bovine(herd, tag, "HEX", LocalDate.now());

        Vet vet = new Vet("E56", "Lawlers Vet");

        TbTest tbTest = new TbTest(LocalDate.now().minusMonths(4), vet);

        TbTest tbTest2 = new TbTest(LocalDate.now(), vet);

        Mart mart = new Mart("R567", "Castleray", "Tralee", "0667384");

        MartSale martSale = new MartSale(buyer, herd, LocalDate.now().minusMonths(9), mart, 701, 1, 787, 787.00, 957.00);

        PrivateSale privateSale = new PrivateSale(herd, buyer, LocalDate.now());

//        List<PrivateSale> sales = new ArrayList<>();
//        sales.add(martSale);
//        sales.add(privateSale);
//        bovine.setSales(sales);

        List<TbTest> tests = new ArrayList<>();
        tests.add(tbTest);
        tests.add(tbTest2);
        bovine.setTbTests(tests);

        Response response = CouchCRUD.postToCouch(bovine);

//        System.out.println(response.toString());

//        System.out.println(CouchCRUD.getJsonObjectById(response));


        JsonObject jsonObject = CouchCRUD.getJsonObjectById(response);
//        System.out.println(jsonObject);
        Bovine b = CouchCRUD.getBovineById(response);
//        System.out.println(b.toString());
        List<TbTest> m = b.getTbTests();
//        System.out.println(m.toString());

        CouchCRUD.addTbTestToBovineFromTag(tag);


    }

}
