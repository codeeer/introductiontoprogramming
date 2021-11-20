package com.medipol.functions;
public class Audio {

	public static void main(String[] args) {
		double[] a = tone(440,1.5);
		StdAudio.play(a);
		
	}
	
	public static double [] tone ( double hz , double seconds ) {
		int SAMPLE_RATE = 44100 ;
		int N = ( int ) ( seconds * SAMPLE_RATE );
		double [] a = new double [ N + 1 ];
		for ( int i = 0 ; i <= N ; i ++) {
		a [ i ] = Math . sin ( 2 * Math . PI * i * hz / SAMPLE_RATE );
		}
		return a ;
	}
}
