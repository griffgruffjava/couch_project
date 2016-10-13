/**
 * Created by T00175569 on 13/10/2016.
 */
public class Vet {

    String vetId;

    String clinicName;

    String phoneNumber;

    public Vet(String vetId, String clinicName, String phoneNumber) {
        this.vetId = vetId;
        this.clinicName = clinicName;
        this.phoneNumber = phoneNumber;
    }

    public Vet(String vetId, String clinicName) {
        this.vetId = vetId;
        this.clinicName = clinicName;
    }

    public String getVetId() {
        return vetId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
