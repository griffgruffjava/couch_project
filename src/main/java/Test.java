import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Test {


    public static void main(String args[]) {




        CouchDbClient dbClient = new CouchDbClient();

        Herd herd = new Herd("Tom Farmer", "H0177666", "Ballinog, Tralee, Co Kerry");

        Bovine bovine = new Bovine(herd, "IE 7843 43432", "HEX", "15/05/2015");

        Response response = dbClient.save(bovine);

        Map<String, String> map = new HashMap<String, String>();





        dbClient.shutdown();


    }

}
