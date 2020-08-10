package App.cliente.VentanaPrincipal;

import javax.swing.JFrame;

import App.cliente.componentes.busqueda.BusquedaComponent;
import App.cliente.componentes.navegacion.navegacionComponent;
import App.cliente.login.LoginComponent;

public class VentanaPrincipalComponent  {

    private VentanaPrincipalTemplate vistaPrincipalTemplate;

    //Declaración Componentes
    private BusquedaComponent barraTituloComponent;
    private navegacionComponent navegacionUsuarioComponent;


    private LoginComponent loginComponent;

    public LoginComponent getLoginComponent() {
		return loginComponent;
	}

	public void setLoginComponent(LoginComponent loginComponent) {
		this.loginComponent = loginComponent;
	}

	public VentanaPrincipalComponent(LoginComponent loginComponent){
        this.loginComponent = loginComponent;
        this.vistaPrincipalTemplate= new VentanaPrincipalTemplate(this);
        
        this.navegacionUsuarioComponent = new navegacionComponent(this);
        this.barraTituloComponent = new BusquedaComponent();

        vistaPrincipalTemplate.getPNavegacion().add(
            navegacionUsuarioComponent.getNavegacionUsuarioTemplate()
        );
        vistaPrincipalTemplate.getPBarra().add(
        		barraTituloComponent.getBarraTituloTemplate()
        		);
    }

    public VentanaPrincipalTemplate getVistaPrincipalTemplate(){
        return this.vistaPrincipalTemplate;
    }

    public void mostrarComponente(String comando){
        vistaPrincipalTemplate.getPPrincipal().removeAll();
        switch(comando){
            case "Inicio":
               
                break;
            case "Perfil":
               
                break;
            case "Amigos":
              
                break;
            case "Productos":
                
                break;
            case "Configuraciones":
               
                break;
            case "Cerrar Sesión":
                this.loginComponent.getLoginTemplate().setVisible(true);
                this.vistaPrincipalTemplate.setVisible(false);
                break;
        }
        vistaPrincipalTemplate.repaint();
    }
}