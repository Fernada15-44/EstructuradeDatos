package mx.edu.uttt.matrices;

public class Auto {
    private String model;
    private int milesDriven;
    private double gallonsOfGas;

    public Auto() {
        this.model="Unknow";
    }

    public Auto(String model, int milesDriven, double gallonsOfGas) {
        this.model = model;
        this.setMilesDriven(milesDriven);
        this.setGallonsOfGas (gallonsOfGas);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        if (milesDriven >=0)
        this.milesDriven = milesDriven;
        else {
            System.out.println("Miles driven cannot be negative");
            System.out.println("Value not changed");
        }
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        if (gallonsOfGas >=0)
        this.gallonsOfGas = gallonsOfGas;
        else{
            System.out.println("Gallons Of Gas cannot be negative");
            System.out.println("Gallons Of Gas not changed");
        }
    }

    public double calculateMilesPerGallon(){
        if ( gallonsOfGas != 0.0){
            return milesDriven / gallonsOfGas;
        }else
            return 0.0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", milesDriven=" + milesDriven +
                ", gallonsOfGas=" + gallonsOfGas +
                '}';
    }


}
