import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class RegistationProfile {

    private LocalDate dob;
    private String sex;
    private String damId;
    private LocalDate cardIssueDate;
    private Herd originHerd;

    public RegistationProfile() {
    }

    public RegistationProfile(LocalDate dob, String sex, String damId, LocalDate cardIssueDate, Herd originHerd) {
        this.dob = dob;
        this.sex = sex;
        this.damId = damId;
        this.cardIssueDate = cardIssueDate;
        this.originHerd = originHerd;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDamId() {
        return damId;
    }

    public void setDamId(String damId) {
        this.damId = damId;
    }

    public LocalDate getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(LocalDate cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public Herd getOriginHerd() {
        return originHerd;
    }

    public void setOriginHerd(Herd originHerd) {
        this.originHerd = originHerd;
    }

    @Override
    public String toString() {
        return "RegistationProfile{" +
                "dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                ", damId='" + damId + '\'' +
                ", cardIssueDate='" + cardIssueDate + '\'' +
                ", originHerd=" + originHerd +
                '}';
    }
}
