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
        int pagesToPrint = pages * copies;
        if (this.paperLeft >= pagesToPrint && this.tonerVolume >= pagesToPrint)
        {
            this.paperLeft -= pagesToPrint;
            this.tonerVolume -= pagesToPrint;
        }
    }

    public void refillPaper() {
        this.paperLeft += 10;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
