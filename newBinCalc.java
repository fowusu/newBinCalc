class newBinCalc{

public static void main(String abc[]){

Conversions Qa = new Conversions(); 

Qa.decimalToBinary(14);
Qa.binaryToDecimal("1100");

}

}

class Conversions{

public void decimalToBinary(int a){

int theDec = a; 
int binRes; 
int binCount = 0;
String x = " ";

while(theDec > 0){
	
	binRes = theDec % 2; 
	if(binRes == 1){		
		
		binCount++; 
}
x = binRes + x;
theDec = theDec / 2;
}
 
System.out.println(x);

}
 
public void binaryToDecimal(String x){

int l = x.length; 
int a = integer.parseint(x); 
int e = 0;
int power; 

for (;e < l;) {
	 (  )  * (2 * power); 
power++;  
}


  
}

}

}