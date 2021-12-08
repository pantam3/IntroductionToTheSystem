
public class CPU {
    private int cores;
    private double workFrequency;
 
    public CPU(int cores, double workFrequency) {
        this.setCores(cores);
        this.setWorkFrequency(workFrequency);
    }
 //comment
    @Override
    public String toString() {
        return "CPU{" +
                "core=" + cores +
                ", workFrequency=" + workFrequency +
                '}';
    }
 
    public int getCores() {
        return cores;
    }
 
    public void setCores(int cores) {
        if (cores > 0) {
          this.cores = cores;
        }
    }
 
    public double getWorkFrequency() {
        return workFrequency;
    }
 
    public void setWorkFrequency(double workFrequency) {
        this.workFrequency = workFrequency;
    }
    public int compare(CPU c1, CPU c2){
        return c1.getCores() - c2.getCores();
    }
}