public class StringCompression{
	

	public String getCompressedString (String string) {


		Char[] array = string.toCharArray();
		Char[] compressedArray = new Char[];
		int i,counter=0;

		for (i=0;i<array.size();i++){

			if (array[i] != array[i-1]) {

				if (compressedArray != null){
					compressedArray[i] = (Char) counter;
				}
				
				Char temp = array[i];
				compressedArray[i] = temp;

			} else {

				if (i!=0) {
					counter++;

				}

			}
		}

		String compressedString = String.valueOf(compressedArray);

		return compressedString.length() < string.length ? compressedString : string
	}
}