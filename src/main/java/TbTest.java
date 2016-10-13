import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class TbTest {

    private LocalDate testDate;
    private Vet testVet;

    public TbTest() {
    }

    public TbTest(LocalDate testDate, Vet testVet) {
        this.testDate = testDate;
        this.testVet = testVet;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public Vet getTestVet() {
        return testVet;
    }

    public void setTestVet(Vet testVet) {
        this.testVet = testVet;
    }

    @Override
    public String toString() {
        return "TbTest{" +
                "testDate=" + testDate +
                ", testVet=" + testVet +
                '}';
    }
}
