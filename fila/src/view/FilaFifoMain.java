package view;

import controller.FilaFifoController;

public class FilaFifoMain{
	public static void main(String[] args){
		try{
			FilaFifoController obj = new FilaFifoController();
			System.out.println(obj.teste());
		}catch( Exception e){
			e.printStackTrace();
		}
	}
}