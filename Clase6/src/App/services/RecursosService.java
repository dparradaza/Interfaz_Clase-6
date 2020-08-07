package App.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorAzul, colorGrisOscuro;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo,fontBotones;
    private Cursor cMano;
    private Border borderInferiorAzul, border;
    private ImageIcon iUsuario,iportada,iIconos;

    static private RecursosService servicio;

    private RecursosService(){
        colorAzul = new Color(78, 115, 223);
        colorGrisOscuro = new Color(80, 80, 80);
        
        fontTPrincipal = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
        fontBotones = new Font("Bitstream Vera Sans", Font.BOLD, 14);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
       
        cMano = new Cursor(Cursor.HAND_CURSOR);

		iUsuario = new ImageIcon("recursos/perfil.png");
		iportada = new ImageIcon("recursos/imagen-estadistica.png");
		iIconos = new ImageIcon("recursos/icons.png");
		
		border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.DARK_GRAY);
    }
    
  

    public static RecursosService getService(){
        if(servicio == null)
            servicio = new RecursosService();
        return servicio;
    }



	public Color getColorAzul() {
		return colorAzul;
	}



	public void setColorAzul(Color colorAzul) {
		this.colorAzul = colorAzul;
	}



	public Color getColorGrisOscuro() {
		return colorGrisOscuro;
	}



	public void setColorGrisOscuro(Color colorGrisOscuro) {
		this.colorGrisOscuro = colorGrisOscuro;
	}



	public Font getFontTPrincipal() {
		return fontTPrincipal;
	}



	public void setFontTPrincipal(Font fontTPrincipal) {
		this.fontTPrincipal = fontTPrincipal;
	}



	public Font getFontTitulo() {
		return fontTitulo;
	}



	public void setFontTitulo(Font fontTitulo) {
		this.fontTitulo = fontTitulo;
	}



	public Font getFontSubtitulo() {
		return fontSubtitulo;
	}



	public void setFontSubtitulo(Font fontSubtitulo) {
		this.fontSubtitulo = fontSubtitulo;
	}



	public Font getFontBotones() {
		return fontBotones;
	}



	public void setFontBotones(Font fontBotones) {
		this.fontBotones = fontBotones;
	}



	public Cursor getcMano() {
		return cMano;
	}



	public void setcMano(Cursor cMano) {
		this.cMano = cMano;
	}



	public Border getBorderInferiorAzul() {
		return borderInferiorAzul;
	}



	public void setBorderInferiorAzul(Border borderInferiorAzul) {
		this.borderInferiorAzul = borderInferiorAzul;
	}



	public Border getBorder() {
		return border;
	}



	public void setBorder(Border border) {
		this.border = border;
	}



	public ImageIcon getiUsuario() {
		return iUsuario;
	}



	public void setiUsuario(ImageIcon iUsuario) {
		this.iUsuario = iUsuario;
	}



	public ImageIcon getIportada() {
		return iportada;
	}



	public void setIportada(ImageIcon iportada) {
		this.iportada = iportada;
	}



	public ImageIcon getiIconos() {
		return iIconos;
	}



	public void setiIconos(ImageIcon iIconos) {
		this.iIconos = iIconos;
	}



	public static RecursosService getServicio() {
		return servicio;
	}



	public static void setServicio(RecursosService servicio) {
		RecursosService.servicio = servicio;
	}
    
    
    
}