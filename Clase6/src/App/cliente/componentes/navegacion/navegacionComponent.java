package App.cliente.componentes.navegacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import App.cliente.VentanaPrincipal.VentanaPrincipalComponent;

public class navegacionComponent implements ActionListener {

    private NavegacionTemplate navegacionUsuarioTemplate;
    private VentanaPrincipalComponent vistaPrincipalComponent;

    public navegacionComponent(VentanaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        this.navegacionUsuarioTemplate =  new NavegacionTemplate(this);
    }

    
    public NavegacionTemplate getNavegacionUsuarioTemplate() {
        return this.navegacionUsuarioTemplate;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		//this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim())
		
	}
}