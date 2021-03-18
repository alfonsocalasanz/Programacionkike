import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void creaPdf(String destino ) throws FileNotFoundException {
	try {
	PdfWriter writer = new PdfWriter(destino);	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}
}
