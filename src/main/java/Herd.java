/**
 * Created by t00175569 on 13/10/2016.
 */
public class Herd {

    private String name;
    private String herdNumber;
    private String townland;
    private String town;
    private String county;


    public Herd(){}

    public Herd(String name, String herdNumber, String townland, String town, String county) {
        this.name = name;
        this.herdNumber = herdNumber;
        this.townland = townland;
        this.townland = townland;
        this.town = town;
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public String getHerdNumber() {
        return herdNumber;
    }

    public String getTownland() {
        return townland;
    }

    public String getTown() {
        return town;
    }

    public String getCounty() {
        return county;
    }

    @Override
    public String toString() {
        return "Herd{" +
                "name='" + name + '\'' +
                ", herdNumber='" + herdNumber + '\'' +
                ", townland='" + townland + '\'' +
                ", town='" + town + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
