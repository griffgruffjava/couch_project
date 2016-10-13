import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;
import org.lightcouch.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Test {


    public static void main(String args[]) {




        CouchDbClient dbClient = new CouchDbClient();

        Owner owner = new Owner("Tom Farmer", "H0177666", "Ballinog, Tralee, Co Kerry");

        Bovine bovine = new Bovine(owner, "IE 7843 43432", "HEX", "15/05/2015");

        Response response = dbClient.save(bovine);

        Map<String, String> map = new HashMap<String, String>();





        dbClient.shutdown();


    }

}
