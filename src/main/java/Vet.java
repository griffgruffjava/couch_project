/**
 * Created by T00175569 on 13/10/2016.
 */
public class Vet {

    private String vetId;
    private String clinicName;
    private String phoneNumber;

    public Vet(){}

    public Vet(String vetId) {
        this.vetId = vetId;
    }

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

    @Override
    public String toString() {
        return "Vet{" +
                "vetId='" + vetId + '\'' +
                ", clinicName='" + clinicName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
