/**
 * Created by t00175569 on 13/10/2016.
 */
public class Owner {

    String name;

    String herdNumber;

    String address;

    public Owner(String name, String herdNumber, String address){
        this.name = name;
        this.herdNumber = herdNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerdNumber() {
        return herdNumber;
    }

    public void setHerdNumber(String herdNumber) {
        this.herdNumber = herdNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
