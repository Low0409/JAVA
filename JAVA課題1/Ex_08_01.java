import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Ex_08_01 {
	public static void main(String[] args) {
		try {
			String fileName = args[0];
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			int max = -1000000;
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] array = line.split(" ");
				int sum = 0;
				for (String s : array) {
					int n = Integer.parseInt(s);
					sum += n;
				}
				System.out.println(sum);
				max = (sum > max) ? sum : max;
			}
			System.out.println("max:" + max);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}