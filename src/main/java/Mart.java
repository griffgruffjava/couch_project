/**
 * Created by T00175569 on 13/10/2016.
 */
public class Mart {

    String martId;

    String addressOne;

    String town;

    String phone;

    public Mart(String martId, String addressOne, String town, String phone) {
        this.martId = martId;
        this.addressOne = addressOne;
        this.town = town;
        this.phone = phone;
    }

    public String getMartId() {
        return martId;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
