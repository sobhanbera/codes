public class Problem31 {
	public static void main(String[] args) {
		int num = 200;
		int way = 0;
		for(int i = num; i >= 0; i -= 200){
			for(int j = i; j >= 0; j -= 100){
				for(int k = j; k >= 0; k -= 50){
					for(int l = k; l >= 0; l -= 20){
						for(int m = l; m >= 0; m -= 10){
							for(int n = m; n >= 0; n -= 5){
								for(int p = n; p >= 0; p -= 2){
									++way;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(way);
	}
}