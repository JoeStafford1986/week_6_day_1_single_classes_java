public class Printer {
    private int paperLeft;
    private int tonerVolume;

    public Printer (int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public void print(int pages, int copies) {
        if (this.paperLeft >= (pages * copies) && this.tonerVolume >= (pages * copies))
        {
            this.paperLeft -= (pages * copies);
            this.tonerVolume -= (pages * copies);
        }
    }

    public void refillPaper() {
        this.paperLeft += 10;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
