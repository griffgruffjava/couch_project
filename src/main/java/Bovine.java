import java.time.LocalDate;
import java.util.List;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Bovine {

    private Herd originHerd;
    private String _id;
    private String _rev;
    private String breed;
    private LocalDate dob;
    private List<TbTest> tbTests;
    private List<PrivateSale> sales;
    private FactoryDelivery factoryDelivery;
    private Boolean isDeceased;

    public Bovine() {
    }

    public Bovine(Herd originHerd, String _id, String breed, LocalDate dob) {
        this.originHerd = originHerd;
        this._id = _id;
        this.breed = breed;
        this.dob = dob;
    }

    public Bovine(Herd originHerd, String _id, String breed, LocalDate dob, List<TbTest> tbTests, List<PrivateSale> sales) {
        this.originHerd = originHerd;
        this._id = _id;
        this.breed = breed;
        this.dob = dob;
        this.tbTests = tbTests;
        this.sales = sales;
    }

    public Herd getOriginHerd() {
        return originHerd;
    }

    public void setOriginHerd(Herd originHerd) {
        this.originHerd = originHerd;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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

    @Override
    public String toString() {
        return "Bovine{" +
                "originHerd=" + originHerd +
                ", _id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", breed='" + breed + '\'' +
                ", dob=" + dob +
                ", tbTests=" + tbTests +
                ", sales=" + sales +
                ", factoryDelivery=" + factoryDelivery +
                '}';
    }
}
