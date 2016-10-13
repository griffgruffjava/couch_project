import java.time.LocalDate;
import java.util.List;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Bovine {

    Herd herd;

    String id;

    String breed;

    LocalDate dob;

    List<TbTest> tbTests;

    List<Movement> movements;

    public Bovine(Herd herd, String id, String breed, LocalDate dob) {
        this.herd = herd;
        this.id = id;
        this.breed = breed;
        this.dob = dob;
    }

    public Herd getHerd() {
        return herd;
    }

    public void setHerd(Herd herd) {
        this.herd = herd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
