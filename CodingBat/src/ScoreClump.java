public class ScoreClump {
	private static int[] scores = { 2,4,4,7 };
	private static boolean result= false;

	public static void main(String[] args) {
		scoresClump(scores);
	}

	public static boolean scoresClump(int[] scores) {
		int len= scores.length;
		for (int i=0; i<=len-3; i++){
			System.out.println("1: " + scores[i]);
			System.out.println("2: " + scores[i+1]);
			System.out.println("3: " + scores[i+2]);
			System.out.println(scores[i+1]-scores[i]);
			System.out.println(scores[i+2]-scores[i+2]);
			System.out.println(scores[i+2]-scores[i]);
			if ((scores[i+1]-scores[i])<3 && (scores[i+2]-scores[i+1])<3 && (scores[i+2]-scores[i])<3){result = true;System.out.println(result);}
			else {result = false;System.out.println(result);}
		}
		System.out.println(result);
		return result;
	}
}
