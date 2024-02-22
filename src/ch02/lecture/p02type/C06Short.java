package ch02.lecture.p02type;

public class C06Short {
	public static void main(String[] args) {
		int o = 0x1f607;
		char[] emoji1 = Character.toChars(o);
		String emojis = new String(emoji1);
		System.out.println("emojis = " + emojis);

		}

	}
