package CustomDeque.DataStructureJavaQueue.src;

class Gad2Chair {
    private String seat1Name;
    private String seat2Name;
    
    public Gad2Chair(String skierInFirstSeat, String skierInSecondSeat) {
        this.seat1Name = skierInFirstSeat;
        this.seat2Name = skierInSecondSeat;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getOuterType().hashCode();
        result = prime * result + ((seat1Name == null) ? 0 : seat1Name.hashCode());
        result = prime * result + ((seat2Name == null) ? 0 : seat2Name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Gad2Chair other = (Gad2Chair) obj;
        if (!getOuterType().equals(other.getOuterType()))
            return false;
        if (seat1Name == null) {
            if (other.seat1Name != null)
                return false;
        } else if (!seat1Name.equals(other.seat1Name))
            return false;
        if (seat2Name == null) {
            if (other.seat2Name != null)
                return false;
        } else if (!seat2Name.equals(other.seat2Name))
            return false;
        return true;
    }

    public String listChairRiders() {
        return this.seat1Name + ", " + this.seat2Name;
    }

    private App getOuterType() {
        return new App();
    }
    
    @Override 
    public String toString() { 
        return listChairRiders();
    }
}