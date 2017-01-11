public enum Suit {

		SPADES(1),HEARTS(2),CLUBS(3),DIAMONDS(4);
		private int value;

		protected Suit(int v) {

			this.value = v;
		}	

		public int getValue() {

			return value;
		}

		public static Suit getSuitFromValue(int value) {
			switch (value) {

				case 1:
						return Suit.SPADES;

				case 2: 
						return Suit.HEARTS;

				case 3:
						return Suit.CLUBS;

				case 4:
						return Suit.DIAMONDS;

				default:
						return null;

			}

		}
}



