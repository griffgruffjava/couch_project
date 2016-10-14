import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class FactoryDelivery {

    private Factory factory;
    private Herd seller;
    private LocalDate killDate;
    private double killWeight;

    public FactoryDelivery(){}

    public FactoryDelivery(Factory factory, Herd seller, LocalDate killDate, double killWeight) {
        this.factory = factory;
        this.seller = seller;
        this.killDate = killDate;
        this.killWeight = killWeight;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Herd getSeller() {
        return seller;
    }

    public void setSeller(Herd seller) {
        this.seller = seller;
    }

    public LocalDate getKillDate() {
        return killDate;
    }

    public void setKillDate(LocalDate killDate) {
        this.killDate = killDate;
    }

    public double getKillWeight() {
        return killWeight;
    }

    public void setKillWeight(double killWeight) {
        this.killWeight = killWeight;
    }

    @Override
    public String toString() {
        return "FactoryDelivery{" +
                "factory=" + factory +
                ", seller=" + seller +
                ", killDate=" + killDate +
                ", killWeight=" + killWeight +
                '}';
    }
}
