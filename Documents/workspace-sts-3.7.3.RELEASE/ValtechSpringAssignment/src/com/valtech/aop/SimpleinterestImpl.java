package com.valtech.aop;

public class SimpleinterestImpl implements Simpleinterest {
	
	private Arithemetic arithemetic;
	public SimpleinterestImpl(Arithemetic arithemetic){
		
		this.arithemetic = arithemetic;
	}
	
	

	
	/*public Arithemetic getArithemetic() {
		return arithemetic;
	}*/



	public SimpleinterestImpl() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void setArithemetic(Arithemetic arithemetic) {
		this.arithemetic = arithemetic;
	}



	@Override
	public int computeSimpleInterest(int principle, int time, int rateofinterest){
		return arithemetic.div(arithemetic.mul(principle, time, rateofinterest), 100);
	}
	
	
	
	/*
	 * 
        
       private Arithmetic arithmetic;
        public SimpleInterestImpl(Arithmetic arithmetic){
            this.arithmetic=arithmetic;
        }
        public void setArithmetic(Arithmetic arithmetic){
            this.arithmetic=arithmetic;
        }
        
        /* (non-Javadoc)
         * @see valtechSpring.aop.SimpleInterest#computeSimpleInterest(int, int, int)
         */
        
        
       

}
