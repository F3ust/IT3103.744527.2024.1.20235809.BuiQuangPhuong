public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc (DigitalVideoDisc disc){
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered += 1;
    }
    public void removeDigitalVideoDisc (DigitalVideoDisc disc){
        for (int i = 0; i <= qtyOrdered-1; ++i) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j <= qtyOrdered-2; ++j) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered -= 1;
            }
        }
    }
    public float totalCost() {
        float sum = 0.0f;
        for (int i = 0; i <= qtyOrdered-1; ++i) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
