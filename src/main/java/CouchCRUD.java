import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class CouchCRUD {


    public static Response postToCouch(Bovine bovine) {

        CouchDbClient dbClient = new CouchDbClient();
        Response response = dbClient.save(bovine);
        dbClient.shutdown();
        return response;
    }



}
