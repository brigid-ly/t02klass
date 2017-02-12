public class Silinder{
	double r, h, m;

	public Silinder(double raadius, double k6rgus, double mass){
		if(raadius<=0){throw new RuntimeException("Sobimatu raadius");}
		if(k6rgus<=0){throw new RuntimeException("Sobimatu k6rgus");}
		if(mass <= 0){throw new RuntimeException("Sobimatu mass");}
		r=raadius;
		h=k6rgus;
        m = mass;
	}

	public double tihedus() {
        double ruumala = ruumala();
        double tihedus = m / ruumala;

		return kaksKomaKohta( tihedus );
	}

	public double ruumala(){
		return kaksKomaKohta( Math.PI*h*Math.pow(r, 2) );
	}

	public double pindala(){
		return kaksKomaKohta( 2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*h );
	}

	public double kylgpindala(){
		return kaksKomaKohta( 2*Math.PI*r*h );
	}

	public double kaksKomaKohta( double arv ){
        arv = Math.round( arv * 100 );
        arv = arv / 100;

		return arv;
	}

	public String toString(){
			return "Silindri ruumala on " + ruumala() + " kuupsentimeetrit, pindala on " + pindala() + " ruutsentimeetrit ja kylgpindala on " + kylgpindala() + " ruutsentimeetrit, tihedus on " + tihedus();
	}

}
