package main.ua.kpi.newYearsGift.model.candyModel;

public class Candy {
    private CandyType candyType;
    private double sugarContent;
    private int weight;

    private Candy(CandyBuilder builder) {
        this.candyType = builder.candyType;
        this.sugarContent = builder.sugarContent;
        this.weight = builder.weight;
    }

    public CandyType getCandyType() {
        return candyType;
    }

    public void setCandyType(CandyType candyType) {
        this.candyType = candyType;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static class CandyBuilder {

        private CandyType candyType;
        private double sugarContent;
        private int weight;

        public CandyBuilder(CandyType candyType, double sugarContent, int weight) {
            this.candyType = candyType;
            this.sugarContent = sugarContent;
            this.weight = weight;
        }

        public CandyBuilder(CandyType candyType) {
            this.candyType = candyType;
        }

        public CandyBuilder setSugarContent(double sugarContent) {
            this.sugarContent = sugarContent;
            return this;
        }

        public CandyBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Candy build() {
            return new Candy(this);
        }
    }
}
