import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;
import org.lightcouch.View;
import org.lightcouch.ViewResult;

import javax.swing.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
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


    public static Bovine getBovineFromId(String id){

        CouchDbClient dbClient = new CouchDbClient();
        try {
            Bovine foundBovine = dbClient.find(Bovine.class, id);
            dbClient.shutdown();
            return foundBovine;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to find animal with Tag matching " + id);
        }

        return null;

    }


    public static void putTbTestToBovine(String tagId, TbTest test){

        CouchDbClient dbClient = new CouchDbClient();
        Bovine bovine = getBovineFromId(tagId);
        if(!bovine.getDeceased()) {
            try {
                List<TbTest> currentTests = bovine.getTbTests();
                currentTests.add(test);
                bovine.setTbTests(currentTests);
            } catch (Exception e) {
                List<TbTest> newTests = new ArrayList<>();
                newTests.add(test);
                bovine.setTbTests(newTests);
            }
            dbClient.update(bovine);
        }
        dbClient.shutdown();
    }

    public static void putSaleToBovine(String tagId, PrivateSale sale){


        CouchDbClient dbClient = new CouchDbClient();
        Bovine bovine = getBovineFromId(tagId);

            try {
                List<PrivateSale> currentSales = bovine.getSales();
                currentSales.add(sale);
                bovine.setSales(currentSales);
            } catch (Exception e) {

                List<PrivateSale> newSales = new ArrayList<>();
                newSales.add(sale);
                bovine.setSales(newSales);
            }


            dbClient.update(bovine);

        dbClient.shutdown();
    }

    public static void putFactoryDeliveryToBovine(String tagId, FactoryDelivery factoryDelivery){

        CouchDbClient dbClient = new CouchDbClient();
        Bovine bovine = getBovineFromId(tagId);
        if(!bovine.getDeceased()) {
            bovine.setFactoryDelivery(factoryDelivery);
            dbClient.update(bovine);
        }
        dbClient.shutdown();
    }


    public static void deleteBovine(String tag){

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "You are about to permanently delete all records for " + tag + ". Do you wish to proceed?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            CouchDbClient dbClient = new CouchDbClient();
            Bovine bovine = getBovineFromId(tag);
            if(bovine != null) {
                dbClient.remove(bovine);
                JOptionPane.showMessageDialog(null, "The animal with matching Tag " + tag + " has been deleted");
            }
        }



    }


//    public static Bovine getBovineFromJson(JsonObject jsonObject) {
//
////        Bovine bovine = new Gson().fromJson(jsonObject.getAsString(), Bovine.class);
//
//        Bovine bovine = new Gson().fromJson(jsonObject, Bovine.class);
////        Staff staff = gson.fromJson(new FileReader("D:\\file.json"), Staff.class);
//
//        return bovine;
//
//    }
//
//    public static Bovine getBovineFromTagWithView(String tag){
//
//
//        return null;
//
//    }

//    public static JsonObject getJsonObjectById(Response response) {
//
//        CouchDbClient dbClient = new CouchDbClient();
//        String id = response.getId();
//        JsonObject foundJsonObject = dbClient.find(JsonObject.class, id);
////        System.out.println(found.toString());
//        dbClient.shutdown();
//        return foundJsonObject;
//
//    }
//
//    public static Bovine getBovineWithResponeId(Response response) {
//
//        CouchDbClient dbClient = new CouchDbClient();
//        String id = response.getId();
//        Bovine foundBovine = dbClient.find(Bovine.class, id);
////        System.out.println(foundBovine.toString());
//        dbClient.shutdown();
//        return foundBovine;
//
//    }



}
