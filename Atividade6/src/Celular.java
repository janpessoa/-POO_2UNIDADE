
public class Celular implements Processador, SmartPhone, Bateria {

	private boolean carregado;
	private int porcentagem;
	private String marca; 
	private int quantCameras;
	
	
	
	public Celular(String marca, int quantCameras) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setQuantCameras(quantCameras);
		this.setPorcentagem(0);
	}
	
	
	
	@Override
	public int getMAH() {
		return 5000;
	}

	@Override
	public void carregar() {
		System.out.println("Celular carregado!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "Oled";
	}

	@Override
	public String getTipoSmartPhone() {
		return "Iphone";
	}

	@Override
	public String getModeloProcessador() {
		return "A13Bionic";
	}

	@Override
	public String getPotencia() {
		return "5G";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantCameras() {
		return quantCameras;
	}

	public void setQuantCameras(int quantCameras) {
		this.quantCameras = quantCameras;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}



	@Override
	public String toString() {
		return "Celular [carregado=" + carregado + ", porcentagem=" + porcentagem + ", marca=" + marca
				+ ", quantCameras=" + quantCameras + "]";
	}



	

	
	
	
	

	
}
