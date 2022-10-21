package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClaseAltaFacha;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private ClaseAltaFacha a;
	private View gui;
	
	public Controller() {
		a = new ClaseAltaFacha();
		gui = new View(this);

		gui.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {
			String resultado1 = a.getY().procesarDatoClaseY(gui.getPanelEntrada().getTxtNumero().getText());
			gui.getPanelResultados().getTxtMonto().setText(resultado1);
		}
		
		if (evento.getActionCommand().equals(gui.getPanelEntrada().PROCESAR)) {
			String resultado2 = a.mostrarMensajeProcesar(gui.getPanelEntrada().getTxtNumero().getText());
			gui.getPanelResultados().getTxtMonto().setText(resultado2);
		}
	}
}
