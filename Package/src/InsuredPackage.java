/*
Create a sublass named 'InsuredPackage' that adds an insurance cost
to the shipping cost, based on the table~~
*/
public class InsuredPackage extends Package{
    protected float additionalCost;      
    protected float insuranceCost;
    public InsuredPackage(int weight, char shippingMethod){
        super(weight, shippingMethod); 
        
        insuranceCost();
    }
    
    
    public float insuranceCost() {
        
        //0-1.00
        if(super.shippingCost  >= 0 && super.shippingCost <= 1.00){
            this.additionalCost = (float) 2.45;
        }
        //1.01-3.00
        else if(super.shippingCost >= 1.01 && super.shippingCost <= 3.00){
            this.additionalCost = (float) 3.95;
        }
        //3.and over
        else if(super.shippingCost >= 3.01){
            this.additionalCost = (float) 5.55;
        }
        this.insuranceCost = super.shippingCost + this.additionalCost; 

         return insuranceCost;
    }
    
    @Override
    public String display(){
        return "The Insurance Package of '" +super.weight + " oz' is: \n" + " = " +
                super.shippingMethod + " shipping method \n" + " = $" +
                super.shippingCost + " shipping cost \n" + " = $" +
                this.additionalCost + " additional cost \n" + " = $" + 
                this.insuranceCost + " total cost \n";
    }
    
}
