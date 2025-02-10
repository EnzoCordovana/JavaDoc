package javadoc;

public class Main {
	public static void main(String[] args) {
		Account myAccount = new Account(57, "BNK", "enzo.cordovana@etu.univ-amu.fr");
		System.out.println(myAccount.getEmail());
		System.out.println(myAccount);
	}
}
