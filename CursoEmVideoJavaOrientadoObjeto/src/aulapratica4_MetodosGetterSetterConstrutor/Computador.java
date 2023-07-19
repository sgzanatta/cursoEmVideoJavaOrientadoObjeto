package aulapratica4_MetodosGetterSetterConstrutor;

public class Computador {
		String placaDeVideo;
		String processador;
		int memoria;
		int ssd;
		int cooler;
		String gabinete;
		
		public Computador() {
			this.placaDeVideo = "GTX1660";
			this.processador = "Ryzen 5600x";
			this.memoria = 16;
			this.ssd = 250;
			this.cooler = 4;
			this.gabinete = "Sharkon";
			}
		
		public String getPlacaDeVideo() {
			return placaDeVideo;
		}
		public void setPlacaDeVideo(String placaDeVideo) {
			this.placaDeVideo = placaDeVideo;
		}
		public String getProcessador() {
			return processador;
		}
		public void setProcessador(String processador) {
			this.processador = processador;
		}
		public int getMemoria() {
			return memoria;
		}
		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}
		public int getSsd() {
			return ssd;
		}
		public void setSsd(int ssd) {
			this.ssd = ssd;
		}
		public int getCooler() {
			return cooler;
		}
		public void setCooler(int cooler) {
			this.cooler = cooler;
		}
		public String getGabinete() {
			return gabinete;
		}
		public void setGabinete(String gabinete) {
			this.gabinete = gabinete;
		}
		
		public void status () {
			System.out.println("Nome da glaca de video :" + this.placaDeVideo);
			System.out.println("Processador : "+ this.processador);
			System.out.println("Quanto de memoria : " + this.memoria);
			System.out.println("Quanto de ssd : " + this.ssd);
			System.out.println("Quantos cooler tem : " + this.cooler);
			System.out.println("Marcar do gabinete : " + this.gabinete);
		}
}
