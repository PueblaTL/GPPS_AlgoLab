package ar.edu.unrn.GPPS.main;

import java.awt.EventQueue;

import ar.edu.unrn.GPPS.api.IApi;
import ar.edu.unrn.GPPS.api.MemoryApi;
import ar.edu.unrn.GPPS.gui.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					IApi api = new MemoryApi();
					VentanaPrincipal frame = new VentanaPrincipal(api);

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
