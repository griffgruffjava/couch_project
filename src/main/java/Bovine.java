import java.util.List;

/**
 * Created by t00175569 on 13/10/2016.
 */
public class Bovine {

    Herd herd;

    String id;

    String breed;

    String dob;

    List<TbTest> tbTests;

    List<Movement> movements;

    public Bovine(Herd herd, String id, String breed, String dob) {
        this.herd = herd;
        this.id = id;
        this.breed = breed;
        this.dob = id;
    }

    public Herd getHerd() {
        return herd;
    }

    public String getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public String getDob() {
        return dob;
    }

    public List<TbTest> getTbTests() {
        return tbTests;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public void setTbTests(List<TbTest> tbTests) {
        this.tbTests = tbTests;
    }

    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }
}
