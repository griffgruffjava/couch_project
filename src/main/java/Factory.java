import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class Factory {

    private String factoryId;
    private String factoryName;

    public Factory(){}

    public Factory(String factoryId, String factoryName) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryId='" + factoryId + '\'' +
                ", factoryName='" + factoryName + '\'' +
                '}';
    }
}
