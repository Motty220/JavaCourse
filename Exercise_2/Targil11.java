public class Targil11 {
    public static void main(String[] args) {
 	Float d = 0.0f;
	Float b = 0.0f;
	int max = 0;
	int s = 0;
	for (int i = 1; i < 11; i++){
		int rnd = (int)(Math.random()* 100);
		System.out.println("For the " + i + " run: " + rnd);
		d = (rnd + d);
		for(int e = 1; e < 11; e++){
			max = Math.max(rnd, max);
		}
		if (rnd%2 == 0){
		s++;
	}
}

		b = d/10;
		System.out.println("The average: " + b);
		System.out.println("The highest number: " + max);
		System.out.println("The number of even digits: " + s);		
	}
}