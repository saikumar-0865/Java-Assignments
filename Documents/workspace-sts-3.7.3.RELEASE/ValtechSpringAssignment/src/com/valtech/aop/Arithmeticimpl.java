package com.valtech.aop;

public class Arithmeticimpl implements Arithemetic {
	

    @Override
    public int add(int a, int b){
        return a+b;
    }
    
    @Override
    public int sub(int a, int b){
        return a-b;
    }
    
    @Override
    public int mul(int a, int b){
        return a*b;
    }
    
    @Override
    public int div(int a, int b){
        return a/b;
    }
    
    @Override
    public int add(int...a) {
        int result = 0;
        for(int i : a) {
            result+=i;
        }
        return result;
    }
    
    @Override
    public int mul(int...a) {
        int result = 0;
        for(int i : a) {
            result*=i;
        }
        return result;
    }

	@Override
	public int mul(int principle, int time, int rateofinterest) {
		// TODO Auto-generated method stub
		return 0;
	}
}
 
