/**
 * Created by T00175569 on 13/10/2016.
 */
public class MartRegistration {

    private Mart mart;
    private Herd seller;
    private int lotNo;
    private int lotSize;

    public MartRegistration(){}

    public MartRegistration(Mart mart, Herd seller, int lotNo, int lotSize) {
        this.mart = mart;
        this.seller = seller;
        this.lotNo = lotNo;
        this.lotSize = lotSize;
    }

    public Mart getMart() {
        return mart;
    }

    public void setMart(Mart mart) {
        this.mart = mart;
    }

    public Herd getSeller() {
        return seller;
    }

    public void setSeller(Herd seller) {
        this.seller = seller;
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
}
