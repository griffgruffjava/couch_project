import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class MartSale implements Movement {

    private MartRegistration registration;
    private Herd buyer;
    private LocalDate saleDate;
    private int lotWeightKg;
    private double aveWeightKg;
    private double pricePerHead;

    public MartSale(){}

    public MartSale(MartRegistration registration, Herd buyer, LocalDate saleDate, int lotWeightKg, double aveWeightKg, double pricePerHead) {
        this.registration = registration;
        this.buyer = buyer;
        this.saleDate = saleDate;
        this.lotWeightKg = lotWeightKg;
        this.aveWeightKg = aveWeightKg;
        this.pricePerHead = pricePerHead;
    }

    public MartRegistration getRegistration() {
        return registration;
    }

    public Herd getBuyer() {
        return buyer;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public int getLotWeightKg() {
        return lotWeightKg;
    }

    public double getAveWeightKg() {
        return aveWeightKg;
    }

    public double getPricePerHead() {
        return pricePerHead;
    }

    @Override
    public String toString() {
        return "MartSale{" +
                "registration=" + registration +
                ", buyer=" + buyer +
                ", saleDate=" + saleDate +
                ", lotWeightKg=" + lotWeightKg +
                ", aveWeightKg=" + aveWeightKg +
                ", pricePerHead=" + pricePerHead +
                '}';
    }

}
