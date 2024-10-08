

public class mandoDistancia {
	public int volumen;
	public int canal;
	public boolean encendido=false;
	
	public mandoDistancia() {
		volumen=10;
		canal=0;
	}
	public void mostrar() {
		if(encendido)
			System.out.println("Mando Apagado");
		else
			System.out.println("Programa: "+canal);
			System.out.println("Volumen: "+volumen);
	}
	public void apagar() {
		if(encendido) {
			//dosCifras();
			encendido=true;
		}	
	}
	public void subirVolumen(int volumen) {
		if(encendido=true) 
			this.volumen=volumen;
			if(volumen>30)
				throw new RuntimeException("El maximo volumen es 30");
	}							
	public void bajarVolumen(int volumen) {
		if(encendido=true) 
			this.volumen=volumen;
			if(volumen<0)
				throw new RuntimeException("El minimo volumen es 0");			
	}
	public void canalSig() {
		canal++;
		if(canal==49)
			canal=0;
	}
	public void canalAnt() {
		canal--;
		if(canal==0)
			canal=49;
	}
	public void canal0() {
		canal=0;
	}
	public void canal1() {
		canal=1;
	}
	public void canal2() {
		canal=2;
	}
	public void canal3() {
		canal=3;
	}
	public void canal4() {
		canal=4;
	}
	public void canal5() {
		canal=5;
	}
	public void canal6() {
		canal=6;
	}
	public void canal7() {
		canal=7;
	}
	public void canal8() {
		canal=8;
	}
	public void canal9() {
		canal=9;
	}
/*	public void dosCifras() {
		int cifra1,cifra2;
				
		do {
			System.out.print("Introduce primera cifra: ");
			cifra1=Entrada.readInt();
			if(cifra1<0 || cifra1>4)
				throw new RuntimeException("Cifra no valida");
			System.out.print("Introduce segunda cifra: ");
			cifra2=Entrada.readInt();		
		}while(encendido=true);
	}
*/	
}			