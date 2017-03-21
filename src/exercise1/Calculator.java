package exercise1;
 interface Calculation{
	int add(int p,int q);
	int sub(int p,int q);
	int mul(int p,int q);
	int div(int p,int q);
}

public class Calculator implements Calculation {
	public int add(int a,int b){
		int res;
		res=a+b;
		return res;
				
	}
	public int sub(int a,int b){
		int res;
		res=a-b;
		return res;
				
	}
	
	public int mul(int a,int b){
		int res;
		res=a*b;
		return res;
				
	}
	
	public int div(int a,int b){
		int res;
		if(a!=0 && b!=0){
		res=a/b;
		return res;
		}
		else{
			System.out.println("Division not possible");
			return 0;
		}
		
	}
	
	

}
 class calImp{
	public static void main(String[] args){
		Calculator casio=new Calculator();
		
	}
}
