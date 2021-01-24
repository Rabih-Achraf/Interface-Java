import java.text.DecimalFormat;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MainInterface {

	public static void main(String[] args) {
		
		Employer E1 = new Employer("achraf", "rabih", 300.2);
		Produit5 P1 = new Produit5("Redmi Note 9", 1600, 55);
		
		Interface A[] = {E1,P1};
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		
	}
	
	
	
}
