import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class FactorySale implements Movement {

    Factory factory;

    Herd seller;

    LocalDate saleDate;

    double killWeight;

    public FactorySale(Factory factory, Herd seller, LocalDate saleDate, double killWeight) {
        this.factory = factory;
        this.seller = seller;
        this.saleDate = saleDate;
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

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public double getKillWeight() {
        return killWeight;
    }

    public void setKillWeight(double killWeight) {
        this.killWeight = killWeight;
    }
}
