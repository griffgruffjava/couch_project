import java.time.LocalDate;
import java.util.List;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Bovine {

    Herd originHerd;

    String tag;

    String breed;

    LocalDate dob;

    List<TbTest> tbTests;

    List<Movement> movements;

    public Bovine(Herd originHerd, String tag, String breed, LocalDate dob) {
        this.originHerd = originHerd;
        this.tag = tag;
        this.breed = breed;
        this.dob = dob;
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

    public List<Movement> getMovements() {
        return movements;
    }

    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }
}
