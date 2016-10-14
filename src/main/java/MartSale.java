import java.time.LocalDate;

/**
 * Created by T00175569 on 13/10/2016.
 */
public class MartSale extends PrivateSale {

    private Mart mart;
    private int lotNo;
    private int lotSize;
    private int lotWeightKg;
    private double aveWeightKg;
    private double pricePerHead;

    public MartSale(){}

    public MartSale( Herd buyer, Herd seller, LocalDate saleDate, Mart mart, int lotNo, int lotSize, int lotWeightKg, double aveWeightKg, double pricePerHead) {
        super(buyer, seller, saleDate);
        this.mart = mart;
        this.lotNo = lotNo;
        this.lotSize = lotSize;
        this.lotWeightKg = lotWeightKg;
        this.aveWeightKg = aveWeightKg;
        this.pricePerHead = pricePerHead;
    }

    public MartSale( PrivateSale privateSale, Mart mart, int lotNo, int lotSize, int lotWeightKg, double aveWeightKg, double pricePerHead ) {
        super(privateSale.getBuyer(), privateSale.getSeller(), privateSale.getSaleDate());
        this.mart = mart;
        this.lotNo = lotNo;
        this.lotSize = lotSize;
        this.lotWeightKg = lotWeightKg;
        this.aveWeightKg = aveWeightKg;
        this.pricePerHead = pricePerHead;
    }


    public Mart getMart() {
        return mart;
    }

    public void setMart(Mart mart) {
        this.mart = mart;
    }

    public int getLotNo() {
        return lotNo;
    }

    public void setLotNo(int lotNo) {
        this.lotNo = lotNo;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getLotWeightKg() {
        return lotWeightKg;
    }

    public void setLotWeightKg(int lotWeightKg) {
        this.lotWeightKg = lotWeightKg;
    }

    public double getAveWeightKg() {
        return aveWeightKg;
    }

    public void setAveWeightKg(double aveWeightKg) {
        this.aveWeightKg = aveWeightKg;
    }

    public double getPricePerHead() {
        return pricePerHead;
    }

    public void setPricePerHead(double pricePerHead) {
        this.pricePerHead = pricePerHead;
    }

    @Override
    public String toString() {
        return "MartSale{" +
                "mart=" + mart +
                ", lotNo=" + lotNo +
                ", lotSize=" + lotSize +
                ", lotWeightKg=" + lotWeightKg +
                ", aveWeightKg=" + aveWeightKg +
                ", pricePerHead=" + pricePerHead +
                '}';
    }
}
