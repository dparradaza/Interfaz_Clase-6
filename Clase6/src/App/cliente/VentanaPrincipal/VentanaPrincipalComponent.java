package App.cliente.VentanaPrincipal;

import javax.swing.JFrame;

public class VentanaPrincipalComponent extends JFrame {
private VentanaPrincipalTemplate vistaPrincipalTemplate;
	public VentanaPrincipalComponent(){
        this.vistaPrincipalTemplate= new VentanaPrincipalTemplate(this);
        vistaPrincipalTemplate.setName("Vista Principal");
    }

	public VentanaPrincipalTemplate getVistaPrincipalTemplate() {
		return this.vistaPrincipalTemplate;
	}
}
