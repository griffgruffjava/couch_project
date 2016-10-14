import java.time.LocalDate;
import java.util.List;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Bovine {

    private Herd originHerd;
    private String tag;
    private String breed;
    private LocalDate dob;
    private List<TbTest> tbTests;
    private List<PrivateSale> sales;

    public Bovine() {
    }

    public Bovine(Herd originHerd, String tag, String breed, LocalDate dob) {
        this.originHerd = originHerd;
        this.tag = tag;
        this.breed = breed;
        this.dob = dob;
    }

    public Bovine(Herd originHerd, String tag, String breed, LocalDate dob, List<TbTest> tbTests, List<PrivateSale> sales) {
        this.originHerd = originHerd;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    @Override
    public String toString() {
        return "Bovine{" +
                "originHerd=" + originHerd +
                ", tag='" + tag + '\'' +
                ", breed='" + breed + '\'' +
                ", dob=" + dob +
                ", tbTests=" + tbTests +
                ", sales=" + sales +
                '}';
    }
}
