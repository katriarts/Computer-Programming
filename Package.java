/*
Create a class named Package,
with data fields for: weight in ounces, 
shipping method and shipping cost.
*/
public class Package {
    protected int weight; //weight in ounces
    //shipping method is a character: A=air; T=truck, M=mail
    protected char shippingMethod;    
    protected float shippingCost;
    
    char air, truck, mail;
    protected float calculateCost;
    /*
    public Package(char A, char T, char M){
        air = 'A';
        truck = 'T';
        mail = 'M';
    }
    */
    public Package(char shippingMethod){
        this.air = 'A';
        this.truck = 'T';
        this.mail = 'M';
    }

    
    /* 
    Package class contains a constructor that requires arguments
    for WEIGHT and SHIPPING METHOD.
    The constructor calls a 'calculateCost()' method that determines
    the shipping cost, based on the table~~ :3)
    */
    public Package(int weight, char shippingMethod){
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        
        calculateCost(this.shippingCost);
        
    }
    
    public float calculateCost(float shippingCost){
        //air
        if((this.weight >= 1 && this.weight <= 8) && (this.shippingMethod == 'A')){
            this.shippingCost = (float) 2.00;
        }
        else if((this.weight >= 9 && this.weight <= 16) && (this.shippingMethod == 'A') ){
            this.shippingCost = (float) 3.00;
        }
        else if((this.weight >= 17) && (this.shippingMethod == 'A')){
            this.shippingCost = (float) 4.50;
        }
        
        
        //truck
        else if((this.weight >= 1 && this.weight <= 8) && (this.shippingMethod == 'T')){
            this.shippingCost = (float) 1.50;
        }
        else if((this.weight >= 9 && this.weight <= 16) && (this.shippingMethod == 'T')){
            this.shippingCost = (float) 2.35;
            
        }
        else if((this.weight >=17) && (this.shippingMethod == 'T')){
            this.shippingCost = (float) 3.25;
        }
        
        //mail
        else if((this.weight >= 1 && this.weight <= 8) && (this.shippingMethod == 'M')){
            this.shippingCost = (float) .50;
            
        }
        else if((this.weight >= 9 && this.weight <= 16) && (this.shippingMethod == 'M')){
            this.shippingCost = (float) 1.50;
        }
        else if((this.weight >=17) && (this.shippingMethod == 'M')){
            this.shippingCost = (float) 2.15 ;
        }
        return calculateCost;
    }
    
    //display~~
    public String display(){    
        return "The Package is: \n" + " = " +
                this.weight + " oz. \n" + " = " +
                this.shippingMethod + " shipping method \n" + " = $" + 
                this.shippingCost + " shipping cost.\n" ;           
    }
}
    
    
    
    
 

