import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class PrivateSale implements Movement {

    Herd buyer;

    Herd seller;

    LocalDate saleDate;

    public PrivateSale(){}

    public PrivateSale(Herd buyer, Herd seller, LocalDate saleDate) {
        this.buyer = buyer;
        this.seller = seller;
        this.saleDate = saleDate;
    }

    public Herd getBuyer() {
        return buyer;
    }

    public void setBuyer(Herd buyer) {
        this.buyer = buyer;
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
}
