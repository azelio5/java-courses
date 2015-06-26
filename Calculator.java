

public class Calculator {
    private int summ;
    private int minus;
	private double result;
	
    public double addSumm(double... params){
	result = params[0] + params[1];
	return result;
    }
	
	    public double addMinus(double... params){
	result = params[0] - params[1];
	return result;
    }
	
		    public double addDecart(double... params){
	result = params[0] * params[1];
	return result;
    }
	
			    public double addDevision(double... params){
	result = params[0] / params[1];
	return result;
    }
	
			    public double addPow(double... params){							
	result = Math.pow(params[0], params[1]);
	return result;
    }

	    public double getResult() {
        return this.result;
    }
	
    public void clearResult(){
       this.result = 0;

    }
}
