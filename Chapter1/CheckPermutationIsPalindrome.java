public class CheckPermutationIsPalindrome {

	public boolean ifStringisPalindrome(String string) {
		int[] table = createCharFrequencyTable(string); 
		return checkIfValidPalindrome(table);
	}

	public boolean checkIfValidPalindrome(int[] table){

		int oddCounter = 0;
		for (int x: table.length()){

			if (table[x]%2 ==1){
				oddCounter ++;
			}

			x ++;
		}

		if (oddCounter >1 ){

			return false;
		}

		return true;
	}

	public int[] createCharFrequencyTable(String string) {

		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];
		// essentially gives int array with index of 26 int[26]

		for (Character char : string.toCharArray) {

			int x = getCharNumber(char);

			if (x != -1) {

				table[x]++;
			}
			
		}

		return table; 
	}

	public int getCharNumber(Character char) {

		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

		int val = Character.getNumericValue(val);

		if (val >=a && val <=z) {

			return val -a;
		}

		return -1;
	}

	
}