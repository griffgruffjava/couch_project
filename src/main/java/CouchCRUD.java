import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;
import org.lightcouch.View;
import org.lightcouch.ViewResult;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
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

    public static JsonObject getJsonObjectById(Response response) {

        CouchDbClient dbClient = new CouchDbClient();
        String id = response.getId();
        JsonObject foundJsonObject = dbClient.find(JsonObject.class, id);
//        System.out.println(found.toString());
        dbClient.shutdown();
        return foundJsonObject;

    }

    public static Bovine getBovineById(Response response) {

        CouchDbClient dbClient = new CouchDbClient();
        String id = response.getId();
        Bovine foundBovine = dbClient.find(Bovine.class, id);
//        System.out.println(foundBovine.toString());
        dbClient.shutdown();
        return foundBovine;

    }



    public static Bovine getBovineFromJson(JsonObject jsonObject) {

//        Bovine bovine = new Gson().fromJson(jsonObject.getAsString(), Bovine.class);

        Bovine bovine = new Gson().fromJson(jsonObject, Bovine.class);
//        Staff staff = gson.fromJson(new FileReader("D:\\file.json"), Staff.class);

        return bovine;

    }

    public static Bovine getBovineFromTagWithView(String tag){


        return null;

    }

    public static void addTbTestToBovineFromTag(String tag){

        CouchDbClient dbClient = new CouchDbClient();
        View view = dbClient.view("design/findIdByTag")
                .key(tag) // complex key as: values, or array
                .reduce(false)
                .includeDocs(true);
        System.out.println(view.queryView(int[].class, String.class, Bovine.class));
//        ViewResult<int[], String, Bovine> entries = view.queryView(int[].class, String.class, Bovine.class);

//        List<Bovine> list = dbClient.view("design/findIdByTag")
//                .includeDocs(true)
//                .startKey(tag)
////                .endKey("end-key")
//                .limit(10)
//                .query(Bovine.class);


        dbClient.shutdown();


    }



}
