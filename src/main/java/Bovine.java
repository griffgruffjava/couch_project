import java.time.LocalDate;
import java.util.List;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Bovine {


    private RegistationProfile registationProfile;
    private String _id;
    private String _rev;
    private List<TbTest> tbTests;
    private List<PrivateSale> sales;
    private FactoryDelivery factoryDelivery;
    private Boolean isDeceased;

    public Bovine() {
    }

    public Bovine(RegistationProfile registationProfile, String _id) {
        this.registationProfile = registationProfile;
        this._id = _id;

    }


    public RegistationProfile getRegistationProfile() {
        return registationProfile;
    }

    public void setRegistationProfile(RegistationProfile registationProfile) {
        this.registationProfile = registationProfile;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public List<TbTest> getTbTests() {
        return tbTests;
    }

    public void setTbTests(List<TbTest> tbTests) {
        this.tbTests = tbTests;
    }

    public List<PrivateSale> getSales() {
        return sales;
    }

    public void setSales(List<PrivateSale> sales) {
        this.sales = sales;
    }

    public FactoryDelivery getFactoryDelivery() {
        return factoryDelivery;
    }

    public void setFactoryDelivery(FactoryDelivery factoryDelivery) {
        this.factoryDelivery = factoryDelivery;
        isDeceased = true;
    }

    public Boolean getDeceased() {
        return isDeceased;
    }


    @Override
    public String toString() {
        return "Bovine{" +
                "registationProfile=" + registationProfile +
                ", _id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", tbTests=" + tbTests +
                ", sales=" + sales +
                ", factoryDelivery=" + factoryDelivery +
                ", isDeceased=" + isDeceased +
                '}';
    }
}
